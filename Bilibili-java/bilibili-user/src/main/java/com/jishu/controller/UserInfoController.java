package com.jishu.controller;

import com.jishu.convert.UserInfoConvert;
import com.jishu.generator.pojo.CommonResult;
import com.jishu.generator.pojo.PageResult;
import com.jishu.generator.util.ExcelUtil;
import com.jishu.service.UserInfoService;
import com.jishu.vo.UserInfoVO;
import com.jishu.vo.create.UserInfoCreateVO;
import com.jishu.vo.page.UserInfoPageVO;
import com.jishu.vo.update.UserInfoUpdateVO;
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
 * 用户信息
 *
 * @author Jishu
 * @since 2025/06/18
 */
@Slf4j
    @RestController
@RequestMapping("/userInfo")
@RequiredArgsConstructor
            public class UserInfoController {

        private final UserInfoService userInfoService;

        /**
         * 新增
         *
         * @param createVO 创建VO
         * @return id
         */
        @PostMapping
        public CommonResult<Long> create(@RequestBody @Valid UserInfoCreateVO createVO) {
            return success(userInfoService.create(createVO));
        }

        /**
         * 更新
         *
         * @param updateVO 更新VO
         * @return true/false
         */
        @PutMapping
        public CommonResult<Boolean> update(@RequestBody @Valid UserInfoUpdateVO updateVO) {
                userInfoService.update(updateVO);
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
                userInfoService.delete(id);
            return success(true);
        }

        /**
         * 查询单个
         *
         * @param id id
         * @return vo
         */
        @GetMapping("/{id}")
        public CommonResult<UserInfoVO> get(@PathVariable("id") Long id) {
            return success(UserInfoConvert.INSTANCE.convert(userInfoService.get(id)));
        }

        /**
         * 分页查询
         *
         * @param pageVO 分页VO
         * @return pageResult
         */
        @GetMapping("/page")
        public CommonResult<PageResult<UserInfoVO>> page(@Valid UserInfoPageVO pageVO) {
            return success(UserInfoConvert.INSTANCE.convert(userInfoService.page(pageVO)));
        }

        /**
        * 导出
        *
        * @param pageVO 导出VO
        * @param response response
        * @throws IOException IO异常
        */
        @GetMapping("/export")
        public void exportExcel(@Valid UserInfoPageVO pageVO, HttpServletResponse response) throws IOException {
            // 输出 Excel
            ExcelUtil.write(response, "UserInfoVO.xls", "数据", UserInfoVO.class, UserInfoConvert.INSTANCE.convert(userInfoService.page(pageVO)).getList());
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
            List<UserInfoVO> read = ExcelUtil.read(file, UserInfoVO.class);
            // do something
            return success(true);
        }
}
