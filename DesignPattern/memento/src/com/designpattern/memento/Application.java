package com.designpattern.memento;

public class Application {
    public static void main(String[] args) {
        CareTaker careTaker= new CareTaker();
        Order order= new Order();

        order.addFoodItem(new FoodItem("pizza"));

        order.addFoodItem(new FoodItem("pasta"));
        careTaker.save(order);
        System.out.println(order);

        order.addFoodItem(new FoodItem("burger"));
        careTaker.save(order);
        System.out.println(order);

        order.addFoodItem(new FoodItem("shawarma"));
        careTaker.save(order);
        System.out.println(order);

        order.addFoodItem(new FoodItem("fries"));
        careTaker.save(order);
        System.out.println(order);

        careTaker.revert(order);
        System.out.println(order);

        careTaker.revert(order);
        System.out.println(order);

        careTaker.revert(order);
        System.out.println(order);

        careTaker.revert(order);
        System.out.println(order);

        careTaker.revert(order);
        System.out.println(order);
    }
}
