package com.example.randomwebbackend.service;

import com.example.randomwebbackend.entity.RandomSentence;

public interface RandomSentenceService {
    // 获取随机一句文案
    RandomSentence getRandomSentence();
}