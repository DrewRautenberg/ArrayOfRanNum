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

        //GET N FROM USER
        // NOTE:  Need to find N BEFORE declaring array
        int n = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter number of gpa's to generate (like 50)"));
        //DECLARATIONS
        Random r = new Random(1976);            // use a SEED so multiple runs
        // give the same set of numbers
        int[] gpa = new int[n];

        double total = 0;
        double tempMax = 0.0;
        double tempMin = 4.0;
        int[] counter = new int[7];
        for(int i = 0; i < counter.length; i++)
            counter[i] = 0;
        //FILL ARRAY WITH GPA'S

        for (int i=0;i<n;i++){
            gpa[i]=r.nextInt(4);
        }

        //FIND STATS
        // HINT:  List all the steps you need to do with ONE ARRAY ELEMENT.
        //          Then put that code inside a loop.
        // QUESTION:  What's the appropriate type of loop to use?
        //      - a while or for loop?
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        for (int i=0;i<n;i++){
            total+=gpa[i];

            for (int j = 0; j < n; j++) {
                if (gpa[j] > tempMax) {
                    tempMax = gpa[j];
                }
            }
            for (int k = 0; k < n; k++) {
                if (gpa[i] < tempMin) {
                    tempMin = gpa[k];
                }
            }
        }

        for (int i=0;i<n;i++){
            if (gpa[i]>=3.5){
                counter[0] +=1;
            }
            else if (gpa[i]<3.5 && gpa[i]>=3){
                counter[1] +=1;
            }
            else if (gpa[i]<3 && gpa[i]>=2.5){
                counter[2] +=1;
            }
            else if (gpa[i]<2.5 && gpa[i]>=2){
                counter[3] +=1;
            }
            else if (gpa[i]<2 && gpa[i]>=1.5){
                counter[4] +=1;
            }
            else if (gpa[i]<1.5 && gpa[i]>=1){
                counter[5] +=1;
            }
            else {
                counter[6]+=1;
            }
        }


        //FINISH UP
        printReport(total, n, tempMax, tempMin, counter);
        System.exit(0);
    }
    private static int decideIndex() {                       // NEEDS PARAMETER
        int index = 0;

        // no clue how this should be used


        return index;
    }
    private static void printReport(double total, int n, double tempMax,
                                    double tempMin, int[] counter)      {

        String[] label = {  ">= 3.5      ",
                "3.0 to < 3.5",
                "2.5 to < 3.0",
                "2.0 to < 2.5",
                "1.5 to < 2.0",
                "1.0 to < 1.5",
                "< 1.0       "  };

        System.out.printf("\nAverage of %d gpa\'s is %.2f\n\tMax is %.2f, " +
                "Min is %.2f\n", n, total / n, tempMax, tempMin);

        for (int i=0;i<7;i++){
            System.out.println(label[i]+" "+counter[i]);
        }



        System.out.println("\n\nTHE END");
    }
}