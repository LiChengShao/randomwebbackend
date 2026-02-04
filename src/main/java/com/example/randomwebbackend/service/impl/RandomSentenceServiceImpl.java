package com.example.randomwebbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.randomwebbackend.entity.RandomSentence;
import com.example.randomwebbackend.mapper.RandomSentenceMapper;
import com.example.randomwebbackend.service.RandomSentenceService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service // 标记为Spring服务组件
public class RandomSentenceServiceImpl implements RandomSentenceService {

    @Resource // 注入Mapper接口（无需手动创建实现类，MyBatis-Plus自动代理）
    private RandomSentenceMapper randomSentenceMapper;

    @Override
    public RandomSentence getRandomSentence() {
        // 1. 查询所有文案
        QueryWrapper<RandomSentence> queryWrapper = new QueryWrapper<>();
        List<RandomSentence> sentenceList = randomSentenceMapper.selectList(queryWrapper);

        // 2. 判空（避免无数据时报错）
        if (sentenceList == null || sentenceList.isEmpty()) {
            return null;
        }

        // 3. 随机选取一个文案
        Random random = new Random();
        int randomIndex = random.nextInt(sentenceList.size());
        return sentenceList.get(randomIndex);
    }
}