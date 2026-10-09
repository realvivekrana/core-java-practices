
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age ");
        int age = sc.nextInt();

        System.out.println("Enter Height");
        double height = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
