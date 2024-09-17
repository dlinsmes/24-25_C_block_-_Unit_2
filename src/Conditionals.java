import java.util.Scanner;
public class Conditionals {

    public static void main(String [] args) {

        //simulate flipping a coin

        //use a random number [1,2]
        //1 is heads
        //2 is tails

        int r = (int)(Math.random() * 2 ) + 1;

        //a boolean expression can be used as a condition
        //-when the condition is true, the code in the
        // if-statement will run
        if (r == 1) {
            System.out.println("heads");
        }
        //when the condition of the previous if is false,
        //the code in ELSE will run
        else {
            System.out.println("tails");
        }

        //ELSE is optional - if you don't have an else
        //clause, no alternate code will run when the
        //condition isn't true

        //user inputs 3 ints, program outputs the largest

        //s is just a variable name - use what you want
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 numbers");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }

        //these two if-statements both run independently,
        //so regardless of whether max is a, b will also be
        //checked (and potentially the ELSE statement will run)

        if (b > a && b > c) {
            max = b;
        }
        //ELSE is only attached to the immediate previous IF
        else {
            max = c;
        }
        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //ELSE IF will allow for multiple conditional branches
        //to be checked, and only the first condition that's
        // true will trigger code to run.
        //-any other conditions AFTER the one that runs won't
        //be checked and won't run additional code
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }

        System.out.println("max is " + max);

        //when the code to run in a conditional is only one \
        // line, you don't need { }
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        System.out.println("max is " + max);

        //switching from num input to string input
        //will skip the first input line - use an extra
        //.nextLine()
        s.nextLine();

        String realPW = "1234";
        System.out.println("enter your password");
        String userPW = s.nextLine();

        //use .equals() for strings, == for ints, doubles, booleans
        if (userPW.equals(realPW)) {
            System.out.println("wow good job i'm so proud of you A+++++++!!!!11121");
        }
        //user doesn't put anything in and presses enter
        else if (userPW.length() == 0) {
            System.out.println("you didn't enter anything you dumdum");
        }
        //user's pw is the same length as the realPW
        //-if the pw is correct, the first if-statement is true, and
        //none of the following branches will check or run
        else if (realPW.length() == userPW.length()) {
            System.out.println("nice try but WRONG!!!!!");
        }

        //int x = 3;
        //you can't add code between if/else-if/else branches

        else {
            System.out.println("NO TRY AGAIN");
        }

        //get a number and check if it's between 10 and 20, too low, or too high

        System.out.println("enter a number between 10 and 20");
        int num = s.nextInt();

        if (num > 10 ) {

            //if-statements can be nested in other if-statements
            //both > 10 AND < 20
            if (num < 20) {
                System.out.println("good job");
            }
            //it's true that num > 10, but it's NOT < 20
            else {
                System.out.println("too high");
            }
        }
        //NOT > 10
        else {
            System.out.println("too low");
        }

    }
}
