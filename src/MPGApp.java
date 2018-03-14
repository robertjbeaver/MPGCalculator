import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator\n");

        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            BigDecimal miles = new BigDecimal(sc.next());
            
            System.out.print("Enter gallons of gas used: ");
            BigDecimal gallons = new BigDecimal(sc.next());
            
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            // NumberFormat number = NumberFormat.getNumberInstance();
            // number.setMaximumFractionDigits(3);
            // String mpgString = number.format(mpg);
            System.out.println("Miles per gallon is " + mpg.toString() + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }
    
}
