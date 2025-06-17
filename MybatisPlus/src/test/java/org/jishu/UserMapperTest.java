package org.jishu;

import jakarta.annotation.Resource;
import org.jishu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public  void testGetAll() {
        userMapper.selectList(null).forEach(System.out::println);
    }
}
