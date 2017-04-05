/*
 *April 5
 *Calculates the cost to print an inputted number of pages
 */

package s5e1;
import java.util.Scanner;

/**
 *
 * @author eljam3239
 */
public class S5e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numCopies;
        double cost_per_copy, total$ = 0, costdisplay;
        System.out.println("Please input the number of copies you'd like to print:");
        numCopies = input.nextDouble(); // retreives the number of pages from the user
        if (numCopies>=0 && numCopies<=99) {
        cost_per_copy = 0.30;
        total$ = cost_per_copy*numCopies;
        
        } else if(numCopies>=100 && numCopies<=499) {
        cost_per_copy = 0.28;
        total$ = cost_per_copy*numCopies;
        } else if (numCopies>=500 && numCopies<=749){
            cost_per_copy = 0.27;
            total$ = cost_per_copy*numCopies;
        } else if (numCopies>=750 && numCopies<= 100){
            cost_per_copy = 0.26;
            total$ = cost_per_copy*numCopies;
        } else if (numCopies > 100){
            cost_per_copy = 0.25;
            total$ = cost_per_copy*numCopies; //determines how much many the pages will cost to print
        }
        costdisplay = Math.round(total$*100.00)/100.00; //displays the cost with two decimal places
        System.out.println("You want "+numCopies+". That'll be $"+total$); // prints the result
    }
    
}
