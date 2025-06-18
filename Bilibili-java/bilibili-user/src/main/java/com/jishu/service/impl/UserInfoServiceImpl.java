package com.jishu.service.impl;

import com.jishu.convert.UserInfoConvert;
import com.jishu.entity.UserInfo;
import com.jishu.generator.pojo.PageResult;
import com.jishu.mapper.UserInfoMapper;
import com.jishu.service.UserInfoService;
import com.jishu.vo.create.UserInfoCreateVO;
import com.jishu.vo.page.UserInfoPageVO;
import com.jishu.vo.update.UserInfoUpdateVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户信息 服务实现类
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long create(UserInfoCreateVO createVO) {
        UserInfo userInfo = UserInfoConvert.INSTANCE.convert(createVO);
        userInfoMapper.insert(userInfo);
        return userInfo.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(UserInfoUpdateVO updateVO) {
        UserInfo userInfo = UserInfoConvert.INSTANCE.convert(updateVO);
        userInfoMapper.updateById(userInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        userInfoMapper.deleteById(id);
    }

    @Override
    public UserInfo get(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public PageResult<UserInfo> page(UserInfoPageVO pageVO) {
        return userInfoMapper.selectPage(pageVO);
    }

}
