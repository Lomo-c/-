package com.jishu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author <a href="https://fengwenyi.com?fs=mpcg">Ji shu</a>
 * @since 2025-06-17
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_info")
public class UserInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private String userId;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 0:女 1:男 2:沃尔玛购物袋
     */
    @TableField("sex")
    private Boolean sex;

    /**
     * 出生日期
     */
    @TableField("birthday")
    private String birthday;

    /**
     * 学校
     */
    @TableField("school")
    private String school;

    /**
     * 个人简介
     */
    @TableField("person_introduction")
    private String personIntroduction;

    /**
     * 加入时间
     */
    @TableField("join_time")
    private LocalDateTime joinTime;

    /**
     * 最后登录时间
     */
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    /**
     * 最后登录IP
     */
    @TableField("last_login_ip")
    private String lastLoginIp;

    /**
     * 0:禁用 1:正常
     */
    @TableField("status")
    private Boolean status;

    /**
     * 空间公告
     */
    @TableField("notice_info")
    private String noticeInfo;

    /**
     * 投币总数量
     */
    @TableField("current_coin_count")
    private Integer currentCoinCount;

    /**
     * 当前硬币数
     */
    @TableField("total_coin_count")
    private Integer totalCoinCount;

    /**
     * 主题
     */
    @TableField("theme")
    private Boolean theme;
}
