package com.jishu.mapper;

import com.jishu.domain.User_info;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *  用户信息 数据库操作接口
 * */

@Mapper
public interface UserMapper extends BaseMapper<User_info> {

}




