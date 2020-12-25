package com.designpattern.memento;

import java.util.ArrayList;

public class Order {
    ArrayList <FoodItem> foodItems= new ArrayList<>();

    public void addFoodItem(FoodItem foodItem){
        foodItems.add(foodItem);
    }

    public ArrayList<FoodItem> getFoodItems() {
        return (ArrayList) foodItems.clone();
    }

    public OrderMemento save(){
        return new OrderMemento(getFoodItems());
    }

    public void revert(OrderMemento orderMemento){
        foodItems= orderMemento.getFoodItems();
    }

    @Override
    public String toString() {
        return "Order{" +
                "foodItems=" + foodItems +
                '}';
    }

    static class OrderMemento{
        ArrayList<FoodItem> foodItems;

        public OrderMemento(ArrayList<FoodItem> foodItems) {
            this.foodItems = foodItems;
        }

        private ArrayList<FoodItem> getFoodItems(){
            return foodItems;
        }
    }
}
