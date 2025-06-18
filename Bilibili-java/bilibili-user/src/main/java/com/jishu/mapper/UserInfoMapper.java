package com.jishu.mapper;

import com.jishu.entity.UserInfo;
import com.jishu.generator.mybatis.BaseMapperX;
import com.jishu.generator.mybatis.LambdaQueryWrapperX;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.page.UserInfoPageVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息 Mapper 接口
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface UserInfoMapper extends BaseMapperX<UserInfo> {

    default PageResult<UserInfo> selectPage(UserInfoPageVO pageVO) {
        return selectPage(pageVO, new LambdaQueryWrapperX<UserInfo>());
    }
}
