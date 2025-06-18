package com.jishu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jishu.generator.pojo.BasePO;
import lombok.*;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("menuitems")
public class Menuitems extends BasePO {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("redirect_url")
    private String redirectUrl;

    /**
     * 标签名
     */
    @TableField("label")
    private String label;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;
}
