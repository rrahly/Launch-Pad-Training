package com.designpattern.memento;

import java.util.Stack;

public class CareTaker {
    Stack<Order.OrderMemento> history= new Stack<>();

    public void save(Order order){
        history.push(order.save());
    }

    public void revert(Order order){
        if(!history.isEmpty())
            order.revert(history.pop());
        else
            System.out.println("Cannot undo");
    }
}
