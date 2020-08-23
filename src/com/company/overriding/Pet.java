package com.company.overriding;


class Animal{
    String name;
    int age;

     void printPet(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
}

class Dog extends Animal{
    String variety;

    @Override
    void printPet(){
        // Animal class 를 상송받고 super로 printPet의 내용을 상속받는다.
        super.printPet();
        System.out.println("variety:"+variety);

    }
}

public class Pet {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "test";
        dog.age = 2;
        dog.variety = "tt";

        dog.printPet();
    }
}
