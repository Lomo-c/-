package com.jishu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jishu.domain.Menuitems;
import com.jishu.service.IMenuitemsService;
import com.jishu.mapper.MenuitemsMapper;
import org.springframework.stereotype.Service;

@Service
public class MenuitemsServiceImpl extends ServiceImpl<MenuitemsMapper, Menuitems>
    implements IMenuitemsService {

}




