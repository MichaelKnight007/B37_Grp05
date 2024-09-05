public class JS02_Concatenation {


    public static void main(String[] args) {

        String str = "Cydeo";
        String str1 = "Group_05";

        System.out.println(str + "_" + str1);

        int num = 5;
        int num1 = 10;
        System.out.println(str + "_" + num);//Cydeo_5
        System.out.println(num + str);//5Cydeo
        System.out.println(str + "_" + num + num1);//Cydeo_510
        System.out.println(num + num1 + str + "_" + num + num1);//15Cydeo_510

        char ch='A';

        String str2=""+ ch; //A

        System.out.println(str+5*5);

        System.out.println("NUm before increment= "+num);// 5

        ++num; // num=num+1; Increment first, then action.
        System.out.println("NUm after increment= "+num); //6

        System.out.println(++num);// 7

        num++; // num=num+1; Action first, then Increment.// 8

    System.out.println(num++);// 8 ==> 9

        --num1; // num1=num1-1; Decrement first, then action.
        num1--; // num1=num1-1; Action first, then Increment.

        num+=5; // num=num+5;
        num-=5; // num=num-5;
        num*=5; // num=num*5;
        num/=5; // num=num/5;
        num%=5; // num=num%5;

        int a=2;
        int b=23;
        int c=5;

        a+=b*c; //==> a=a+b*c//117
        b%=c-1-1; // b=b%(c-1-1) ==> 23%3 ==>2
        c*=a-b; // c=c*(a-b); ==> 575

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int num4=19; // 19/-5=-3 ==> 19-15=4
        int num5=-5;

        System.out.println(num4%num5);// 4

        int num6=-19; // -19/5=3 ==> -19+15=-4
        int num7=5;

        System.out.println(num6%num7);// -4


    }
}
