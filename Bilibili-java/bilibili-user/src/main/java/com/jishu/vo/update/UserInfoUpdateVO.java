package com.jishu.vo.update;

import com.jishu.vo.create.UserInfoCreateVO;
import lombok.Data;

/**
 * 用户信息
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class UserInfoUpdateVO extends UserInfoCreateVO {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;
}
