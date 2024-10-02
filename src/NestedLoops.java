public class NestedLoops {
    public static void main (String [] args) {
        //nested loops are when loops can go in other loops

        int count = 0;
        for (int i = 0; i < 5; i++) {

            //IMPORTANT - inner loop should use a different
            //variable than the outer loop
            for (int j = 0; j < 10; j++) {
                //50 lines of output from 5 * 10
                //every time i changes, the j loop runs from
                //beginning to end
                count++;
                System.out.println(count + " - potato, i is " + i + ", j is " + j);
            }
        }

        System.out.println();

        //nested loops can be used to print 2d grids/designs

        //outer loop controls how many horizontal rows
        for (int i = 0; i < 4; i++) {

            //inner loop controls how many elements in a row
            for (int j = 0; j < 8; j++) {
                //use print() and not println() to keep things in
                //the same horizontal row
                System.out.print("x");
            }

            //use println() after the inner loop finishes the row
            //to add a line break
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i < 10; i++) {

            //the length of each line changes depending on the i value
            for (int j = 0; j < i; j++) {
                //when i is 0, the inner loop doesn't run bc the
                //condition is not true to begin with
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        //decrement the outer loop to get the longer rows first
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        //goal: produce the same shape as previous
        //but with an incrementing outer loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("x");
            }
            System.out.println();
        }


    }
}

//programming practice #6
// number of x change by 2 each row
// think about spacing on the left


//       x
//     x x x
//   x x x x x
// x x x x x x x