package com.jishu.dto;

import lombok.Data;

@Data
public class VideoCardDTO {

    private Integer id;
    private String title;
    private String thumbnailUrl;
    private String duration; // 格式化为 "MM:ss"
    private String views; // 格式化为 "xx万"
    private String uploadDate; // 格式化为 "x天前"
    private String authorName;
    private String authorAvatar;
} 