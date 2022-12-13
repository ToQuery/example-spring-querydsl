package io.github.toquery.example.spring.boot.querydsl;

import io.github.toquery.example.spring.boot.querydsl.modules.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleSpringBootQuerydslApplicationTests {

	@Autowired
	private OrderService orderService;
	@Test
	void contextLoads() {
	}

	@Test
	public void testList(){
		orderService.list(null, null);
	}

}
