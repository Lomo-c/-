package com.jishu.mapper;

import com.jishu.entity.Menuitems;
import com.jishu.generator.mybatis.BaseMapperX;
import com.jishu.generator.mybatis.LambdaQueryWrapperX;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.page.MenuitemsPageVO;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface MenuitemsMapper extends BaseMapperX<Menuitems> {

    default PageResult<Menuitems> selectPage(MenuitemsPageVO pageVO) {
        return selectPage(pageVO, new LambdaQueryWrapperX<Menuitems>());
    }
}
