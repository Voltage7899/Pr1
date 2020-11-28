package com.company;

public class Main {
    public static void main(String [] args)
    {
        Book book=new Book("King","Royal",200);
        System.out.println(book.Author);
        System.out.println(book.name);
        System.out.println(book.pages);
        System.out.println(book.toString());


    }
}
