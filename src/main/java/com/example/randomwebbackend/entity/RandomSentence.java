package com.example.randomwebbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data // Lombok注解，自动生成get/set/toString等方法
@TableName("random_sentence") // 对应数据库表名
public class RandomSentence {
    @TableId(type = IdType.AUTO) // 主键自增
    private Long id; // 对应数据库id字段
    private String sentenceContent; // 对应数据库sentence_content字段（下划线转驼峰）
    private LocalDateTime createTime; // 对应数据库create_time字段
}