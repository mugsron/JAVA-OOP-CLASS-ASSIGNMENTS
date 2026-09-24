
import java.util.Scanner;

public class numbers{
        public static void main(String[] args){

                Scanner input = new Scanner(System.in);

                double[] user_numbers = new double[5];
            double sum = 0.0;

      
        System.out.println("Please enter 5 numbers one by one:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            
        
            user_numbers[i] = input.nextDouble();
            
           
            sum = sum + user_numbers[i];
        }

       
        double average = sum / 5;

        System.out.println("\n--- Final Results ---");
        System.out.println("Total Sum: " + sum);
        
       
        System.out.printf("The average of the numbers is: %.3f\n", average);

        
        input.close();


        }


}


