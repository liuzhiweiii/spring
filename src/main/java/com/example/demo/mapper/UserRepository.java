package com.example.demo.mapper;

import com.example.demo.untity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 这里可以添加自定义查询方法，如果需要的话
}
