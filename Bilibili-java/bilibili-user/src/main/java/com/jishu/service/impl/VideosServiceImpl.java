package com.jishu.service.impl;

import com.jishu.dto.VideoCardDTO;
import com.jishu.entity.UserInfoEntity;
import com.jishu.entity.VideosEntity;
import com.jishu.mapper.IUserInfoMapper;
import com.jishu.mapper.IVideosMapper;
import com.jishu.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class VideosServiceImpl implements IVideosService {

    @Autowired
    private IVideosMapper videosMapper;

    @Autowired
    private IUserInfoMapper userInfoMapper;

    @Override
    public List<VideoCardDTO> listForCards() {
        // 1. 查询所有视频
        List<VideosEntity> videos = videosMapper.selectList(null);
        if (videos.isEmpty()) {
            return Collections.emptyList();
        }

        // 2. 查询所有相关的作者信息
        List<Long> authorIds = videos.stream()
                .map(VideosEntity::getAuthorId)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());

        Map<Long, UserInfoEntity> authorMap;
        if (!authorIds.isEmpty()) {
            List<UserInfoEntity> authors = userInfoMapper.selectBatchIds(authorIds);
            authorMap = authors.stream()
                    .collect(Collectors.toMap(UserInfoEntity::getId, Function.identity()));
        } else {
            authorMap = Collections.emptyMap();
        }

        // 3. 组装DTO
        return videos.stream().map(video -> {
            VideoCardDTO dto = new VideoCardDTO();
            dto.setId(video.getId());
            dto.setTitle(video.getTitle());
            dto.setThumbnailUrl(video.getThumbnailUrl());

            // 格式化数据
            dto.setDuration(formatDuration(video.getDuration()));
            dto.setViews(formatViews(video.getViews()));
            dto.setUploadDate(formatUploadDate(video.getUploadDate().atZone(ZoneId.systemDefault()).toInstant()));

            // 填充作者信息
            if (video.getAuthorId() != null && authorMap.containsKey(video.getAuthorId())) {
                UserInfoEntity author = authorMap.get(video.getAuthorId());
                dto.setAuthorName(author.getNickName());
                dto.setAuthorAvatar(author.getAvatar());
            } else {
                dto.setAuthorName("匿名作者");
            }
            return dto;
        }).collect(Collectors.toList());
    }

    private String formatDuration(Integer totalSeconds) {
        if (totalSeconds == null || totalSeconds <= 0) {
            return "00:00";
        }
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private String formatViews(Integer views) {
        if (views == null || views < 0) {
            return "0.0";
        }
        if (views < 10000) {
            return String.format("%.1f", (double)views);
        }
        return String.format("%.1f万", views / 10000.0);
    }

    private String formatUploadDate(Instant uploadDate) {
        long days = Duration.between(uploadDate, Instant.now()).toDays();
        if (days == 0) {
            return "今天";
        }
        if (days < 30) {
            return days + "天前";
        }
        if (days < 365) {
            return (days / 30) + "个月前";
        }
        return (days / 365) + "年前";
    }
} 