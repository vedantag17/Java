import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = in.nextInt();
        System.out.print("Enter the second number:");
        int b = in.nextInt();
        System.out.print("Enter the third number:");
        int c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        // maximum of three numbers using Math.max function

        int maxf = Math.max(c, Math.max(a, b));
        System.out.println(maxf);

    }
}
