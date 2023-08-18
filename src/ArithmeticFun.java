public class ArithmeticFun {
    public static void main(String[] args) {
        int a =10;
        int b = 15;

        //examples of Binary operands
        int result = a + b;
        int difference = a -b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Result is " + result);
        System.out.println("Diff is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);

        result += 20; //result = result + 20

        System.out.println("Result is now " + result);

        //examples of Unary operands
        result ++; //++result;
        System.out.println("result++ " + result);

        result --; //--result;
        System.out.println("result-- " + result);

        product *= 2; //product = product * 2
        System.out.println("Product is now " + product);
    }
}
