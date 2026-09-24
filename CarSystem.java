import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        int mainChoice;
        int totalCarsOrdered = 0;
        double totalCheckoutPrice = 0.0;
        
       
        String carInventoryList = ""; 

        
        do {
            System.out.println("\n===== CAR SYSTEM MENU =====");
            System.out.println("1. AddCar");
            System.out.println("2. ViewCar");
            System.out.println("3. Checkout Price");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            mainChoice = input.nextInt();

            switch (mainChoice) {
                case 1: // Functionality: AddCar
                    System.out.println("\n--- Available Cars Selection ---");
                    System.out.println("1. Premo  - $20,000");
                    System.out.println("2. Toyota - $30,000");
                    System.out.println("3. Audi   - $50,000");
                    System.out.print("Select a car number to add to your order: ");
                    int carSelection = input.nextInt();
                    
                    // Branching logic to match prices and names from the provided table
                    if (carSelection == 1) {
                        totalCheckoutPrice += 20000;
                        carInventoryList += "- Premo ($20,000)\n";
                        totalCarsOrdered++;
                        System.out.println("Premo added successfully!");
                    } else if (carSelection == 2) {
                        totalCheckoutPrice += 30000;
                        carInventoryList += "- Toyota ($30,000)\n";
                        totalCarsOrdered++;
                        System.out.println("Toyota added successfully!");
                    } else if (carSelection == 3) {
                        totalCheckoutPrice += 50000;
                        carInventoryList += "- Audi ($50,000)\n";
                        totalCarsOrdered++;
                        System.out.println("Audi added successfully!");
                    } else {
                        System.out.println("Invalid car selection. No vehicle added.");
                    }
                    break;

                case 2: // Functionality: ViewCar
                    // Section (d): Display output based on user's interaction
                    System.out.println("\n--- Current Cars in Order ---");
                    if (totalCarsOrdered == 0) {
                        System.out.println("Your cart is empty. No cars added yet.");
                    } else {
                        System.out.print(carInventoryList);
                        System.out.println("Total items: " + totalCarsOrdered);
                    }
                    break;

                case 3: // Functionality: Checkout Price
                    // Section (d): Display final invoice summary and pricing
                    System.out.println("\n--- Order Checkout Summary ---");
                    if (totalCarsOrdered == 0) {
                        System.out.println("Checkout failed. Your cart is empty.");
                    } else {
                        System.out.print(carInventoryList);
                        System.out.printf("Total Checkout Price Due: $%,.2f\n", totalCheckoutPrice);
                        System.out.println("Transaction finalized successfully!");
                        
                        // Clear the system state fields after successful checkout process
                        totalCarsOrdered = 0;
                        totalCheckoutPrice = 0.0;
                        carInventoryList = "";
                    }
                    break;

                case 4: // Functionality: Exit
                    System.out.println("Exiting CarSystem application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice selection. Please pick between 1 and 4.");
                    break;
            }

        } while (mainChoice != 4);

        // Section (e): Clean up and close the scanner resource
        input.close();
    }
}
