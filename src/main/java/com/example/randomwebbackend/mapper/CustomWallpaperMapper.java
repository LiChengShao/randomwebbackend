package com.example.randomwebbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.randomwebbackend.entity.CustomWallpaper;
import org.apache.ibatis.annotations.Mapper;

// 标记为MyBatis Mapper接口，SpringBoot自动扫描
@Mapper
public interface CustomWallpaperMapper extends BaseMapper<CustomWallpaper> {
    // 基础CRUD方法由BaseMapper提供，无需额外编写
}