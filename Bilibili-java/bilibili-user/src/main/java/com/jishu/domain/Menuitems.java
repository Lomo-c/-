package com.jishu.domain;
import java.io.Serializable;

/**
 * 
 * @TableName menuitems
 */
public class Menuitems implements Serializable {

    private Integer id;
    private String redirect_url;
    /**
     * 标签名
     */
    private String label;
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

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }
    public String getRedirect_url() {
        return this.redirect_url;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getLabel() {
        return this.label;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return this.icon;
    }

}
