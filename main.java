
import java.util.Scanner;

public class main {   
    public static void main(String[] args) {
       Scanner Scan = new Scanner (System.in);
       int pinCorrect = 1234;
       int pin;
       int attempts =0;
       double initialBalance= 2500.75 ;
       int transactions = 0;
       do{
           System.out.println("write the pin");
           pin = Scan.nextInt();
           attempts =attempts+1;
           if (pin!=pinCorrect)
           {
               System.out.println("incorrect pin");
           }
          
         }while( pin!=pinCorrect && attempts<3 );
               
        if (pin==pinCorrect)
               {System.out.println("Login successful");
               while (true) {

                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Show Account Status");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = Scan.nextInt();
                 if (choice == 5) {
                    System.out.println("Thank you for using our ATM.");
                    System.out.println("Total successful transactions: " + transactions);
                    break; 
                 }
                 
       switch(choice){
           case 1 ->            {
               System.out.println("the current balance : " + initialBalance );
           }
           case 2 -> { 
               System.out.println("Enter deposit amount: ");
               double deposit=Scan.nextDouble();
               if(deposit>0) 
               {
               initialBalance= initialBalance + deposit ;
               transactions = transactions + 1 ;
                   System.out.println("Deposit successful ");
                   System.out.println("Updated balance: " + initialBalance + "$");
               } else {System.out.println("invalid Acount ");}
           }
           case 3 -> {
               System.out.println("Enter the amount");
               double Withdraw =Scan.nextDouble();
               if ( Withdraw > 0 && Withdraw < initialBalance )
               { initialBalance = initialBalance - Withdraw;
                   System.out.println("Withdrawal successful. ");
                   System.out.println("Updated balance:  " + initialBalance + "$" );
               } else if (Withdraw==0)
               {
              System.out.println("Transaction cancelled.");
               } else {
                   System.out.println(" Insufficient balance ");               
               }
             }
           case 4 -> {
              if (initialBalance >= 5000)
              {
                  System.out.println("Account status: VIP Customer");
              }
              else if(initialBalance >=1000){
                  System.out.println("Account status: Regular Customer");
              
              }else{ System.out.println("Account status: Low Balance");
           }
           }
                default -> 
                    System.out.println("Invalid option.");
                   
           }
               }
    
    
    
    
    
    }else{
            System.out.println("Your account has been locked.");
        }


 }   
   
}   
    
        
    

