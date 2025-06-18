package com.jishu.convert;

import com.jishu.entity.Videos;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.VideosVO;
import com.jishu.vo.create.VideosCreateVO;
import com.jishu.vo.update.VideosUpdateVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface VideosConvert {

    VideosConvert INSTANCE = Mappers.getMapper(VideosConvert.class);

    Videos convert(VideosCreateVO createVO);

    Videos convert(VideosUpdateVO updateVO);

    VideosVO convert(Videos po);

    PageResult<VideosVO> convert(PageResult<Videos> pageResult);

}
