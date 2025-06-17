package com.jishu.domain;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * 
 * @TableName menuitems
 */
public class Menuitems implements Serializable {

    private Integer id;
    @TableField("redirect_url")
    private String redirectUrl;
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

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
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
