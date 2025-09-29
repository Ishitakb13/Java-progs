package bank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1001, "Alice", 1000.0);
        int choice = 0;
  {
        	            
       System.out.println("1. Deposit");
       System.out.println("2. Withdraw");
       System.out.println("3. Show Balance");
       System.out.println("4. Exception ");
       System.out.print("Enter your choice: ");

  try {
	  choice = scanner.nextInt();	                
	  switch (choice) {
      case 1:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = scanner.nextDouble();
          account.deposit(depositAmount);
          break;
      case 2:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = scanner.nextDouble();
          account.withdraw(withdrawAmount);
          break;
      case 3:
          account.showBalance();
          break;             
      case 4:
          System.out.println("Trying to withdraw 9999...");
          account.withdraw(9999);
          break;
      default:
          System.out.println("Invalid choice. Please try again.");
  }

  } catch (InputMismatchException e) {
    System.out.println("Error: Please enter numeric input.");
    scanner.nextLine(); 
  } catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
  } catch (InsufficientBalanceException e) {
    System.out.println( e.getMessage());
  }

   } while (choice != 5);

      scanner.close();
  }
 }  	                    
        	                   

        	                   

        	                   