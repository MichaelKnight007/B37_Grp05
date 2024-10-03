package javaStudies;

public class Methods_3 {

    public static void main(String[] args) {

        int num = 200; // 200
        System.out.print(doCalc(num)); //400
        System.out.println(" " + num); //200

        num=doCalc(200); //400
        System.out.println("num = " + num);

    }

    public  static int doCalc(int var1) {

        var1 = var1 * 2;//400

        System.out.println("var1 = " + var1);

        return var1;//400
    }


}
