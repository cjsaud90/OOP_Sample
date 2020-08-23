package com.company.accessRestriction.team1;

import com.company.accessRestriction.team2.AnotherClass2;

public class AccessUse {
    public int num1;
    private int num2;
    protected  int num3;
    int num4; // default -> 이건 같은 패키지에만 접근 가능

    public static void main(String[] args) {
        //같은 클래스 안에서는 모든 접근제한자에 접근 가능
        AccessUse accessUse = new AccessUse();
        accessUse.num1=1;
        accessUse.num2=1;
        accessUse.num3=1;
        accessUse.num4=1;

        AnotherClass1 anotherClass1 = new AnotherClass1();
        anotherClass1.num1=1;
        //private 는 같은 클래스에서만 접근이 가능
//        anotherClass1.num2=1;
//      protected 는 같은 패키지에 있으면 접근이 가능하다
        anotherClass1.num3=1;
        anotherClass1.num4=1;

        AnotherClass2 anotherClass2 = new AnotherClass2();
        anotherClass2.num1=1;
        // 다른 패키지에 있는 private, protected, default 접근 할 수 없다.
//        anotherClass2.num2=1;
//        anotherClass2.num3=1;
//        anotherClass2.num4=1;

    }
}
