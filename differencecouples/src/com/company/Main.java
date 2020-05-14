//Дадени са 2*n-на брой числа. Първото и второто формират двойка, 
//третото и четвъртото също и т.н. Всяка двойка има стойност – сумата 
//от съставящите я числа. Напишете програма, която проверява дали всички 
//двойки имат еднаква стойност или печата максималната разлика между две 
//последователни двойки. Ако всички двойки имат еднаква стойност, отпечатайте 
//"Yes, value = {Value}" + стойността. В противен случай отпечатайте "No, maxdiff = {Difference}" + максималната разлика.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int a = 0;
        int b = 0;
        if (counter > 0){
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        int currentdif;
        int maxdiff = Integer.MIN_VALUE;
        int previous = a + b;
        int current;
        boolean equal = true;
        if (counter > 1){
            for (int i = 1; i < counter ; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                current = a + b;
                if (previous != current){
                    equal = false;
                    currentdif = (Math.abs(Math.max(previous,current) - Math.min(previous,current)));
                    //currentdif = (Math.max((Math.abs(previous)),(Math.abs(current))) - (Math.min((Math.abs(previous)),(Math.abs(current)))));
                    if ( currentdif > maxdiff){
                        maxdiff = currentdif;
                    }
                }
                previous = current;
            }
        }
        if(equal){
            System.out.println("Yes, value = " + previous);
        }else {
            System.out.println("No, maxdiff = " + maxdiff);
        }
    }
}