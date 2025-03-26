import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = obj.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your weight :");
        int weight = sc.nextInt();

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
