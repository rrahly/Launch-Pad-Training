package com.designpattern.builder;

public class Application {
    public static void main(String[] args) {
        Book.Builder builder= new Book.Builder("The Alchemist");
        Book book= builder.author("Paulo Coelho").publisher("Harper Collins").build();
        System.out.println(book);

        Book.Builder builder1= new Book.Builder("The Kite Runner");
        Book book1= builder1.author("Khaled Hosseini").build();
        System.out.println(book1);
    }
}
