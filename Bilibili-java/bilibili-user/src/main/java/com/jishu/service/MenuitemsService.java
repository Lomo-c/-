package com.jishu.service;

import com.jishu.entity.Menuitems;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.create.MenuitemsCreateVO;
import com.jishu.vo.page.MenuitemsPageVO;
import com.jishu.vo.update.MenuitemsUpdateVO;

/**
 *  服务类
 *
 * @author Jishu
 * @since 2025/06/18
 */
public interface MenuitemsService {

    /**
     * 新建
     *
     * @param createVO 新建VO
     * @return id
     */
    Long create(MenuitemsCreateVO createVO);

    /**
     * 更新
     *
     * @param updateVO 更新VO
     */
    void update(MenuitemsUpdateVO updateVO);

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
    Menuitems get(Long id);

    /**
     * 分页查询
     *
     * @param pageVO 分页VO
     * @return pageResult
     */
    PageResult<Menuitems> page(MenuitemsPageVO pageVO);

}
