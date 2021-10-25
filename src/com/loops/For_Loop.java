package com.loops;

public class For_Loop {
    public static void main(String[] args) {

         for (int i = 1; i<=10; i++){
             System.out.println(i);
         }

        System.out.println("----------// create tables by use of for loop----------------");
        int k = 19;
        for (int i = 1; i<=10; i++){
            int j = k*i;
            System.out.println(j);
        }
        System.out.println("----------// String pattern by use of for loop----------------");
        String a = "Krishna";
        int b = a.length();
        for (int i = b; i>=0;i--){
            System.out.println(a.substring(0,i));
        }
        System.out.println("----------// String pattern by use of for loop----------------");
        for (int i = b; i>=0; i--){
            for (int y = 1; y<=i;y++){
                System.out.print(" ");
            }
            System.out.println(a.substring(i));
        }

        System.out.println("----------// String pattern by use of for loop----------------");
        String a1 = "Kaushal";
        int b1 = a1.length();
        for (int i = 0; i<=b1;i++){
            System.out.println(a.substring(0,i));
        }

        System.out.println("----------// String pattern by use of for loop----------------");
        for (int i = 0; i <= b1; i++) {
            for (int z = 1; z<=i;z++){
                System.out.print(" ");
            }
            for (int j = i; j <= i; j++) {
                System.out.println(a.substring(j));
            }
        }

        System.out.println("----------// Star pattern by use of for loop----------------");
        for (int i = 0; i<5; i++){
            for (int j = 0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("----------// Star pattern by use of for loop----------------");
        for (int i = 5; i>0; i--){
            for (int j = 0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
