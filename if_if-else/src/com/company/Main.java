package com.company;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //task 1
        //System.out.printf("task 1%nEnter two numbers (A and B)%n");
        //int i1a = input.nextInt();
        //int i1b = input.nextInt();
        //if (i1a > i1b){
        //    i1a = i1a + i1b;
        //    i1b = i1a - i1b;
        //    i1a = i1a -i1b;
        //}
        //System.out.println(i1a);

        //task 2
        //System.out.printf("%ntask 2%nEnter two numbers (A and B)%n");
        //int i2a = input.nextInt();
        //int i2b = input.nextInt();
        //boolean plus = true;
        //boolean plus1 = true;
        //if (i2a >= 0){
        //    plus = true;
        //} else {
        //    plus = false;
        //}
        //if (i2b > 0){
        //    plus1 = true;
        //} else {
        //    if (i2b == 0){
        //        System.out.println("Illegal operation (dividing by zero)!!!");
        //    } else {
        //        plus1 = false;
        //    }
        //}
        //System.out.printf("If %d is divided by %d then the outcome will be: %s%n", i2a, i2b, (plus && plus1 ? "+" : "-"));

        //task 3
        //System.out.printf("%ntask 3%nEnter a = ");
        //int i3a = input.nextInt();
        //System.out.printf("%nEnter b = ");
        //int i3b = input.nextInt();
        //System.out.printf("%nEnter c = ");
        //int i3c = input.nextInt();
        //System.out.println("");
        //if (i3a > i3b){
        //    if (i3a > i3c){
        //        System.out.println("The biggest number is a: " + i3a);
        //    }else {
        //        System.out.println("The biggest number is c: " + i3c);
        //    }
        //}else {
        //    if (i3b > i3c){
        //        System.out.println("The biggest number is b: " + i3b);
        //    }else {
        //        System.out.println("The biggest number is c: " + i3c);
        //    }
        //}

        //task 4
        //System.out.printf("%ntask 4%nEnter a digit 0-9 ");
        //int i4digit = input.nextInt();
        //switch (i4digit){
        //    case 0:
        //        System.out.println("нула"); break;
        //    case 1:
        //        System.out.println("едно"); break;
        //    case 2:
        //        System.out.println("две"); break;
        //    case 3:
        //        System.out.println("три"); break;
        //    case 4:
        //        System.out.println("четири"); break;
        //    case 5:
        //        System.out.println("пет"); break;
        //    case 6:
        //        System.out.println("шест"); break;
        //    case 7:
        //        System.out.println("седем"); break;
        //    case 8:
        //        System.out.println("осем"); break;
        //    case 9:
        //        System.out.println("девет"); break;
        //    default:
        //        System.out.println("not a digit");
        //}

        //task 5
        //System.out.printf("%ntask 5%nКвадратно у-ние:%nEnter \"a\", \"b\" and \"c\"%n");
        //int i5a = input.nextInt();
        //int i5b = input.nextInt();
        //int i5c = input.nextInt();
        //double i5D = (i5b * i5b) - (4 * i5a * i5c);
        //if (i5D >= 0){
        //    if (i5D == 0){
        //        System.out.printf("Има един реален корен: x = %.2f", (double) (-(i5b / (2 * i5a))) );
        //    }else {
        //        double i5x1 = (-i5b + (Math.sqrt(i5D))) / (2 * i5a);
        //        double i5x2 = (-i5b - (Math.sqrt(i5D))) / (2 * i5a);
        //        System.out.printf("Има два реални корена:%nX1 = %.2f%nX2 = %.2f", i5x1, i5x2);
        //    }
        //}else {
        //    System.out.println("Няма релани корени!");
        //}

        //task 6
        //System.out.println("task 6");
        ////int a = 2;
        ////int b = 2;
        ////a++;
        ////b-=-1;
        ////System.out.println(a + " " + b);
        //System.out.println("Enter 5 digits");
        //int i6a = input.nextInt();
        //int i6b = input.nextInt();
        //int i6c = input.nextInt();
        //int i6d = input.nextInt();
        //int i6e = input.nextInt();
        //int i6biggest = i6a;
        //if (i6b > i6biggest){
        //    i6biggest = i6b;
        //}
        //if (i6c > i6biggest){
        //    i6biggest = i6c;
        //}
        //if (i6d > i6biggest){
        //    i6biggest = i6d;
        //}
        //if (i6e > i6biggest){
        //    i6biggest = i6e;
        //}
        //System.out.println("Biggest digit is: " + i6biggest);
        //System.out.println("another one");
        //int i6big = input.nextInt();
        //int i6basi;
        //for (int i = 0; i < 4; i++) {
        //    i6basi = input.nextInt();
        //    if (i6basi > i6big){
        //        i6big = i6basi;
        //    }
        //}
        //System.out.println(i6big);

        //task 7
        //System.out.println("Task 7");
        //System.out.println("three number:");
        //int i7a = input.nextInt();
        //int i7b = input.nextInt();
        //int i7c = input.nextInt();
        //if (i7a + i7b == 0){
        //    System.out.println(i7a + " + " + i7b + " = 0");
        //}else {
        //    if (i7a + i7c == 0){
        //        System.out.println(i7a + " + " + i7c + " = 0");
        //    }else {
        //        if (i7b + i7c == 0){
        //            System.out.println(i7b + " + " + i7c + " = 0");
        //        }else {
        //            System.out.println("there is no zero sum...");
        //        }
        //    }
        //}

        //task 8
        //System.out.println("task 8");
        //int key = 1;
        //System.out.print("Enter points [1..9] \np = ");
        //while (key != 10) {
        //    int i8p = input.nextInt();
        //    switch (i8p) {
        //        case 1:
        //        case 2:
        //        case 3:
        //            System.out.println("Total points: " + (i8p * 10));
        //            break;
        //        case 4:
        //        case 5:
        //        case 6:
        //            System.out.println("Total points: " + (i8p * 100));
        //            break;
        //        case 7:
        //        case 8:
        //        case 9:
        //            System.out.println("Total points: " + (i8p * 1000));
        //            break;
        //        default:
        //            System.out.println("Points are out of range!");
        //            key = 10;
        //    }
        //    System.out.println("Good luck!");
        //}

        //task 9
        System.out.print("task 9\nEnter a number [0..999]: ");
        int i9num = input.nextInt();
        int i9hundreds = i9num / 100;
        int i9dec = (i9num % 100) / 10;
        int i9n = i9num % 10;
        //System.out.println(i9hundreds + " " + i9dec + " " + i9n);
        String s9sto = "";
        switch (i9hundreds) {
            case 0: s9sto = ""; break;
            case 1: s9sto = "Сто"; break;
            case 2: s9sto = "Двеста"; break;
            case 3: s9sto = "Триста"; break;
            case 4: s9sto = "Четиристотин"; break;
            case 5: s9sto = "Петстотин"; break;
            case 6: s9sto = "Шестстотин"; break;
            case 7: s9sto = "Седемстотин"; break;
            case 8: s9sto = "Осемстотин"; break;
            case 9: s9sto = "Деветстотин"; break;
            default: System.out.println("Error at hundreds!");
        }
        String s9edno = "";
        switch (i9n) {
            case 0: s9edno = ""; break;
            case 1: s9edno = "едно"; break;
            case 2: s9edno = "две"; break;
            case 3: s9edno = "три"; break;
            case 4: s9edno = "четири"; break;
            case 5: s9edno = "пет"; break;
            case 6: s9edno = "шест"; break;
            case 7: s9edno = "седем"; break;
            case 8: s9edno = "осем"; break;
            case 9: s9edno = "девет"; break;
            default: s9edno = "Error at first";
        }
        String s9deset = "";
        switch (i9dec) {
            case 0: s9deset = ""; break;
            case 1: switch (i9n) {
                    case 0: s9edno = "десет"; break;
                    case 1: s9edno = "единайсет"; break;
                    case 2: s9edno = "дванайсет"; break;
                    case 3: s9edno = "тринайсет"; break;
                    case 4: s9edno = "четиринайсет"; break;
                    case 5: s9edno = "петнайсет"; break;
                    case 6: s9edno = "шестнайсет"; break;
                    case 7: s9edno = "седемнайсет"; break;
                    case 8: s9edno = "осемнайсет"; break;
                    case 9: s9edno = "деветнайсет"; break;
                    default: s9edno = "Error at tens!";
                } break;
            case 2: s9deset = "двадесет"; break;
            case 3: s9deset = "тридесет"; break;
            case 4: s9deset = "четиресет"; break;
            case 5: s9deset = "педесет"; break;
            case 6: s9deset = "шейсет"; break;
            case 7: s9deset = "седемдесет"; break;
            case 8: s9deset = "осемдесет"; break;
            case 9: s9deset = "деведесет"; break;
            default: s9deset = "Error at dec!";
            }
        System.out.println("");
        String s9stoI = "";
        String s9desetI = "";
        if (i9hundreds != 0 ){
            if (( i9dec == 1 ) | (i9dec != 0 & i9n == 0)){
                s9stoI = " и ";
            }else {
                if (i9dec == 0){
                    s9stoI = "";
                }else {
                    s9stoI = " ";
                }
            }
        }
        if (i9dec != 1 & i9n != 0){
            s9desetI = " и ";
        }else{
            if (i9n == 0){
                System.out.println("Нула");
            }
        }
        System.out.println(s9sto + s9stoI + s9deset + s9desetI + s9edno);
    }
}
