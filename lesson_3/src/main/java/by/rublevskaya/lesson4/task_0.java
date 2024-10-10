package main.java.by.rublevskaya.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class task_0 {
    public static void task_0()  {
    System.out.print("please, enter enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i]= (int) (100*Math.random());
        }

        System.out.println("array: " + Arrays.toString(array));
        System.out.print("please, enter number to search: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (number == array[i]) {
                found = true;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }


}
