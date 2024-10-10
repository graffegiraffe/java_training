package main.java.by.rublevskaya.lesson4;

import java.util.Arrays;

public class task_3 {
    public static void task_3(){
    int[] array1 = {2,45,65,87,90};
    int[] array2 = {34,5,6,87,33};
    System.out.println("array 1:" + Arrays.toString(array1));
    System.out.println("array 2:" + Arrays.toString(array2));

    double average1 = Arrays.stream(array1).average().orElse(0.0);
    double average2 = Arrays.stream(array2).average().orElse(0.0);
    System.out.println("average value of array 1: " + average1);
    System.out.println("average value of array 2: " + average2);

    if (average1 > average2) {
        System.out.println("the average value of Array 1 is greater than the average value of Array 2");
        } else if (average1 < average2) {
        System.out.println("the average value of Array 2 is greater than the average value of Array 1");
        } else {
        System.out.println("the average values of both arrays are equal.");
        }
    }
}
