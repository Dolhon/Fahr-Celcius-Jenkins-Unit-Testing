package fahrcelcius;

import java.util.Scanner;

/**
 *
 * @author Dolhon
 */
public class FahrCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float temp;
        Scanner in = new Scanner(System.in);      

        System.out.println("Enter temperatue in Fahrenheit");
        temp = in.nextInt();
        temp = (temp - 32)*5/9;
        System.out.println("Celcius = " + temp);
        
        /*System.out.println("Enter temperatue in Celcius");
        temp = in.nextInt();
        temp = temp * 9 / 5 + 32;

        System.out.println("Fahrenheit = " + temp);
    */}
    
}
