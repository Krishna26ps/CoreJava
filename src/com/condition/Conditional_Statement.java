package com.condition;

import jdk.nashorn.internal.ir.IfNode;

public class Conditional_Statement {
    public static void main(String[] args) {

        //Example of two conditions......
        int i = 140;
        int j = 150;
        int k = 200;

        if (i>j){
            System.out.println("I is greater then J");
        }
        else {
            System.out.println("I is Less then J ");
        }

        System.out.println("------------------------//Example of multiple conditions...---------------------------------------");
        if (k>j){
            System.out.println("K is greater then J");
        }
        else if (j==k){
            System.out.println("I is Equal to K");
        }
        else {
            System.out.println("I is Less then to K ");
        }
    }
}
