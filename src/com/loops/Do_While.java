package com.loops;

public class Do_While {
    public static void main(String[] args) {

        int a = 5;
        int i = 0;
        do {
            System.out.println("Hello " + i);
            i++;
        }
        while (i < a);

        System.out.println("-------------------------------------------");
        do {
            System.out.println("Hello " + a);
            a--;
        }
        while (a>0);
    }
}
