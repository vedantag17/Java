import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Vedant Agrawal");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                switch (department) {
                    case "AIDS" -> System.out.println("AIDS Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
