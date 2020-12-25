package com.designpattern.memento;

public class FoodItem {
    String name;

    public FoodItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
