package com.softtek.sonarqube.demo.service;

import com.softtek.sonarqube.demo.entities.Promotion;
import com.softtek.sonarqube.demo.service.impl.PromotionServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class PromotionServiceTest {

    PromotionService promotionService;

    @Before
    public void setup(){
        promotionService = new PromotionServiceImpl();
    }

    @Test
    public void getPromotions() {
        List<Promotion> result = promotionService.get();

        assertFalse(result.isEmpty());
        assertThat(result.size(), is(2));
    }

    @Test
    public void savePromotions(){
        Promotion promotion = new Promotion("Promotion 1", "Promotion Description 1");
        assertNull(promotion.getId());

        Promotion saved = promotionService.save(promotion);
        assertNotNull(saved.getId());
    }
}
