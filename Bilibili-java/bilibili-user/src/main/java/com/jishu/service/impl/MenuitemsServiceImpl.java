package com.jishu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jishu.domain.Menultems;
import com.jishu.mapper.MenuitemsMapper;
import com.jishu.service.IMenuitemsService;
import org.springframework.stereotype.Service;

@Service
public class MenuitemsServiceImpl extends ServiceImpl<MenuitemsMapper, Menultems> implements IMenuitemsService {
} 