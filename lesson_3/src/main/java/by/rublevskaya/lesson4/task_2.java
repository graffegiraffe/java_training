package main.java.by.rublevskaya.lesson4;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class task_2 {
    public static void task_2(){
        System.out.print("please, enter enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i]= (int) (10*Math.random());
        }

        System.out.println("array: " + Arrays.toString(array));

        OptionalInt max = Arrays.stream(array).max();
        OptionalInt min = Arrays.stream(array).min();
        double average = Arrays.stream(array).average().orElse(0.0);

        System.out.println("max value: " + max.getAsInt());
        System.out.println("min value: " + min.getAsInt());
        System.out.println("average value: " + average);
    }
}
