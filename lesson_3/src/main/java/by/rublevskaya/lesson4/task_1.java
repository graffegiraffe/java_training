package main.java.by.rublevskaya.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class task_1 {
    public static void task_1() {
        int [] array ={11,22,25,67,89,65,34,69,100};

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("please, enter the number to delete: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number " + number + " not found in the array");
        } else {
            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newArray[index++] = array[i];
                }
            }
            System.out.println("new array after removing: "  + Arrays.toString(newArray));
        }
    }
}
