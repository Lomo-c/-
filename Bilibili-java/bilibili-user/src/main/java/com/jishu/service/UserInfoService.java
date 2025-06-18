package com.jishu.service;

import com.jishu.entity.UserInfo;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.create.UserInfoCreateVO;
import com.jishu.vo.page.UserInfoPageVO;
import com.jishu.vo.update.UserInfoUpdateVO;

/**
 * 用户信息 服务类
 *
 * @author Jishu
 * @since 2025/06/18
 */
public interface UserInfoService {

    /**
     * 新建
     *
     * @param createVO 新建VO
     * @return id
     */
    Long create(UserInfoCreateVO createVO);

    /**
     * 更新
     *
     * @param updateVO 更新VO
     */
    void update(UserInfoUpdateVO updateVO);

    /**
     * 删除
     *
     * @param id id
     */
    void delete(Long id);

    /**
     * 查询单个
     *
     * @param id id
     * @return po
     */
    UserInfo get(Long id);

    /**
     * 分页查询
     *
     * @param pageVO 分页VO
     * @return pageResult
     */
    PageResult<UserInfo> page(UserInfoPageVO pageVO);

}
