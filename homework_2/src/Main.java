import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("select task number: ");
    int taskNumber = scan.nextInt();
    switch (taskNumber) {
        case 1:
            System.out.print("enter the value x, which needs to be checked for parity: ");
            int x = scan.nextInt();
            if (x % 2 == 0) {
                System.out.println("this x is even");
            }
            else {
                System.out.println("this x is odd");
            }
            break;
        case 2:
            System.out.print("enter the value of temperature: ");
            int temperature = scan.nextInt();
            if (temperature > -5) {
                System.out.println("this temperature is warm");
            }
            else if (temperature >= -20) {
                System.out.println("this temperature is normal");
            }
            else {
                System.out.println("this temperature is cold");
            }
        case 3:
            for (int i=10; i <=20; i++ ){
                System.out.println("square of the number " + i + ": " + (i*i));
            }
            break;
        case 4:
            int a =7;
            while (a<= 98){
              System.out.print( a + " " );
              a+=7;
            }
            break;
        case 5:
            System.out.print("enter any positive integer: ");
            int b;
            while (true) {
                if (scan.hasNextInt()) {
                    b = scan.nextInt();
                    if (b > 0) {
                        break;
                        }
                    else {
                            System.out.println("error, number is not positive, please try again");
                        }
                    }
                    else {
                        System.out.println("error, number is not an integer, please try again");
                        scan.next();
                    }
                }
            int sum = 0;
            for (int i = 1; i <= b; i++) {
                sum += i;
            }
            System.out.println( "sum of numbers is: " + sum);
            break;
        default: System.out.println("error,there is no such task");
    }





    }
}