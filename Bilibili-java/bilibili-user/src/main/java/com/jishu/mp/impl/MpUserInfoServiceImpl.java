package com.jishu.mp.impl;

import com.jishu.entity.UserInfoEntity;
import com.jishu.mapper.IUserInfoMapper;
import com.jishu.mp.IMpUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author <a href="https://fengwenyi.com?fs=mpcg">Ji shu</a>
 * @since 2025-06-17
 */
@Service
public class MpUserInfoServiceImpl extends ServiceImpl<IUserInfoMapper, UserInfoEntity> implements IMpUserInfoService {

}
