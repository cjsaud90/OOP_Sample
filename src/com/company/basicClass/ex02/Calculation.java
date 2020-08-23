package com.company.basicClass.ex02;


class Calc {
     int add (int a, int b){
         return a+b;
     }
}

class Book{
    String title;
    String author;
    int price;

}


public class Calculation {

    public static void main(String[]args){
        Calc cal = new Calc();
        int res = cal.add(4, 5);

        System.out.println(res);

        // myBook
        Book book = new Book();
        book.title = "basic class";
        book.author = "someone";
        book.price = 15000;

        System.out.println(book.title + " : " + book.author + " : "+ book.price);



    }
}
