package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //task 1
        byte byte1 = -115;
        byte byte2 = 97;
        short short1 = -10000;
        int integer1 = 52130;
        int integer2 = 4825932;

        //task 2
        double double1 = 34.567839023D;
        float float2 = 12.345f;
        double double3 = 8923.1234857d;
        float float4 = 3456.091f;
        System.out.printf("34.567839023d vs %1$.9f %n12.345f vs %2$.3f%n8923.1234857d vs %3$.7f%n3456.091f vs %4$.3f%n", double1, float2, double3, float4);

        //task 3
        int t4 = 0x100;
        System.out.println("result: " + t4);
        System.out.println("another one bits the dust: " + (Integer.toOctalString(t4)));
        System.out.printf("another one:  %x%n", t4);
        System.out.println("another one:  0x" + (Integer.toHexString(t4)));

        //task 4
        boolean isMale = true;
        System.out.println(isMale);

        //task 5
        String st5 = "Hello";
        String st5a = "World";
        Object ob5 = st5 + " " + st5a;
        System.out.println(ob5);
        String st5b = String.valueOf(ob5);
        String st5c = ob5 + "!";
        System.out.println("end of 5: " + st5b);
        System.out.println(st5c);

        //task 6
        String str6 = "The \"use\" of quotations causes difficulties.";
        System.out.println(str6);

        //task 7
        System.out.println("");
        System.out.println("");
        System.out.println("       *");
        System.out.println("      ***");
        System.out.println("    *******");
        System.out.println("  ***********");
        System.out.println("***************");

        //task 8
        System.out.println("");
        System.out.println("   **     **");
        System.out.println(" ****** ******");
        System.out.println(" *************");
        System.out.println("   *********");
        System.out.println("     *****");
        System.out.println("       *");

        //task 9
        String t9firstName = "Lacho";
        String t9FamilyName = "Gerovski";
        byte t9age = 34;
        char t9sex = 'M';
        int t9ID = 27569876;
        System.out.println(t9ID);

        //task 10
        int t10a = 5;
        int t10b = 10;
        System.out.printf("Value of A: %1$d%nValue of B: %2$d%n", t10a, t10b);
        t10a = t10a + t10b;
        t10b = t10a - t10b;
        t10a = t10a - t10b;
        System.out.printf("After the change:%nValue of A: %1$d%nValue of B: %2$d%n", t10a, t10b);
        
    }
}
