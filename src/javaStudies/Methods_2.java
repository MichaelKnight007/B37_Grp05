package javaStudies;

public class Methods_2 {

    public static int add10(int num) {

        num = num + 10; //10+10
        System.out.println("num in add10 Method= " + num);

        return num;
    }


    public static void main(String[] args) {

        int var_1 = 10;

        add10(var_1);//20

        System.out.println("var_1 = " + var_1);//10

        var_1 = add10(var_1);

        System.out.println("var_1 = " + var_1);//20

    }


}
