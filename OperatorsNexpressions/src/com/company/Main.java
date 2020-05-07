package com.company;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
/*
        //task 1
        System.out.println("task 1");
        int i1 = 6;
        System.out.println((i1 % 2 == 0) ? "even" : "odd");
        System.out.println();

        //task 2
        System.out.println("task 2");
        int i2 = 35;
        boolean b1 = i2 % 5 == 0;
        boolean b2 = i2 % 7 == 0;
        boolean b3 = b1 & b2;
        System.out.println("The number can be divided by 5 and 7: " + b3);
        System.out.println();

        //task 3
        System.out.println("task 3");
        int i3 = 700;
        int i3a = i3 / 100;
        int i3b = i3a % 10;
        System.out.println( i3b % 7 == 0 ? "the third digit is Seven" : "Not 7");
        System.out.println();

        //task 4
        System.out.println("task 4");
        int i4 = 5;
        System.out.println("Number: " + i4);
        int i4mask = 4;
        int i4a = i4 & i4mask;
        System.out.println( i4a != 0 ? "The third bit is 1" : "The third bit is 0");
        System.out.println();

        //task 5
        System.out.println("task 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side \"a\" (integer): ");
        int i5a = scanner.nextInt();
        System.out.print("Enter side \"b\" (integer): ");
        int i5b = scanner.nextInt();
        int i5area = i5a * i5b;
        int i5perimeter = 2 * (i5a + i5b);
        System.out.printf("The area of the rectangle is: %d%nAnd the perimeter is: %2d%n" , i5area, i5perimeter);
        System.out.println();

        //task 6
        System.out.println("task 6");
        int i6a = 4;
        int i6b = 5;
        int i6h = 4;
        System.out.println("The area of \"Trapec\" is: " + ((i6a + i6b) / 2 * i6h));
        System.out.println();

        //task 7
        System.out.println("task 7");
        float fl7weight = scanner.nextFloat();
        System.out.println("Weight: " + fl7weight + "Kg");
        float fl7Earth = 9.8f;
        System.out.println("earth :" + fl7Earth);
        int i7MoonProcentage = 17;
        System.out.println("Procent: " + i7MoonProcentage);
        float fl7Moong = (fl7Earth / 100) * i7MoonProcentage;
        System.out.println("Gravitaciq na lunata: " + fl7Moong + "G");
        System.out.println((fl7weight / fl7Earth) * fl7Moong);
        System.out.println();

        //task 8
        System.out.println("task 8");
        System.out.println("Enter coordinate (x,y - integer) of \"O\".");
        int i8x = scanner.nextInt();
        int i8y = scanner.nextInt();
        int i8kx = 0;
        int i8ky = 0;
        int i8kr = 5;
        float fl8 = (float) Math.sqrt((i8x * i8x) + (i8y * i8y));
        System.out.println( fl8 <= i8kr ? "In circle" : "Out Of");
        System.out.println();

        //task 9
        System.out.println("task 9");
        System.out.println("Enter coordinate (x,y - integer) of \"O\".");
        int i9x = scanner.nextInt();
        int i9y = scanner.nextInt();
        int i9kx = 0;
        int i9ky = 0;
        int i9kr = 5;
        int i9p1x = -1;
        int i9p1y = 1;
        int i9p2x = 5;
        int i9p2y = 5;
        int i9pxmin = (Math.min(i9p1x, i9p2x));
        int i9pxmax = (Math.max(i9p1x, i9p2x));
        int i9pymin = (Math.min(i9p1y, i9p2y));
        int i9pymax = (Math.max(i9p1y, i9p2y));
        //System.out.println(i9pxmin);
        //System.out.println(i9pxmax);
        //System.out.println(i9pymin);
        //System.out.println(i9pymax);
        float fl9 = (float) Math.sqrt((i9x * i9x) + (i9y * i9y));
        boolean b9inc = fl9 <= i9kr;
        System.out.println( b9inc ? "In circle" : "Out Of Circle");
        boolean b9inx = (i9x >= i9pxmin && i9x <= i9pxmax);
        boolean b9iny = (i9y >= i9pymin && i9y <= i9pymax);
        boolean b9inRectangle = (b9inx && b9iny);
        System.out.println("In pravoygylnika: " + b9inRectangle);
        System.out.println( b9inRectangle && b9inc ? "Double in!" : "nope");

        //task 10
        System.out.printf("task 10%n%nEnter four digits number:");

        int i10in = scanner.nextInt();
        int i10st = i10in % 10;
        int i10nd = (i10in / 10) % 10;
        int i10rd = (i10in / 100) % 10;
        int i10th = (i10in / 1000) % 10;
        System.out.println(i10st);
        System.out.println(i10nd);
        System.out.println(i10rd);
        System.out.println(i10th);
        //a
        System.out.println("The sum is: " + (i10st + i10nd + i10rd + i10th));
        //b
        System.out.println("" + i10st + i10nd + i10rd + i10th);
        int i10rev = i10st*1000 + i10nd*100 + i10rd*10 + i10th;
        System.out.println("as an int: " + i10rev);
        //c
        System.out.println("" + i10st + i10rd + i10nd + i10th);
        //d
        System.out.println("" + i10th + i10nd + i10rd + i10st);
        System.out.println();

        //task 11
        System.out.printf("task 11%n%nEnter number \"N\": ");

        int i11N = scanner.nextInt();
        System.out.print("Enter position: ");
        int i11p = scanner.nextInt();
        //double d11mask = Math.pow(2, (i11p - 1));
        double d11mask = 1 << (i11p -1);
        int i11mask = (int) d11mask;
        System.out.println("Mask: " + i11mask);
        byte by11 = (byte) ((i11N & i11mask) != 0 ? 1 : 0);
        System.out.printf("The bit on position %1$d is: %2$d%n",i11p, by11);
        System.out.println();

        //task 12
        System.out.printf("task 12%n%nNumber n= ");

        int i12n = scanner.nextInt();
        System.out.print("Position of the bit p= ");
        int i12position = scanner.nextInt();
        System.out.print("Value of the bit (0/1) v= ");
        byte b12v = scanner.nextByte();
        double d12mask = 1 << i12position;
        int i12mask = (int) d12mask;
        byte b12bitis = (byte) (((i12n & i12mask) != 0) ? 1 : 0);
        int i12sw = (b12bitis == b12v) ? i12n : (i12n ^ i12mask);
        System.out.printf("The mask is: %2$d%nThe bit on position %1$d is: %3$d%nThe Number after change os: %4$d%n", i12position, i12mask, b12bitis, i12sw);
*/
        //task 13
        System.out.printf("task 13%nNumber to check n= ");
        Scanner scanner = new Scanner(System.in);
        int i13check = scanner.nextInt();
        int i13 = (int)Math.ceil(Math.sqrt(i13check));
        System.out.println(i13);
        for (int i = 2; i <= i13; i++) {
            System.out.println((i13check % i) == 0 ? ("Deli se na " + i) : "nope");
        }

    }
}
