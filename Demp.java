import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        System.out.println("Enter Your Age :");

        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        System.out.println("Enter Your Weight :");

        if (age > 19) {
            if (weight > 50) {
                System.out.println("You are eligible for blood donation");
            } else {
                System.out.println("You are not eligible for blood donation");
            }
        } else {
            System.out.println("age Must be greater");
        }
    }

}
