package com.macro.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@SpringBootApplication
public class MallAdminApplication {
    private static ApplicationContext applicationContext;
    private PasswordEncoder passwordEncoder;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(MallAdminApplication.class, args);
        passwordEncoder = (PasswordEncoder)applicationContext.getBean("passwordEncoder");
        System.out.println("Admin: hash pass:"+passwordEncoder.encode("admin"));
    }
}
