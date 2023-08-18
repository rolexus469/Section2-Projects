public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 27;
        int yourAge = 33;
        int bobsAge = 20;

        int currentAge = 27;
        int testedAge = 21;

        String myName = "Rosey";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge = bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match?: " + nameComparison);

        boolean ageTest = currentAge == testedAge;
        System.out.println("do ages match?: " + ageTest);


    }//end of main
}
