package com.jishu.service.impl;

import com.jishu.convert.VideosConvert;
import com.jishu.entity.Videos;
import com.jishu.generator.pojo.PageResult;
import com.jishu.mapper.VideosMapper;
import com.jishu.service.VideosService;
import com.jishu.vo.create.VideosCreateVO;
import com.jishu.vo.page.VideosPageVO;
import com.jishu.vo.update.VideosUpdateVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *  服务实现类
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class VideosServiceImpl implements VideosService {

    private final VideosMapper videosMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long create(VideosCreateVO createVO) {
        Videos videos = VideosConvert.INSTANCE.convert(createVO);
        videosMapper.insert(videos);
        return videos.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(VideosUpdateVO updateVO) {
        Videos videos = VideosConvert.INSTANCE.convert(updateVO);
        videosMapper.updateById(videos);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        videosMapper.deleteById(id);
    }

    @Override
    public Videos get(Long id) {
        return videosMapper.selectById(id);
    }

    @Override
    public PageResult<Videos> page(VideosPageVO pageVO) {
        return videosMapper.selectPage(pageVO);
    }

}
