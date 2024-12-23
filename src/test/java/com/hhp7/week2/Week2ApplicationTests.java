package com.hhp7.week2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Week2ApplicationTests {

    @Test
    void contextLoads() {
    }

}
