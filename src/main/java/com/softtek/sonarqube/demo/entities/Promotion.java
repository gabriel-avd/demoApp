package com.softtek.sonarqube.demo.entities;

public class Promotion {

    private Long id;
    private String name;
    private String description;

    public Promotion() {
    }

    public Promotion(String name, String description) {
        this.setName(name);
        this.setDescription(description);
    }

    public Long getId() {
        return id;
    }

    public Promotion setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Promotion setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Promotion setDescription(String description) {
        this.description = description;
        return this;
    }
}
