import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double realNumber1;
        double realNumber2;
        double realNumber3;

        System.out.println("Please enter your first real # : ");
        realNumber1 = keyboard.nextDouble();

        System.out.println("Please enter your second real # : ");
        realNumber2 = keyboard.nextDouble();

        System.out.println("Please enter your third real # : ");
        realNumber3 = keyboard.nextDouble();


        double sumOfReals = realNumber1 + realNumber2 + realNumber3;

        double avgOfReals = sumOfReals / 3;

        System.out.println("The average of three is: " + avgOfReals);

    }
}