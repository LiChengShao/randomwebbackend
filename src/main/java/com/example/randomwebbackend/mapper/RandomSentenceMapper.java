package com.example.randomwebbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.randomwebbackend.entity.RandomSentence;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 标记为MyBatis Mapper接口，SpringBoot自动扫描
public interface RandomSentenceMapper extends BaseMapper<RandomSentence> {
    // 基础CRUD方法由BaseMapper提供，无需额外编写
}