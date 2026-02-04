package com.example.randomwebbackend.controller;

import com.example.randomwebbackend.entity.CustomWallpaper;
import com.example.randomwebbackend.service.CustomWallpaperService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import javax.annotation.Resource;
import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/wallpaper")
@CrossOrigin(origins = "*")
public class CustomWallpaperController {

    @Resource
    private CustomWallpaperService customWallpaperService;

    // 接口路径：http://localhost:8888/api/wallpaper/random
    @GetMapping("/random")
    public CustomWallpaper getRandomWallpaper() {
        return customWallpaperService.getRandomWallpaper();
    }
}