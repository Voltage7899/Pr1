package com.company;

public class Book {
    String name;
    String Author;
    int pages;
    Book(String name,String Author,int pages)
    {
        this.name=name;
        this.Author=Author;
        this.pages=pages;
    }
    String getName()
    {
        return name;
    }
    String getAuthor()
    {
return  Author;
    }
    int getPages()
    {
return pages;
    }
   public String toString()
   {
       return "Name is "+name+" was written by "+Author+"has "+pages+"pages";
   }
}
