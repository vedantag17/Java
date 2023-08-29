import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //type casting
        int num = (int)(7556.647474f);
        System.out.println(num);

        //automatic promotion in expressions
        int a  = 257;
        byte b = (byte)(a);//257 % 256 = 1
        System.out.println(b);

        byte a1 = 88;
        byte b1 = 90;
        byte c1 = 10;
        float d = a1+b1 / c1;
        System.out.println(d);

        byte b2 = 42;
        char c2 = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d1 = 0.1234;
        double result = (f * b2) + (i/c2) - (d1*s);
        // int * double / float = double (Convert complete statement into the highest order)
        System.out.println(result);



    }
}
