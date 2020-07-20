package com.softtek.sonarqube.demo;

import com.softtek.sonarqube.demo.entities.Promotion;
import com.softtek.sonarqube.demo.service.PromotionService;
import com.softtek.sonarqube.demo.service.impl.PromotionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

@SpringBootTest
class DemoAppApplicationTests {

	PromotionService promotionService;

	@BeforeEach
	public void setup(){
		promotionService = new PromotionServiceImpl();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void getPromotions() {
		List<Promotion> result = promotionService.get();

		assertFalse(result.isEmpty());
		assertThat(result.size(), is(2));
	}

}
