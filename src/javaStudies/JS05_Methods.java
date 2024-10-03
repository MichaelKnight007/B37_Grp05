package javaStudies;

public class JS05_Methods {
    public static void main(String[] args) {

        //sum();

        int number=10;//
       add10(number);//
        System.out.println("number = " + number);


        System.out.println("--------------------- Q-5 ---------------------");
        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.println(" " + var1);


        System.out.println("--------------------- Q-8 ---------------------");
        int a = 5;
        System.out.print(cube(a));

        System.out.println();

        System.out.println("--------------------- Q-10 ---------------------");

        sum(0, 0);
        sum(-1, -1);
       System.out.println();
        /*sum(6,5.5,5.5);*/


        System.out.println("--------------------- Q-11 ---------------------");

        System.out.println(sum_11(1, sum_11(0, 1))); //1 (sum_11(1,1)) //0



    }


    static int doCalc(int var1) {

        var1 = var1 * 2;
        return var1;

    }

    static int cube(int theNum) {

        return theNum * theNum * theNum;
    }

    public static void sum(int a, int b) {

        System.out.print(a + b);
    }


    public static void sum(double a, int b) {

        System.out.print(a + b);
    }

    public static void sum(int a, double b) {

        System.out.print(a + b);
    }

    public static void sum(int a, int b, int c) {

        System.out.print(a + b + c);
    }

    public static void sum(int a, double b, double c) {

        System.out.print(a + b + c);
    }


    public static int sum_11(int a, int b) {

        if (a + b > 1)
            return 0;

        System.out.print(a + b);//1
        return a + b;//1
    }


    private static int add10(int num){

        num=num+10;//20
        System.out.println("num in method= " + num);
        return num;
    }


}
