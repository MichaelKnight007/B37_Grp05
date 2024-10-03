package javaStudies;

public class JS06_String {
    public static void main(String[] args) {

        System.out.println("------------------ Q3 ----------------------------");

        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);


        System.out.println("------------------ Q4 ----------------------------");

        String s1 = "Java String Quiz";
        // lenght=16
        //index number of last character=15
        // System.out.println(s1.charAt(s1.toUpperCase().length()));//16


        System.out.println("------------------ Q5 ----------------------------");

        String str = "   Hello World   ";

        System.out.println("str.trim() =" + str.trim());
        System.out.println("str =" + str);

        str = str.trim();

        System.out.println("str = " + str);
        int z = str.indexOf(" ");
        System.out.println(z);//


        System.out.println("------------------ Q6 ----------------------------");

        String str2 = "abcde";
        // 0123
        System.out.println(str2.substring(1, 3));


        System.out.println("------------------ Q7 ----------------------------");

        String s3 = "Welcome to Java";
        System.out.print(s3.substring(3, 3));// trick
        System.out.println(s3.indexOf("o"));


        System.out.println("------------------ Q8 ----------------------------");

        String str3 = "CydeoSchool";
        //  System.out.println(str3.substring(5, 3));


        System.out.println("------------------ Q10 ----------------------------");

        String str4 = "   Java ";
        String str5 = " is ";
        String str6 = " awesome     .    ";

        String strResult = str4.trim() + str5 + str6.trim();
        System.out.println("strResult =" + strResult);


        System.out.println("------------------ Q11 ----------------------------");

        String x = "abc";
        String y = "abc";

       x.concat(y);//abcabc
        System.out.println(x);//abc


        System.out.println("------------------ Q12 ----------------------------");

        String str7 = "2022";

        int xx = Integer.parseInt(str7);
        System.out.println(xx);


        System.out.println("------------------ Q13 ----------------------------");


        String s4 = "abcdefg";
                  // 0123456
       // String s5 = "" + s4.charAt(0) + s4.charAt(s4.length());
                        // a+ charAt(7)
          //System.out.println(s5);


        System.out.println("------------------ Q14 ----------------------------");

        String s6 = new String("java");
        String s7 = new String("JAVA");
        System.out.println(s6 = s7);//


        System.out.println("------------------ Q15 ----------------------------");

        String str8 = "Cydeo";
        String str9 = "Cydeo";

        String str10 = new String("Cydeo");

        System.out.println(str8 == str9);
        System.out.println(str8 == str10);
        System.out.println(str8.equals(str10));


        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
        String str11 = "JAVA";
        int lenghtOfStr11 = str11.length();
        System.out.println("lenghtOfStr11 = " + lenghtOfStr11);//4

        System.out.println("str11 = " + str11); //JAVA

        str9.concat(" " + str11);
        System.out.println(str11); //JAVA

        str11 = str9.concat(" " + str11);
        System.out.println("str11 = " + str11); // Cydeo JAVA

        str11.toLowerCase();
        System.out.println("str11 after using LOWECASE method without reassigning= " + str11); //JAVA

        str11 = str11.toLowerCase(); //java
        System.out.println("str11 after using LOWECASE method after reassigning= " + str11);


        String str12 = "I like learning Java";
        System.out.println(str12.indexOf("a"));
        System.out.println(str12.indexOf("av"));
        System.out.println(str12.indexOf("a", 10));
        System.out.println(str12.lastIndexOf("a"));

        System.out.println("str12.indexOf(\"javascript\") = " + str12.indexOf("javascript"));

        String str13 = str12.substring(5);
        System.out.println("str13 = " + str13);

        String str14 = str12.substring(5, 9);
        System.out.println("str13 = " + str14);


    }
}
