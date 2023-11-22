import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        int ans = sum_re();
        System.out.println(ans);
        int ans3 = sum3(20, 30);
        System.out.println(ans3);
    }

    static int sum_re() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();

        int sum_re = num1 + num2;
        return sum_re;
    }
    static int sum3(int a, int b) {
        int sum3 = a+b;
        return sum3;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);
    }

}
