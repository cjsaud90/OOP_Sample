package com.company.memory;


class Book{
    String title;
    public String title2;
}

public class HeapUse {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.title = "test1";
        book2.title = "test2";

        System.out.println(book1.title);
        System.out.println(book2.title);

        book1 = null;
        book2 = null;

        Book book3 = book1;// 이렇게 선언하면 같은 참조 객체를 가지게 된다.
        // book3 의 값을 바꾸게되면 book1의 값도 바뀌게 되므로 주의해야한다.


    }
}
