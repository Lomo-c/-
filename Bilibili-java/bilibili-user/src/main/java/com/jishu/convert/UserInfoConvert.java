package com.jishu.convert;

import com.jishu.entity.UserInfo;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.UserInfoVO;
import com.jishu.vo.create.UserInfoCreateVO;
import com.jishu.vo.update.UserInfoUpdateVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 用户信息
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface UserInfoConvert {

    UserInfoConvert INSTANCE = Mappers.getMapper(UserInfoConvert.class);

    UserInfo convert(UserInfoCreateVO createVO);

    UserInfo convert(UserInfoUpdateVO updateVO);

    UserInfoVO convert(UserInfo po);

    PageResult<UserInfoVO> convert(PageResult<UserInfo> pageResult);

}
