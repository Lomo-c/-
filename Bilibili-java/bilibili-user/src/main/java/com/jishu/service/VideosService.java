package com.jishu.service;

import com.jishu.entity.Videos;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.create.VideosCreateVO;
import com.jishu.vo.page.VideosPageVO;
import com.jishu.vo.update.VideosUpdateVO;

/**
 *  服务类
 *
 * @author Jishu
 * @since 2025/06/18
 */
public interface VideosService {

    /**
     * 新建
     *
     * @param createVO 新建VO
     * @return id
     */
    Long create(VideosCreateVO createVO);

    /**
     * 更新
     *
     * @param updateVO 更新VO
     */
    void update(VideosUpdateVO updateVO);

    /**
     * 删除
     *
     * @param id id
     */
    void delete(Long id);

    /**
     * 查询单个
     *
     * @param id id
     * @return po
     */
    Videos get(Long id);

    /**
     * 分页查询
     *
     * @param pageVO 分页VO
     * @return pageResult
     */
    PageResult<Videos> page(VideosPageVO pageVO);

}
