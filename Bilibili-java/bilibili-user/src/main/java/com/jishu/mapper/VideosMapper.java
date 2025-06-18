package com.jishu.mapper;

import com.jishu.entity.Videos;
import com.jishu.generator.mybatis.BaseMapperX;
import com.jishu.generator.mybatis.LambdaQueryWrapperX;
import com.jishu.generator.pojo.PageResult;
import com.jishu.vo.page.VideosPageVO;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Mapper
public interface VideosMapper extends BaseMapperX<Videos> {

    default PageResult<Videos> selectPage(VideosPageVO pageVO) {
        return selectPage(pageVO, new LambdaQueryWrapperX<Videos>());
    }
}
