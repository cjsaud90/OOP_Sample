package com.company.hiding;

class SampleBox{

    private int num; // 은닉화

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}

public class HidingTest {

    public static void main(String[] args) {
        SampleBox sampleBox = new SampleBox();
        sampleBox.setNum(2);
        sampleBox.getNum();
    }

}
