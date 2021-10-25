package com.dataType;

public class Data_Types {
    public static void main(String[] args) {

        // 1.String data type --> Sequence of characters and written inform of "string-->xyz"
        // 1.Int data type --> All Numbers are integer without decimal numbers written in form of 12345
        // 1.Double/Float data type --> All decimal numbers are double/float written in form of 12.5545
        // 1.Boolean data type --> True/False is a boolean data type

        System.out.println("---------------------------String Example---------------------------------");
        // Example of string data types
        String name = "Kamal Pratap Singh";
        String city_name = "Agra";
        String education = "B.tech";
        String branch = "Computer Science Engg.";
        String university = "DR.APJ Abdul Kalam Technical University, Lucknow";
        String year = "2021";

        //Single line  printing format-----
        System.out.println("I am "+name+ " and i am belong to "+city_name+ " and i have done " +education+ " with "+branch+
                " from "+university+ " in year "+year);

        //separate line printing  format-----
        System.out.println("Name:- "+name);
        System.out.println("Address:- "+city_name);
        System.out.println("Qualification:- "+education);
        System.out.println("University:- "+university);

        System.out.println("-----------------------------Int Example-------------------------------");
        //Example of Int data types..
        int a = 150;
        int b = 45;
        int c = 405;
        int d = a+b+c;
        System.out.println(a-b);
        System.out.println(d);
        System.out.println(b*c);
        System.out.println(c/b);

        System.out.println("------------------------------Double/Float Example------------------------------");
        //Example of double/float data type...
        double e = 12.58;
        double f = 159.84;
        double g = e*f;
        System.out.println(g);

        System.out.println("-----------------------------Int to Double-------------------------------");
        //Example of convert Int data type to float data type
        System.out.println((float) b);

        System.out.println("------------------------------Double to Int------------------------------");
        //Example  of convert double data type to int data type
        int m = (int) f;
        System.out.println(m);

        System.out.println("----------------------------Boolean data type--------------------------------");
        //Example of Boolean data type
        Boolean Iamkrishna = true;
        Boolean kaushal = false;

        System.out.println(Iamkrishna);
        System.out.println(kaushal);

    }
}
