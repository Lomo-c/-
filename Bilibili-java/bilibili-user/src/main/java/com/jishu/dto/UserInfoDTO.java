package com.jishu.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 0:女 1:男 2:沃尔玛购物袋
     */
    private Boolean sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 学校
     */
    private String school;

    /**
     * 个人简介
     */
    private String personIntroduction;

    /**
     * 加入时间
     */
    private LocalDateTime joinTime;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 最后登录IP
     */
    private String lastLoginIp;

    /**
     * 0:禁用 1:正常
     */
    private Boolean status;

    /**
     * 空间公告
     */
    private String noticeInfo;

    /**
     * 投币总数量
     */
    private Integer currentCoinCount;

    /**
     * 当前硬币数
     */
    private Integer totalCoinCount;

    /**
     * 主题
     */
    private Boolean theme;
}
