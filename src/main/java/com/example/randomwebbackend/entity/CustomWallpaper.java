    package com.example.randomwebbackend.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableName;
    import lombok.Data;
    import java.time.LocalDateTime;

    @Data
    @TableName("custom_wallpaper")
    public class CustomWallpaper {
        @TableId(type = IdType.AUTO)
        private Long id;
        private String wallpaperName;
        private String wallpaperUrl;
        private Integer isDefault;
        private LocalDateTime createTime;
    }