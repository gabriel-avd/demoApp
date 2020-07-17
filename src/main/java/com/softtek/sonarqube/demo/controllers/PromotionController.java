package com.softtek.sonarqube.demo.controllers;

import com.softtek.sonarqube.demo.entities.Promotion;
import com.softtek.sonarqube.demo.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    PromotionService promotionService;

    @GetMapping
    public ResponseEntity<List<Promotion>> getPromotions() {
        return new ResponseEntity<>(promotionService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Promotion> createTutorial(@RequestBody Promotion promotion) {
        try {
            Promotion prom = promotionService.save(new Promotion(promotion.getName(), promotion.getDescription()));

            return new ResponseEntity<>(prom, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
