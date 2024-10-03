package Test;

import javaStudies.Methods_3;
import javaStudies.Methods_4_OverLoading;

public class Test {

    public static void main(String[] args) {

        int num_2=100;
       // Methods_3.doCalc(num_2);

        Methods_3 obj=new Methods_3();
        obj.doCalc(num_2);

        double result=Methods_4_OverLoading.sum(5,5.5);

        System.out.println("result = " + result);

        int num_6=Methods_4_OverLoading.sum(5,6,9);
        System.out.println("num_6 = " + num_6);

        Methods_4_OverLoading.sum(5.6,5.9);


    }
}
