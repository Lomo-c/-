package com.jishu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jishu.generator.pojo.BasePO;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("videos")
public class Videos extends BasePO {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("thumbnail_url")
    private String thumbnailUrl;

    /**
     * 格式为HH:MM或MM:SS
     */
    @TableField("duration")
    private String duration;

    @TableField("title")
    private String title;

    @TableField("views")
    private Integer views;

    /**
     * 存储显示的格式如"70.4万次播放"
     */
    @TableField("views_display")
    private String viewsDisplay;

    @TableField("upload_date")
    private LocalDate uploadDate;

    /**
     * 存储显示的格式如"4天前"
     */
    @TableField("upload_date_display")
    private String uploadDateDisplay;

    @TableField("created_at")
    private LocalDateTime createdAt;

    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
