package com.jishu.controller;

import com.jishu.convert.MenuitemsConvert;
import com.jishu.generator.pojo.CommonResult;
import com.jishu.generator.pojo.PageResult;
import com.jishu.generator.util.ExcelUtil;
import com.jishu.service.MenuitemsService;
import com.jishu.vo.MenuitemsVO;
import com.jishu.vo.create.MenuitemsCreateVO;
import com.jishu.vo.page.MenuitemsPageVO;
import com.jishu.vo.update.MenuitemsUpdateVO;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import static com.jishu.generator.pojo.CommonResult.success;

/**
 * 
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Slf4j
    @RestController
@RequestMapping("/menuitems")
@RequiredArgsConstructor
            public class MenuitemsController {

        private final MenuitemsService menuitemsService;

        /**
         * 新增
         *
         * @param createVO 创建VO
         * @return id
         */
        @PostMapping
        public CommonResult<Long> create(@RequestBody @Valid MenuitemsCreateVO createVO) {
            return success(menuitemsService.create(createVO));
        }

        /**
         * 更新
         *
         * @param updateVO 更新VO
         * @return true/false
         */
        @PutMapping
        public CommonResult<Boolean> update(@RequestBody @Valid MenuitemsUpdateVO updateVO) {
                menuitemsService.update(updateVO);
            return success(true);
        }

        /**
         * 删除
         *
         * @param id id
         * @return true/false
         */
        @DeleteMapping
        public CommonResult<Boolean> delete(@RequestParam("id") Long id) {
                menuitemsService.delete(id);
            return success(true);
        }

        /**
         * 查询单个
         *
         * @param id id
         * @return vo
         */
        @GetMapping("/{id}")
        public CommonResult<MenuitemsVO> get(@PathVariable("id") Long id) {
            return success(MenuitemsConvert.INSTANCE.convert(menuitemsService.get(id)));
        }

        /**
         * 分页查询
         *
         * @param pageVO 分页VO
         * @return pageResult
         */
        @GetMapping("/page")
        public CommonResult<PageResult<MenuitemsVO>> page(@Valid MenuitemsPageVO pageVO) {
            return success(MenuitemsConvert.INSTANCE.convert(menuitemsService.page(pageVO)));
        }

        /**
        * 导出
        *
        * @param pageVO 导出VO
        * @param response response
        * @throws IOException IO异常
        */
        @GetMapping("/export")
        public void exportExcel(@Valid MenuitemsPageVO pageVO, HttpServletResponse response) throws IOException {
            // 输出 Excel
            ExcelUtil.write(response, "MenuitemsVO.xls", "数据", MenuitemsVO.class, MenuitemsConvert.INSTANCE.convert(menuitemsService.page(pageVO)).getList());
        }

        /**
         * 导入
         *
         * @param file 文件
         * @return 结果
         * @throws IOException IO异常
         */
        @PostMapping("/import")
        public CommonResult<Boolean> importExcel(@RequestParam("file") MultipartFile file) throws IOException {
            List<MenuitemsVO> read = ExcelUtil.read(file, MenuitemsVO.class);
            // do something
            return success(true);
        }
}
