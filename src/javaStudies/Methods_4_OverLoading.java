package javaStudies;

public class Methods_4_OverLoading {

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2+ num3;

        return sum;
    }

    public static double sum(double num1, double num2) {
        double sum = num1 + num2;

        return sum;
    }

    public static double sum(double num1, int num2) {
        double sum = num1 + num2;

        return sum;
    }

    public static double sum(int num1, double num2) {
        double sum = num1 + num2;

        return sum;
    }
}
