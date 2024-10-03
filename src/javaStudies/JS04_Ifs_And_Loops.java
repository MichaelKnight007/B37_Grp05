package javaStudies;

public class JS04_Ifs_And_Loops {
    public static void main(String[] args) {

        //  ------------------------------------ If Clauses ---------------------------------------------
        System.out.println(" ------------------------------------ If Clauses ---------------------------------------------");

        if (10 < 9) {
            System.out.println("Hello World");
        }
        System.out.println("Hello Group_5");

        if (10 < 9) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello Group_5");
        }

        if (8 * 5 == 5) {
            System.out.println("Hello World");
        } else if (8 * 5 == 40) {
            System.out.println("Hello Group_5");

            if (8 * 4 == 32) {
                System.out.println("You're doing right");
            }

        } else if (8 * 5 > 35) {
            System.out.println("Hello World and Group_5");


        } else {
            System.out.println("Hello Only Group_5");
        }


        //  ------------------------------------ Ternaries ---------------------------------------------
        System.out.println(" ------------------------------------ Ternaries ---------------------------------------------");

        int num_1 = (8 * 5 > 41) ? 41 : 40;
        System.out.println("num_1 = " + num_1);//40

        int num_2 = (8 * 5 > 41) ? 41 : (8 * 5 < 41) ? 40 : 55;//40
        System.out.println("num_2 = " + num_2);

        //  ------------------------------------ Switch ---------------------------------------------
        System.out.println(" ------------------------------------ Switch ---------------------------------------------");
        num_1 = 2;

        switch (num_1) {
            case 31:
                System.out.println("Hello World");
                if (8 * 5 == 40) {

                }
                break;
            case 52:
                System.out.println("Hello Group_5");
                break;
            case 63:
            case 67:
            case 35:
                System.out.println("You're doing right");
                break;
            case 84:
                System.out.println("Hello World and Group_5");
                break;
            case 40:
                System.out.println("Hello World and Group_5, You're doing right");
                break;
            case 41:
                System.out.println("Hello World and Group_5");
                break;
            case 42:
                System.out.println("Hello World and Group_5555, You're doing right");
                break;
            default:
                System.out.println("Default Hello World and Group_5");
                break;

        }

        switch (num_2) {
            case 31 -> {
                System.out.println("Hello World");
                if (4 * 5 == 40) {

                }
            }
            case 35 -> System.out.println("Hello World");
            case 38 -> System.out.println("Hello World");
            case 40 -> System.out.println("Hello World");
            case 39 -> System.out.println("Hello World");
            case 71 -> System.out.println("Hello World");
            default -> System.out.println("Default Hello World and Group_5");
        }


        //////////////////////////////////////////   LOOPS   ///////////////////////////////////////////////////////////////////////
        System.out.println(" ------------------------------------ LOOPS ---------------------------------------------");


        //  ------------------------------------ For Loop  ---------------------------------------------
        System.out.println(" ------------------------------------ For Loop ---------------------------------------------");

        //String str_1="Cydeo";


        for (int i = 10; i >= 1; i--) {//i=2/3

            for (int j = 1; j <= 9; j++) {//j=0/1/2 // j=0
                System.out.print(i * j + "\t ");
            }
            System.out.println();
        }
        //System.out.println(i);


        for (int l = 1; l < 55; l++) {

            if (l == 4) {
                break;
            }

            System.out.println(l + " ");
        }


        //  ------------------------------------ While Loop  ---------------------------------------------
        System.out.println(" ------------------------------------ While Loop ---------------------------------------------");

        int num_3 = 0;

        while (num_3 < 50) {

            System.out.println("Hello World");
            num_3 += 5;


        }


        //  ------------------------------------ Do While Loop  ---------------------------------------------
        System.out.println(" ------------------------------------ Do While Loop ---------------------------------------------");


        int num_4 = 0;
        do {
            System.out.println("Hello World");
            num_4 += 2;
        } while (5 > 6);


        //--------------------------------- KAHOOT QUESTIONS ------------------------

        // 2.

        System.out.println("---------------------------- Q-2 ----------------------------------------");
        //  int t=(9-10)?10:(11<10)?9:7;

        // 3.

        System.out.println("---------------------------- Q-3 D'v's'ble by 2----------------------------------------");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        // 4.


        System.out.println("---------------------------- Q-4 Even or Not ----------------------------------------");
        int number = 6;

        if (number % 2 == 0) {
            System.out.println("Even");
        }

        if (number % 2 != 1) {
            System.out.println("Even");
        }


        System.out.println("---------------------------- Q-5 True or False ----------------------------------------");
        boolean w = true;
        boolean y = false;

        if (w && y) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }


        System.out.println("---------------------------- Q-6 for Loop How many Hello ----------------------------------------");
        int m = 0;
        for (; m < 5; m++) {
            System.out.println("Hello");
            m += 3;
        }

        System.out.println("m = " + m);

        System.out.println("---------------------------- Q-7 break ----------------------------------------");

        for (int i = 1; i < 10; i++) {

            if (i == 4) {
                break;
                //continue;
            }

            System.out.println(i + " ");
        }


        System.out.println("---------------------------- Q-8 Single if without curly braces---------------------------------------");

        int a = 7;
        int b = 9;

        if (a < b)
            System.out.println(true);
        System.out.println(false);
        System.out.println("java");


        System.out.println("---------------------------- Q-9 Marks ---------------------------------------");

        int marks = 50;

        if (marks <= 70) {
            System.out.println("Distinction");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        System.out.println("---------------------------- Q-10 How many Hello While Loop ---------------------------------------");

        int c=1;
        while (c < 6) {

            System.out.println("Hello");

            if(c==4){
                break;
            }

            c++;
        }


        System.out.println("---------------------------- Q-11 How many Cydeo Do_While Loop ---------------------------------------");

        int d = 5;

        do {
            System.out.println("Cydeo");
            d++;

            System.out.println("Group_5");



        } while (d < 5);

        System.out.println("Cydeo_2");

        System.out.println("---------------------------- Q-12  ---------------------------------------");
        int j = 0;

        for (; j <= 5; j++) {
            System.out.print("j= " + j);

        }

        System.out.println("j after the loop = " + j);

    }

}
