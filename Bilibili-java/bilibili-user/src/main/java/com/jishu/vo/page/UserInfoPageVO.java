package com.jishu.vo.page;

import com.jishu.generator.pojo.PageParam;
import lombok.Data;

/**
 * 用户信息
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class UserInfoPageVO extends PageParam {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;
}
