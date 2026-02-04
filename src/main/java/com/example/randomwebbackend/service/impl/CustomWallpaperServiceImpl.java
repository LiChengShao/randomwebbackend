package com.example.randomwebbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.randomwebbackend.entity.CustomWallpaper;
import com.example.randomwebbackend.mapper.CustomWallpaperMapper;
import com.example.randomwebbackend.service.CustomWallpaperService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service
public class CustomWallpaperServiceImpl implements CustomWallpaperService {

    @Resource
    private CustomWallpaperMapper customWallpaperMapper;

    @Override
    public CustomWallpaper getRandomWallpaper() {
        // 1. 查询所有壁纸
        QueryWrapper<CustomWallpaper> queryWrapper = new QueryWrapper<>();
        List<CustomWallpaper> wallpaperList = customWallpaperMapper.selectList(queryWrapper);

        // 2. 判空
        if (wallpaperList == null || wallpaperList.isEmpty()) {
            return null;
        }

        // 3. 随机选取一张壁纸
        Random random = new Random();
        int randomIndex = random.nextInt(wallpaperList.size());
        return wallpaperList.get(randomIndex);
    }
}