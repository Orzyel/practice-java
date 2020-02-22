package com.company;

public class OddOrEven {
    public static void main(String[] args) {
        // bro means possums in love
        int bro = 17;
        System.out.println(bro);

        bro = bro % 4;
        System.out.println(bro);

        if (bro > 5) {
            System.out.println("bro is greater than cinq");
        } else {
            System.out.println("bro is low, yo");
        }

        if (isOdd(bro)){
            System.out.println("this is weird");
        }
        else {
            System.out.println("even stevens");
        }
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));
    }

    public static boolean isOdd (int num) {
        return num % 2 == 1;

    }

}
