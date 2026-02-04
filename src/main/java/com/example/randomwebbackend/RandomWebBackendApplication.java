package com.example.randomwebbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 核心注解：扫描 mapper 包下的所有接口，创建对应的 Bean
// 告诉 MyBatis-Plus 「扫描 com.example.randomwebbackend.mapper 包下的所有接口，将它们注册为 MyBatis 的 Mapper Bean，同时交给 Spring 管理」。
@MapperScan("com.example.randomwebbackend.mapper")

// 这是 Spring Boot 最核心的注解，它是一个「组合注解」，包含了 3 个关键注解的功能
@SpringBootApplication
public class RandomWebBackendApplication {

    public static void main(String[] args) {
        // 告诉 Spring Boot 「以当前类为核心配置类，启动整个应用上下文」，并传递命令行参数 args。
        SpringApplication.run(RandomWebBackendApplication.class, args);
    }

    // 可选：MyBatis-Plus 分页插件（暂时注释，等依赖更新后再启用）
    // @Bean
    // public MybatisPlusInterceptor mybatisPlusInterceptor() {
    //     MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    //     interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
    //     return interceptor;
    // }

}





