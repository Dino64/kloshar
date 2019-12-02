package com.company;

public class Math {
    public static void main(String[] args) {

Math myApp = new Math();
    int a = 2;
    int b = 4;
    int add = myApp.add(a, b);

        System.out.println(add);

    }

    public int add (int first, int second){
        int sum = 0;
        sum = first + second;

        return sum;
    }
}
