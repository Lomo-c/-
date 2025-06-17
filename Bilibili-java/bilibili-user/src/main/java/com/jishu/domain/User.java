package com.jishu.domain;


import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息
 * @TableName user_info
 */
public class User implements Serializable {

    /**
     * 用户id
     */
    private String user_id;
    /**
     * 昵称
     */
    private String nick_name;
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
    private Integer sex;
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
    private String person_introduction;
    /**
     * 加入时间
     */
    private Date join_time;
    /**
     * 最后登录时间
     */
    private Date last_login_time;
    /**
     * 最后登录IP
     */
    private String last_login_ip;
    /**
     * 0:禁用 1:正常
     */
    private Integer status;
    /**
     * 空间公告
     */
    private String notice_info;
    /**
     * 投币总数量
     */
    private Integer current_coin_count;
    /**
     * 当前硬币数
     */
    private Integer total_coin_count;
    /**
     * 主题
     */
    private Integer theme;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_id() {
        return this.user_id;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }
    public String getNick_name() {
        return this.nick_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Integer getSex() {
        return this.sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public String getSchool() {
        return this.school;
    }

    public void setPerson_introduction(String person_introduction) {
        this.person_introduction = person_introduction;
    }
    public String getPerson_introduction() {
        return this.person_introduction;
    }

    public void setJoin_time(Date join_time) {
        this.join_time = join_time;
    }
    public Date getJoin_time() {
        return this.join_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }
    public Date getLast_login_time() {
        return this.last_login_time;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }
    public String getLast_login_ip() {
        return this.last_login_ip;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getStatus() {
        return this.status;
    }

    public void setNotice_info(String notice_info) {
        this.notice_info = notice_info;
    }
    public String getNotice_info() {
        return this.notice_info;
    }

    public void setCurrent_coin_count(Integer current_coin_count) {
        this.current_coin_count = current_coin_count;
    }
    public Integer getCurrent_coin_count() {
        return this.current_coin_count;
    }

    public void setTotal_coin_count(Integer total_coin_count) {
        this.total_coin_count = total_coin_count;
    }
    public Integer getTotal_coin_count() {
        return this.total_coin_count;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }
    public Integer getTheme() {
        return this.theme;
    }

}
