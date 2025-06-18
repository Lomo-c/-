package com.jishu.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class MenuitemsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String redirectUrl;

    /**
     * 标签名
     */
    private String label;

    /**
     * 图标
     */
    private String icon;
}
