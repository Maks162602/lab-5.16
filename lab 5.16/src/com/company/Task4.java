package com.company;
import java .util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        int a1 = (int) (Math.random()*3+1);
        int a2 = (int) (Math.random()*3+1);
        int a3 = (int) (Math.random()*3+1);

        Scanner m1 = new Scanner(System.in);
        Scanner m2 = new Scanner(System.in);
        Scanner m3 = new Scanner(System.in);
        Scanner m4 = new Scanner(System.in);
        Scanner m5 = new Scanner(System.in);
        Scanner m6 = new Scanner(System.in);

        System.out.println("Потрібно ввести три числа від 1 до 3");

        int p1 = m1.nextInt();
        int p2 = m2.nextInt();
        int p3 = m3.nextInt();

        if (a1==p1 && a2==p2 && a3==p3) {
            System.out.println("Ви вгадали, and became the winner ");
        }
        else {
            System.out.println("Ви не вгадали, have another try");
        }

        System.out.println("Введіть знову три числа від 1 до 3");

        int b4 = m4.nextInt();
        int b5 = m5.nextInt();
        int b6 = m6.nextInt();

        if (a1==b4 && a2==b5 && a3==b6) {
            System.out.println("Ви вгадали, and became the winner ");
        }
        else {
            System.out.println("Ви не вгадали, the game is over");
        }



        System.out.println("Програма згенерувала такі числа");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
