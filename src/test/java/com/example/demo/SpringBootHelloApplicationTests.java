package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SpringBootHelloApplicationTests {

	@Test
	void dummyText() {
		Assert.isTrue(!List.of(1).isEmpty(), "list is empty");
	}

}
