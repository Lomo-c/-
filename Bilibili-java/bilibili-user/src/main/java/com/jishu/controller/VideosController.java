package com.jishu.controller;

import com.jishu.dto.VideoCardDTO;
import com.jishu.service.IVideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author <a href="https://fengwenyi.com?fs=mpcg">Ji shu</a>
 * @since 2025-06-17
 */
@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private IVideosService videosService;

    @GetMapping("/list")
    public List<VideoCardDTO> list() {
        return videosService.listForCards();
    }
}
