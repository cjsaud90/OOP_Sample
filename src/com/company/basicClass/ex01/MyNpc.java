package com.company.basicClass.ex01;

class Npc{
    //필드 - 데이터
    String name;
    int hp;

    //메서드 - 동작
    void say(){
        System.out.println("안녕하세요!!");
    }
}


public class MyNpc {
    public static void main(String [] args){
        Npc saram1 = new Npc(); // 생성자를 호출

        saram1.name = "경비";
        saram1.hp = 100;

        System.out.println(saram1.name + " : " + saram1.hp);

        saram1.say();



    }
}
