package com.jishu.vo.create;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Data
public class VideosCreateVO implements Serializable {

    private static final long serialVersionUID = 1L;



    /**
     * 格式为HH:MM或MM:SS
     */
    private String duration;



    /**
     * 存储显示的格式如"70.4万次播放"
     */
    private String viewsDisplay;


    /**
     * 存储显示的格式如"4天前"
     */
    private String uploadDateDisplay;


}
