package com.company.java_extends;


class Book{
    String title;

    void printBook(){
        System.out.println("제목 : "+ title);
    }

}

class Novel extends Book{
    String writer;

    void printNv(){
        printBook();
        System.out.println("저자 : "+ writer);
    }
}

class Magazine extends Book{
    int day;

    void printMag(){
        printBook();
        System.out.println("발매일 : "+ day);
    }
}

public class Bookshelf {

    public static void main(String[] args) {
        Novel novel = new Novel();
        novel.title ="test";
        novel.writer="dddddddddd";
        novel.printNv();

        Magazine mag = new Magazine();
        mag.title = " test2";
        mag.day = 3;
        mag.printMag();


    }
}
