package com.jishu.domain;
import java.io.Serializable;

/**
 * 
 * @TableName menultems
 */
public class Menuitems implements Serializable {

    private Integer id;
    /**
     * 路由
     */
    private String to;
    /**
     * 标签名
     */
    private String tabel;
    /**
     * 图标
     */
    private String icon;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }

    public void setTo(String to) {
        this.to = to;
    }
    public String getTo() {
        return this.to;
    }

    public void setTabel(String tabel) {
        this.tabel = tabel;
    }
    public String getTabel() {
        return this.tabel;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return this.icon;
    }

}
