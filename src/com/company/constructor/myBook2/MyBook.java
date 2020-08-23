package com.company.constructor.myBook2;

class Book{
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    //복제 생성자
    Book(Book book){
        title = book.title;
        price = book.price;
    }

    void print(){
        System.out.println("title : "+title);
        System.out.println("price : "+price);
    }
}
public class MyBook {
    public static void main(String[] args) {
        Book book1 = new Book("test java ", 3304);
        book1.print();
        Book book2 = new Book(book1);
        book2.title="이게 된다구??";
        book2.print();


    }
}


// 메서드 영역 - static
// 스택영역 - 지역변수, 매개변수
// 힙영역 - 인스턴스 ( 객체 )가 생성되는 메모리 공간 : 자바 가상머신 ( jvm)에 의해서 관리 된다.->Garbage Collection 소멸은 jvm이 처

//Garbage Collection