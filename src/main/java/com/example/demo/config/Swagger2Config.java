package com.example.demo.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yinyin
 * @create 2021/07/26 下午 3:28
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket webApiConfig(){
        return   new  Docket(DocumentationType.SWAGGER_2)
                  .groupName("sysApi")
                  .apiInfo(sysApiInfo())
                  .select()
                  .paths(PathSelectors.any())
                  .build();
    }


    private ApiInfo sysApiInfo(){
        return  new ApiInfoBuilder().title("系统网站Api文档")
                .description("本文档描述了网站api接口定义")
                .version("1.0")
                .contact(new Contact("Marvin","http:www.baidu.com","marvintian518@163.com"))
                .build();
    }
}
