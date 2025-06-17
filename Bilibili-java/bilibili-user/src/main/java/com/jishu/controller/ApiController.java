package com.jishu.controller;

import com.jishu.domain.Menuitems;
import com.jishu.service.IMenuitemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private IMenuitemsService menuitemsService;
    @RequestMapping("/api")
    public String controllertest(){
        return "ok";
    }

    @RequestMapping("/api/sidebar")
    public List<Menuitems> getSidebarRoutes() {
        return menuitemsService.list();
    }
}
