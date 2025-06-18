package com.jishu.convert;

import com.jishu.entity.Menuitems;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.MenuitemsVO;
import com.jishu.vo.create.MenuitemsCreateVO;
import com.jishu.vo.update.MenuitemsUpdateVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface MenuitemsConvert {

    MenuitemsConvert INSTANCE = Mappers.getMapper(MenuitemsConvert.class);

    Menuitems convert(MenuitemsCreateVO createVO);

    Menuitems convert(MenuitemsUpdateVO updateVO);

    MenuitemsVO convert(Menuitems po);

    PageResult<MenuitemsVO> convert(PageResult<Menuitems> pageResult);

}
