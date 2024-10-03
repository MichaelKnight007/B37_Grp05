package javaStudies;

public class JS03_Operators {
    public static void main(String[] args) {

        System.out.println(5*2+5+""+10);//1510
        System.out.println(""+5*2+5+"_"+10);//105_10

        char ch1='A';

        String str1=""+ch1;//A
        //String str2=ch1;//A

        int num=5;//positive
        int num_1=-5;//positive

        int a=5;

       int b=5+ (++a);//11 ==> a=6 //   ++a ==> a=a+1; a= 5+1
        System.out.println("b = " + b);

        int c=5+a--;//11 ==> a=5  // //   a-- ==> a=a-1; a= 6-1
        System.out.println("c = " + c);

        System.out.println("a = " + a);//5

        //   ++a ==> a=a+1; a= 5+1

        a+=b; // a=a+b;
        a*=b; //a=a*b;



        char ch2='A'; //65
        char ch3=67;

        System.out.println(ch2+ch3);// 65+67 =132
        System.out.println(""+ch2+ch3);// AC

        System.out.println("ch3 = " + ch3);

        int d=19;
        int e=-5;

        System.out.println(d%e);// remainder is 4

        int f=-19;
        int g=5;

        System.out.println(f%g);// remainder -4

        int aa=2;
        int ab=23;
        int ac=5;

        aa+=ab*ac; // aa=aa+(ab*ac)
        System.out.println("aa = " + aa);//

        ab%=ac-1-1;
        ac*=aa-ab;

        System.out.println("ab = " + ab);
        System.out.println("ac = " + ac);


    }
}
