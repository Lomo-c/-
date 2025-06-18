package com.jishu.controller;

import com.jishu.entity.MenuItemsEntity;
import com.jishu.mapper.IMenuItemsMapper;
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
@RequestMapping("/routes")
public class MenuItemsController {

    @Autowired
    private IMenuItemsMapper menuItemsMapper;

    @GetMapping("/list")
    public List<MenuItemsEntity> list() {
        return menuItemsMapper.selectList(null);
    }

}
