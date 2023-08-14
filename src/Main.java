import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number...");
        n1 = input.nextInt();
        System.out.println("Enter second number...");
        n2 = input.nextInt();
        System.out.println("Enter third number...");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)){
            System.out.println("The first number is bigger than other numbers");
        } else if ((n1 > n2) && !(n1 > n3)) {
            if (n1 == n3) {
                System.out.println("The first number is equal to the third number");
            } else {
                System.out.println("The third number is bigger than other numbers");
            }
        } else if (!(n1 > n2) && (n1 > n3)) {
            if (n1 == n2) {
                System.out.println("The first number is equal to the second number");
            } else {
                System.out.println("The second number is bigger than other numbers");
            }
        } else {
            System.out.println("The second number is bigger than other numbers");
        }
    }
}