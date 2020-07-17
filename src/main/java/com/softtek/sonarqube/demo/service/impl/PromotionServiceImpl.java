package com.softtek.sonarqube.demo.service.impl;

import com.softtek.sonarqube.demo.entities.Promotion;
import com.softtek.sonarqube.demo.service.PromotionService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service("PromotionService")
public class PromotionServiceImpl implements PromotionService {
    @Override
    public Promotion save(Promotion promotion) {
        promotion.setId(new Random().nextLong());
        return promotion;
    }

    @Override
    public List<Promotion> get() {

        return Arrays.asList(
                new Promotion("Promotion 1", "Promotion Description 1"),
                new Promotion("Promotion 2", "Promotion Description 2")
        );
    }

}
