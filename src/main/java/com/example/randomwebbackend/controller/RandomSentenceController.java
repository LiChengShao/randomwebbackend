package com.example.randomwebbackend.controller;

import com.example.randomwebbackend.entity.RandomSentence;
import com.example.randomwebbackend.service.RandomSentenceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.annotation.Resource;

@RestController // 标记为REST接口，返回JSON数据（而非视图）
@RequestMapping("/api/sentence") // 接口统一前缀
@CrossOrigin(origins = "*") // 允许所有前端地址跨域访问（开发环境简化，生产环境需指定具体地址）
public class RandomSentenceController {

    @Resource
    private RandomSentenceService randomSentenceService;

    // 接口路径：http://localhost:8888/api/sentence/random
    @GetMapping("/random")
    public RandomSentence getRandomSentence() {
        return randomSentenceService.getRandomSentence();
    }
}