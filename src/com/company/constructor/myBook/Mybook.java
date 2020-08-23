package com.company.constructor.myBook;


class Book{
    String title;
    int price;
    int num;

    Book(){
        title = "Test BOOK";
        price = 1000;
        num = 1;
    }

    Book(String title, int price, int num){
        this.title = title;
        this.price = price;
        this.num = num;
    }

    void print(){
        System.out.println("제목 : "+title);
        System.out.println("가격 : "+price);
        System.out.println("수량 : "+num);
        System.out.println("합계금액 : "+price*num);
    }
}

public class Mybook {

    public static void main(String[] args) {
        Book book = new Book("test bookzzzzzzzzz", 2003, 323);

        book.print();

    }

}
