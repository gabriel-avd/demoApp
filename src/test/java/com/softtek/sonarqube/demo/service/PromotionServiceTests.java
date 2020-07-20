package com.softtek.sonarqube.demo.service;

import com.softtek.sonarqube.demo.entities.Promotion;
import com.softtek.sonarqube.demo.service.impl.PromotionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PromotionServiceTests {

    PromotionService promotionService;

    @BeforeEach
    public void setup(){
        promotionService = new PromotionServiceImpl();
    }

    @Test
    void getPromotions() {
        List<Promotion> result = promotionService.get();

        assertFalse(result.isEmpty());
        assertThat(result.size(), is(2));
    }

    @Test
    void savePromotions(){
        Promotion promotion = new Promotion("Promotion 1", "Promotion Description 1");
        assertNull(promotion.getId());

        Promotion saved = promotionService.save(promotion);
        assertNotNull(saved.getId());
    }
}
