package com.siit.homework;

public class Library {
    Book book;
    Author author;


    public static void main (String[] args)

    {
        Author author  = new Author("Liviu Rebreanu","biblioteca@gmail.com");
        Book book = new Book("Adam si Eva", author, 20,1990);
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + book.getAuthor().getName() + ", published in "+ book.getYear());

        Author author1 = new Author("Ion Creanga","biblioteca@gmail.com");
        Book book1 = new Book("Amintiri din copilarie", author1, 10,1980);

        System.out.println("Book " + book1.getName() + " (" + book1.getPrice() + " RON), by " + book1.getAuthor().getName() + ", published in "+ book1.getYear());

        Book book2 =new Book("Pupaza din Tei", author1, 30, 1989);
        System.out.println("Book " + book2.getName() + " (" + book2.getPrice() + " RON), by " + book2.getAuthor().getName() + ", published in "+ book2.getYear());


    }


}
