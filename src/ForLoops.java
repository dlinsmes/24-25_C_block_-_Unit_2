import java.util.Scanner;

public class ForLoops {
    public static void main(String [] args) {
        //warm up
        //keep asking the user to enter a number
        //until they enter a multiple of 7
        Scanner s = new Scanner(System.in);

//        System.out.println("enter a number");
//        int uNum = s.nextInt();
//
//        //loop runs when the num is NOT a mult of 7
//        while( uNum % 7 != 0) {
//            System.out.println("enter a number");
//            uNum = s.nextInt();
//        }
//        System.out.println("that is a mult of 7");

        //while loops are condition-based - don't necessarily know
        //how many times it should run - it runs until the
        //condition becomes false

        //for loops are iteration-based - use when you (or the program)
        //can predetermine how many times to iterate


        //initialization - int i = 0 - start a variable with a value
        //condition - i < 10 - loop will run as long as this is true
        //advancement/increment - i++ - update the looping variable so
        //the condition eventually becomes false so the loop will stop
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //before an iteration (turn) of the loop, the condition is checked
        //the advancement step (i++) is applied after each iteration
        // of the loop

        //9 is the last value printed bc after that, i++ changes i to 10,
        //so the condition is no longer true

        //i only exists within the scope of the for loop
        //System.out.println(i);

        //-can have multiple consecutive for loops that all use an i var
        System.out.println();

        //the advance step can add or subtract whatever number you want
        //-add 2 to i each iteration
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //count down from 20 to 15
        for(int i = 20; i >= 15; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //for loops can always be rewritten as whiles loops
        int x = 20;
        while(x >= 15) {
            System.out.print(x + " ");
            x--;
        }
        System.out.println();

        //can't necessarily write all while loops as for loops
        //see warmup for example - don't know how many times
        //the loop needs to run

        //use a loop to ask the user for 3 numbers, then print
        //the sum of those numbers (once)

        //declare a sum variable BEFORE the loop so that
        //each iteration can add on to the existing value
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter a number");
            int num = s.nextInt();
            sum = sum + num; //same as sum += num
        }
        System.out.println("sum is " + sum);

        //ask the user for what number they want multiples of
        //and how many multiples to print
        //ex: 3 then 5
        //out: 3 6 9 12 15
        System.out.println("what num do you want multiples of?");
        int mult = s.nextInt();
        System.out.println("how many multiples?");
        int quantity = s.nextInt();

        //loop (quantity) times
        for (int i = 0; i < quantity; i++) {
            System.out.print(mult * (i+1) + " " );
        }
    }
}
