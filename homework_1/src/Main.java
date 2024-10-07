import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
//task_1
        System.out.print("enter the value b: ");
        int b = scan.nextInt();
        System.out.print("enter the value c: ");
        int c = scan.nextInt();
        int a =  4 * (b + c - 1) / 2;
        System.out.println("result: " + a);
//task_2
        System.out.print("enter the value n (two-digit): ");
        int n = scan.nextInt();
        int first = n/10;
        int second = n%10;
        int sum = first + second;
        System.out.println("sum of digits: " + sum);
//task_3
        System.out.print("enter the value N (three-digit): ");
        int N = scan.nextInt();
        int First = N/100;
        int Second = (N/10)%10;
        int Third = N%10;
        int Sum = First + Second + Third;
        System.out.println("sum of digits: " + Sum);
//task_4
        System.out.print("enter a real number k: ");
        double k = scan.nextDouble();
        long rounding = Math.round(k);
        System.out.println("rounding is: " + rounding);
//task_5
        System.out.print("enter the value q: ");
        int q =scan.nextInt();
        System.out.print("enter the value w: ");
        int w =scan.nextInt();
        int division = q / w;
        int remainder = q%w;
        System.out.println("division is: " + division + "\n" + "remainder is: " + remainder);
//task_6_1.0
        System.out.print("enter the value A: ");
        int A = scan.nextInt();
        System.out.print("enter the value B: ");
        int B = scan.nextInt();
        int temp = A;
        A = B;
        B = temp;
        System.out.println("A = " + A + "\nB = " + B);
//task_6_2.0
        System.out.print("enter the value AA: ");
        int AA = scan.nextInt();
        System.out.print("enter the value BB: ");
        int BB = scan.nextInt();
        AA = AA ^ BB;
        BB = AA ^ BB;
        AA = AA ^ BB;
        System.out.println("A = " + AA + "\nB = " + BB);
    }
}