package com.softtek.sonarqube.demo.service;

import com.softtek.sonarqube.demo.entities.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion save(Promotion promotion);
    List<Promotion> get();
}
