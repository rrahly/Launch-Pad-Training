package com.designpattern.builder;

public class Book {
    private final String bookName;
    private final String author;
    private final String publisher;

    public Book(Builder builder){
        this.bookName= builder.bookName;
        this.author= builder.author;
        this.publisher= builder.publisher;
    }

    static class Builder{
        private String bookName;
        private String author;
        private String publisher;

        public Book build(){
            return new Book(this);
        }

        public Builder(String bookName){
            this.bookName = bookName;
        }

        public Builder author(String author){
            this.author= author;
            return this;
        }

        public Builder publisher(String publisher){
            this.publisher= publisher;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
