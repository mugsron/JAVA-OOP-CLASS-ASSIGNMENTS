import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);
  
        double balance = 50000.0; 
        int choice;
        double amount;

      
        do {
            
            System.out.println("\n===== MUGALYA'S BANK ATM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit ATM System");
            System.out.print("Please select an option (1-4): ");
            
      
            choice = input.nextInt();

           
            switch (choice) {
                
                case 1:
                  
                    System.out.printf("Your current balance is: Shs %,.2f\n", balance);
                    break;
                    
                case 2:
                    
                    System.out.print("Enter the amount to deposit: ");
                    amount = input.nextDouble();
                    
                    if (amount > 0) {
                        balance =balance + amount; 
                        System.out.printf("Successfully deposited Shs %,.2f\n", amount);
                        System.out.printf("New balance: Shs %,.2f\n", balance);
                    } else {
                        System.out.println("Error: Invalid deposit amount.");
                    }
                    break;
                    
                case 3:
                    
                    System.out.print("Enter the amount to withdraw: ");
                    amount = input.nextDouble();
                    
                    
                    if (amount > 0 && amount <= balance) {
                        balance -= amount; 
                        System.out.printf("Successfully withdrew Shs %,.2f\n", amount);
                        System.out.printf("Remaining balance: Shs %,.2f\n", balance);
                    } else if (amount > balance) {
                        System.out.println("Error: Insufficient funds available.");
                    } else {
                        System.out.println("Error: Invalid withdrawal amount.");
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Thank you for banking with Mugalya's Bank. Goodbye!");
                    break;
                    
                default:
                   
                    System.out.println("Invalid selection. Please choose an option between 1 and 4.");
                    break;
            }

       
        } while (choice != 4);

        
        input.close();
    }
}
