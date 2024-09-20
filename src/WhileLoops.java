import java.util.Scanner;

public class WhileLoops {

    public static void main(String [] args) {

        //variable scope - where you declare a variable
        //defines where it can be seen/used

        int a = 2;
        // a is declared in main, and it can be accessed
        //and changed anywhere after that point in main()

        if (a < 5) {
            a = 20;

            //b is declared in the if-statement -
            //it can only be used within this if-statement
            int b = 10;
            System.out.println(b);
        }

        //the variable b does not exist outside the
        //scope of the if-statement
        //System.out.println(b);

        System.out.println(a);

        //declare the variable first, then assign
        //a value later
        String word;
        if (a > 5) {
            word = "something";
        }
        else {
            word = "banana";
        }
        System.out.println(word);

        System.out.println();

        //loops allow code to be repeated
        //while loops are condition-based
        //-like repeating if-statements
        //-run as long as the condition is true

        int x = 0;

        //the condition of the loop will be checked each time
        //before the code runs
        while (x < 5) {
            System.out.println(x);

            //adds one to the existing value of x
            x++;
        }
        //x DOES become 5, but at that point the loop condition
        //is no longer true, so the loop does not continue,
        //then program execution proceeds to the following lines

        System.out.println("x after the loop is "  + x);

        x = 0;
        while (x < 5) {
            x++;
            //add one to x BEFORE printing
            //-the code in the loop will run to completion
            //before the condition gets checked again
            System.out.println(x);
        }

        x = 0;
        //infinite loop - BAD
        //important to make sure the condition eventually becomes false
        //otherwise the loop will run forever
        //-since x is always 0, 0 is always less than 5, so the looped code
        //will keep printing 0 forever
//        while (x < 5) {
//            System.out.println(x);
//        }

        //while loops are good for when you don't know how many times it
        //needs to run, but limit the repetitions by some other condition

        Scanner s = new Scanner(System.in);
        System.out.println("enter quit to stop or anything else to keep going");
        String input = s.nextLine();

        //loop continue as long as the input is NOT quit
        while (!input.equals("quit")) {
            System.out.println("enter quit to stop or anything else to keep going");
            input = s.nextLine();
        }
        System.out.println("you typed quit");

        System.out.println("enter 1, 2, or 3");
        int num = s.nextInt();

        //can be express what's valid first, THEN negate the whole thing
        // !(num == 1 || num == 2 || num == 3)
        //   num != 1 && num != 2 || num != 3
        // !(num >= 1 && num <= 3)
        //  num < 1 || num > 3
        while(!(num == 1 || num == 2 || num == 3)) {
            System.out.println("enter 1, 2, or 3");
            num = s.nextInt();
        }
        System.out.println("good job");

        s.nextLine();

        System.out.println("say yes");
        input = s.nextLine();
        while(!input.equals("yes")) {
            System.out.println("say yes");
            input = s.nextLine();
        }
        System.out.println("good job");


        //BAD - do not do - will deduct
        System.out.println("say yes");
        input = s.nextLine();
        while (true) {
            if (input.equals("yes")) {
                break; //exit loop
            }
            else {
                System.out.println("say yes");
                input = s.nextLine();
            }
        }

    }
}
