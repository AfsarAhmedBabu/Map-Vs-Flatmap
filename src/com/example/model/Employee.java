package com.example.model;

import java.util.List;

public class Employee {

    private String name;
    private Long id;
    private List<String> cities;

    public Employee(String name, Long id, List<String> cities) {
        this.name = name;
        this.id = id;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

}
