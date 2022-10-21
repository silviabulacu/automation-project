package com.siit.homework;

public class Book {

    String name;
    int year;
    Author author;
    double price;

    Book(String name, Author author,double price, int year)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getName()
    {
       return this.name;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYear(){
        return this.year;
    }
}
