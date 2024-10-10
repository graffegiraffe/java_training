package main.java.by.rublevskaya.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("please, choose a task number: ");
        Scanner scan = new Scanner(System.in);
        int task = scan.nextInt();
        switch (task) {
           case 0:
               task_0.task_0();
               break;
           case 1:
                task_1.task_1();
                break;
           case 2:
               task_2.task_2();
               break;
           case 3:
               task_3.task_3();
               break;
            default:
                System.out.println("invalid task number");
        }

    }
}