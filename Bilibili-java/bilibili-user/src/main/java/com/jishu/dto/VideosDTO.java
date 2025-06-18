package com.jishu.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class VideosDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String thumbnailUrl;

    /**
     * 格式为HH:MM或MM:SS
     */
    private String duration;

    private String title;

    private Integer views;

    /**
     * 存储显示的格式如"70.4万次播放"
     */
    private String viewsDisplay;

    private LocalDate uploadDate;

    /**
     * 存储显示的格式如"4天前"
     */
    private String uploadDateDisplay;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
