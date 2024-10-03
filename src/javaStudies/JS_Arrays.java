package javaStudies;

import java.util.Arrays;
import java.util.Comparator;

public class JS_Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 6, 78, 32};

        System.out.println("numbers = " + numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("numbers[4] before = " + numbers[4]);
        numbers[4] = 38;
        System.out.println("numbers[4] after= " + numbers[4]);


        int nums[] = new int[5];
        boolean bl[] = new boolean[5];
        double db[] = new double[5];
        char ch[] = new char[5];
        String[] names = new String[5];

        System.out.println("int = " + Arrays.toString(nums));
        System.out.println("boolean = " + Arrays.toString(bl));
        System.out.println("double = " + Arrays.toString(db));
        System.out.println("char = " + Arrays.toString(ch));
        System.out.println("String = " + Arrays.toString(names));

        ch[0] = 'a';
        ch[1] = 'b';
        ch[3] = 'e';

        System.out.println("char = " + Arrays.toString(ch));

        System.out.println("---------------------------- copyOf() ------------------");
        // int[] numbers = {5, 9, 6, 78, 38};

        int[] num_1 = Arrays.copyOf(numbers, 3);
        System.out.println("num_1 = " + Arrays.toString(num_1)); //num_1 = [5, 9, 6]

        int[] num_2 = Arrays.copyOf(numbers, 5);
        System.out.println("num_2 = " + Arrays.toString(num_2));

        int[] num_3 = Arrays.copyOf(numbers, 9);
        System.out.println("num_3 = " + Arrays.toString(num_3));


        System.out.println("---------------------------- copyOfRange() ------------------");
        // int[] numbers = {5, 9, 6, 78, 38};
        //  0  1  2   3   4

        int[] num_4 = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("num_4 = " + Arrays.toString(num_4));

        int[] num_5 = Arrays.copyOfRange(numbers, 1, 5);
        System.out.println("num_4 = " + Arrays.toString(num_5));

        int[] num_6 = Arrays.copyOfRange(numbers, 1, 10);
        System.out.println("num_4 = " + Arrays.toString(num_6));


        System.out.println("--------------- equals() ----------------------------");

        boolean comparison_1 = Arrays.equals(numbers, num_1); // numbers = {5, 9, 6, 78, 38};
        // num_1 = [5, 9, 6]
        System.out.println("comparison_1 = " + comparison_1);// false

        boolean comparison_2 = Arrays.equals(numbers, num_2); // numbers = {5, 9, 6, 78, 38};
        // num_2 = [5, 9, 6, 78, 38]
        System.out.println("comparison_2 = " + comparison_2);// true
        num_2[0] = num_2[1];
        num_2[1] = 5;
        System.out.println("num_2 = " + Arrays.toString(num_2));// numbers = {5, 9, 6, 78, 38};
        // num_2 = [9, 5, 6, 78, 38]
        boolean comparison = Arrays.equals(numbers, num_2);
        System.out.println("comparison = " + comparison);// false

        boolean comparison_3 = Arrays.equals(numbers, num_3); // numbers = {5, 9, 6, 78, 38};
        //   num_3 = [5, 9, 6, 78, 38, 0, 0, 0, 0]
        System.out.println("comparison_3 = " + comparison_3);// false


        System.out.println("--------------- sort() ----------------------------");

        Arrays.sort(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));

        Arrays.sort(num_2);
        System.out.println("num_2 = " + Arrays.toString(num_2));
        System.out.println("Arrays.equals(numbers, num_2) = " + Arrays.equals(numbers, num_2));


        String[] str = {"OOP", "Cydeo", "Eagles", "Asdfgnhekrk", "C++", "C#", "Zeplin"};
        Arrays.sort(str);
        System.out.println("str = " + Arrays.toString(str));


        int[] num_55 = {5, 9, 12, 8, 77};

        for (int x = 1; x < num_55.length; x++) { // x=1,2,3,4

            num_55[x] = num_55[0];
            // num_55[1] = 5;
            // num_55[2] = 5;
            // num_55[3] = 5;
            // num_55[4] = 5;

            System.out.println("x = " + x);
            System.out.println("num_55 = " + Arrays.toString(num_55));
        }

        // System.out.println("num_55 = " + Arrays.toString(num_55));


        char[] chArr = {'D', 'C', 'B', 'A'};

        Arrays.sort(chArr);

        for (char each : chArr) {

            //System.out.println(each);
            if (each == 'D') {
                continue;
            }
            System.out.println(each);
        }


        double[] arr_33 = new double[21]; // size =20
        System.out.println("arr_33 = " + Arrays.toString(arr_33));
// [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 , 0.0 ] //
//   0    1    2    3     4    5   6    7    8    9    10   11   12   13   14   15   16   17   18   19

        System.out.println("arr_33.length = " + arr_33.length); //20
        arr_33[20] = 20;
        System.out.println("arr_33 = " + Arrays.toString(arr_33));
    }
}
