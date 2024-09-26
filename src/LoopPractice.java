import java.util.Scanner;

public class LoopPractice {

    public static void main(String [] args) {

        //the largest and smallest values the int data type
        //can hold
        //-do not need to memorize the values
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //if an int goes outside the range of int min and int max
        //unexpected things will happen to its value
        System.out.println(Integer.MAX_VALUE+1);

        //warm up
        //prompt the user to enter 5 numbers using a loop
        //output the largest number and the smallest number
        Scanner s = new Scanner(System.in);

        //want to start the maximum as a small value
        //and the minimum as a big value
//        int big = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("enter a number");
//            int num = s.nextInt();
//
//            //when the newest number is larger than the
//            //prev max, update tha max value
//            if (num > big){
//                big = num;
//            }
//            if (num < small) {
//                small = num;
//            }
//        }
//        System.out.println("biggest is " + big);
//        System.out.println("smallest is " + small);


        String word = "banana";

        //a string's length is how many chars it has
        System.out.println(word.length());

        //a substring is part of a string that you specify
        //with an index (position)

        //-an index is a position in the string
        //-indexing starts at 0

        //since indexing starts at 0, the first n is in position 2
        //substring() will produce the part of the string beginning
        //at the provided index
        System.out.println(word.substring(2));

        //another version of substring() accepts an ending
        //index, but it's exclusive
        //ex: n is index 2, a is index 3
        System.out.println(word.substring(2, 4));

        //nana
        System.out.println(word.substring(2));
        System.out.println(word.substring(2, 6));
        System.out.println(word.substring(2, word.length()));

        //last index is one less than the length

        //b
        //for just one letter, use two consecutive numbers for
        //indices
        System.out.println(word.substring(0, 1));

        System.out.println();

        //use a loop to print each letter of word on its own line
        for (int i = 0; i < word.length(); i++) {
            //i changes from 0 to length-1, which is the
            //index of each letter
            //-to isolate individual letters, use i+1 as the
            //second index
            System.out.println(word.substring(i, i+1));
        }

        System.out.println();

        //palindrome - a word that is spelled the same
        //forward and backward
        word = "racecar";

        //calculate and output whether or not word is a
        //palindrome

        //compare mirroring letters from opposite ends
        //int div is fine and the length being even or
        //odd doesn't affect the outcome
        boolean isPal = true;
        for (int i = 0; i < word.length()/2; i++) {
            String leftLet = word.substring(i, i+1);
            String rightLet = word.substring(word.length()-1-i, word.length()-i);

//            System.out.println(rightLet);

            //once two letters do NOT match, the word is
            //proven to NOT be a palindrome
            if (!leftLet.equals(rightLet)) {
                isPal = false;
            }
        }
        //same as isPal == true
        if (isPal){
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
