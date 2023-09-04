import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 0; num <= n ; num++) {
            System.out.println(num + "");

        }
        //while loop

        int num = 1;
        while(num<= 5) {
            System.out.println(num);
            num += 1;

        }
        //do while
        int n_do = 1;
        do {
            System.out.println("Hello World!");
            n_do++;
        }   while (n_do <= 5);



        }
    }


