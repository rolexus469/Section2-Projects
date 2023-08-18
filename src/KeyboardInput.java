import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;


        System.out.println("What is your name?");
        name = keyboard.nextLine();


        System.out.println("what's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); //consume the newline

        System.out.println("enter your real number of choice");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine(); //consume the newline

        realNumber *= 2;

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("age is " + age);
        System.out.println("the real number is: " + realNumber);
        System.out.println("city is " + city);

    }//end main
}
