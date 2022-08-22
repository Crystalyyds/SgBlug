package com.github.sgblug.app;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void text(){
        System.out.println("test...");
    }

}
