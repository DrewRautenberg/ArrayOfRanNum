/* PROJECT:  ArrayOfRanNum
 * AUTHOR:  Drew Rautenberg                   DESIGNER:  Dr. Kaminski
 * DESCRIPTION:  This program:
 *      - fills an array of size N (where N is specified by the user)
 *              with random gpa's between 0.0 and 4.0
 *      - USING THE ARRAY (and NOT the input data stream of data from Random
 *                              Number Generator)
 *              finds average, max, min
 *              and how many gpa's are in each of these categories:
 *                  >= 3.5
 *                  3.0 to < 3.5
 *                  2.5 to < 3.0
 *                  2.0 to < 2.5
 *                  1.5 to < 2.0
 *                  1.0 to < 1.5
 *                  < 1.0
 *      - prints these stats out to the Console, nicely labelled
 * IMPORTANT NOTE:  This double-pass through the data
 *              1st) generating random numbers to fill the array
 *              2nd) going through the array as a stream to calculate the stats
 *      is NOT the most efficient way to do this task but DO IT THAT WAY TO
 *      PRACTICE USING ARRAYS.
 *****************************************************************************/
package arrayofrannum;

import javax.swing.JOptionPane;
import java.util.Random;

public class ArrayOfRanNum {

    public static void main(String[] args) {

        //----------------------------------------------------- GET N FROM USER
        // NOTE:  Need to find N BEFORE declaring array
        int n = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter number of gpa's to generate (like 50)"));
        //-------------------------------------------------------- DECLARATIONS
        Random r = new Random(1903);            // use a SEED so multiple runs
        // give the same set of numbers

        // TO DO:  declare array storage for n random numbers


        double total = 0;
        double tempMax = 0.0;
        double tempMin = 4.0;
        int[] counter = new int[7];
        for(int i = 0; i < counter.length; i++)
            counter[i] = 0;
        //----------------------------------------------- FILL ARRAY WITH GPA'S

        // TO DO



        //---------------------------------------------------------- FIND STATS
        // HINT:  List all the steps you need to do with ONE ARRAY ELEMENT.
        //          Then put that code inside a loop.
        // QUESTION:  What's the appropriate type of loop to use?
        //      - a while or for loop?
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        // TO DO








        //----------------------------------------------------------- FINISH UP
        printReport(total, n, tempMax, tempMin, counter);
        System.exit(0);
    }
    //*************************************************************************
    private static int decideIndex() {                       // NEEDS PARAMETER
        int index = 0;

        // TO DO


        return index;
    }
    //*************************************************************************
    private static void printReport(double total, int n, double tempMax,
                                    double tempMin, int[] counter)      {

        String[] label = {  ">= 3.5      ",
                "3.0 to < 3.5",
                "2.5 to < 3.0",
                "2.0 to < 2.5",
                "1.5 to < 2.0",
                "1.0 to < 1.5",
                "< 1.0}      "  };

        System.out.printf("\nAverage of %d gpa\'s is %.2f\n\tMax is %.2f, " +
                "Min is %.2f\n", n, total / n, tempMax, tempMin);

        // TO DO



        System.out.println("\n\nTHE END");
    }
}