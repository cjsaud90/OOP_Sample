package com.company.classCast;


class ABoard{}

class BBoard extends ABoard{}

public class ClassCastExcepton {

    public static void main(String[] args) {
        ABoard board = new BBoard();
        BBoard bBoard = (BBoard) board;
    }

}
