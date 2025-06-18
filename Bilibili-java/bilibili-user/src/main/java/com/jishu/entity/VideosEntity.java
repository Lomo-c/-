package com.jishu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author <a href="https://fengwenyi.com?fs=mpcg">Ji shu</a>
 * @since 2025-06-17
 */
@Data
@TableName("videos")
public class VideosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String thumbnailUrl;

    /**
     * 视频时长，单位：秒
     */
    private Integer duration;

    private String title;

    private Integer views;

    /**
     * 视频作者ID，关联user_info表
     */
    private Long authorId;

    /**
     * 上传时间
     */
    private LocalDateTime uploadDate;

    private Date createdAt;

    private Date updatedAt;
}
