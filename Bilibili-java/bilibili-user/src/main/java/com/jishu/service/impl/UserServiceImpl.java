package com.jishu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jishu.domain.User_info;
import com.jishu.service.IUserService;
import com.jishu.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User_info>
    implements IUserService {

}




