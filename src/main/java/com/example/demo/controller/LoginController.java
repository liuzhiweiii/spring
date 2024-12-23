package com.example.demo.controller;

import com.example.demo.service.LoginUserService;
import com.example.demo.untity.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginUserService loginService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    // 登录处理
    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginUser user) {
        String cachedCaptcha = redisTemplate.opsForValue().get(user.getLoginName() + "_captcha");
        if (cachedCaptcha == null || !cachedCaptcha.equals(user.getCaptcha())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("验证码错误");
        }

        boolean success = loginService.login(user);
        if (success) {
            return ResponseEntity.ok("登录成功");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("无效的凭证");
        }
    }

    // 注册处理
    @CrossOrigin
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LoginUser user) {
        if (loginService.checkUserExists(user.getLoginName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("用户已存在");
        }
        loginService.register(user);
        return ResponseEntity.ok("Registration successful");
    }

    // 获取验证码，并返回图像
    @GetMapping("/captcha")
    public void getCaptcha(@RequestParam String loginName, HttpServletResponse response) throws IOException {
        Random random = new Random();
        String captcha = String.valueOf(random.nextInt(899999) + 100000);
        redisTemplate.opsForValue().set(loginName + "_captcha", captcha, 3000, TimeUnit.SECONDS);

        // 生成图像验证码
        int width = 160, height = 60;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.BLACK);
        g.drawString(captcha, 40, 35);
        g.dispose();

        // 设置响应内容类型为图像
        response.setContentType("image/png");
        ImageIO.write(image, "png", response.getOutputStream());
    }
}
