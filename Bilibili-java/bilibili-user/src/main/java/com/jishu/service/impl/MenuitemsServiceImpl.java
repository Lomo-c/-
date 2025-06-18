package com.jishu.service.impl;

import com.jishu.convert.MenuitemsConvert;
import com.jishu.entity.Menuitems;
import com.jishu.generator.pojo.PageResult;
import com.jishu.mapper.MenuitemsMapper;
import com.jishu.service.MenuitemsService;
import com.jishu.vo.create.MenuitemsCreateVO;
import com.jishu.vo.page.MenuitemsPageVO;
import com.jishu.vo.update.MenuitemsUpdateVO;
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
public class MenuitemsServiceImpl implements MenuitemsService {

    private final MenuitemsMapper menuitemsMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long create(MenuitemsCreateVO createVO) {
        Menuitems menuitems = MenuitemsConvert.INSTANCE.convert(createVO);
        menuitemsMapper.insert(menuitems);
        return menuitems.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(MenuitemsUpdateVO updateVO) {
        Menuitems menuitems = MenuitemsConvert.INSTANCE.convert(updateVO);
        menuitemsMapper.updateById(menuitems);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        menuitemsMapper.deleteById(id);
    }

    @Override
    public Menuitems get(Long id) {
        return menuitemsMapper.selectById(id);
    }

    @Override
    public PageResult<Menuitems> page(MenuitemsPageVO pageVO) {
        return menuitemsMapper.selectPage(pageVO);
    }

}
