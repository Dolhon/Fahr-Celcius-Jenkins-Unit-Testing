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
    
    public FahrCelcius(){}
    
    public float FahrToCelc(float temp) {
        return (temp - 32) * 5 / 9;
    }
    
    public float CelcToFahr(float temp) {
        return temp * 9 / 5 + 32;
    }
    
    public static void main(String[] args) {
        FahrCelcius Conv = new FahrCelcius();
        /*Scanner in = new Scanner(System.in);
        float temp;

        System.out.println("Enter temperatue in Fahrenheit");
        temp = in.nextInt();
        temp = (temp - 32)*5/9;*/
        System.out.println("Celcius = " + Conv.FahrToCelc(100));
        
        /*System.out.println("Enter temperatue in Celcius");
        temp = in.nextInt();
        temp = temp * 9 / 5 + 32;

        System.out.println("Fahrenheit = " + temp);
    */}
    
}
