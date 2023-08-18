import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        String Adjective;
        String Girls_Name;
        String Adjective2_Occupation1;
        String Place;
        String Clothing;
        String Hobby;
        String Adjective3_Occupation2;
        String Boys_Name;
        String Mans_Name;

        System.out.println("Enter an adjective");
        Adjective = keyboard.nextLine();

        System.out.println("Enter a girls' name");
        Girls_Name = keyboard.nextLine();

        System.out.println("Enter an occupation");
        Adjective2_Occupation1 = keyboard.nextLine();

        System.out.println("Enter a place");
        Place = keyboard.nextLine();

        System.out.println("Enter a type of clothing");
        Clothing = keyboard.nextLine();

        System.out.println("Enter a hobby");
        Hobby = keyboard.nextLine();

        System.out.println("Enter an occupation");
       Adjective3_Occupation2 = keyboard.nextLine();

        System.out.println("Enter a boys' name");
        Boys_Name = keyboard.nextLine();

        System.out.println("Enter a mans' name");
        Mans_Name = keyboard.nextLine();

        System.out.println("There once was a " + Adjective + " girl named " + Girls_Name + " , who was a " + Adjective2_Occupation1 + " in the Kingdom of " + Place + " . She loved to wear " + Clothing + " and to " + Hobby + " . She wanted to marry the " + Adjective3_Occupation2 + " named " + Boys_Name + " but her father, King " + Mans_Name + " forbid her from seeing him.");





    }
}
