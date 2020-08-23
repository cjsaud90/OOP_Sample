package com.company.java_interfact;


interface Greet {
   abstract void greet();
}

interface Bye extends Greet{
    void bye();
}

class Morning implements Bye{

    @Override
    public void greet() {
        System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("bye");

    }
}

public class Meet {

    public static void main(String[] args) {
        Morning meet = new Morning();

        meet.greet();
        meet.bye();

    }
}
