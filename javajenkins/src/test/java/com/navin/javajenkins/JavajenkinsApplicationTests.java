package com.navin.javajenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavajenkinsApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void testGreet() {
        assertEquals("Test","Test");
    }

}
