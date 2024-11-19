import java.util.*;
class ATM{
    public static void main (String arg[]){
        Scanner input=new Scanner(System.in);
        System.out.println("....WELCOM TO THE ATM MACHIN....");
        System.out.print("Enter your Account Number:");
        int accountNumber=input.nextInt();
        System.out.print("Enter your Telephone Number:");
        int telePhoneNumber=input.nextInt();
        System.out.println();
        System.out.println("........................");
        double balance = 1000;
        double deposit = 0;
        double withdraw = 0;
        while (true) {
            System.out.println();
        System.out.println("1. ----------- Check the balance.");
        System.out.println("2. ----------- Deposit money.");
        System.out.println("3.--------- Withdraw money.");
        System.out.println("4. ----------- Exit.");
        System.out.println();   
        
        System.out.println("Please Select one option:");
        int number=input.nextInt();
        System.out.println();
        
        

        switch (number) {
          
            case 1:
            
                  CheckBalance(balance);
                                
              break;
            case 2:
                 
                   depositMoney(balance,deposit);
                   
              break;
            case 3:
                 
                   withdrawMoney(balance,withdraw);

                
                 

              break;
            case 4  :
                  exit();
                
              return;

            default:
               System.out.println(" Please enter the valid option.");
               System.out.println();
               break;
        
        }
     }

    }
    
    public static void CheckBalance(double balance)
    {
      balance=1000;
      System.out.println("Your current balance is: " + (balance));
      System.out.println(); 
       
      
    } 
    public static void depositMoney(double balance,double deposit){
      double deposit=0;
      System.out.print("Enter your deposit Money: " );
        deposit = input.nextdouble();
    
      balance =  balance + deposit ;
      System.out.println("Your current balance is: " + balance);
      System.out.println();
      
      
    }
    public static void withdrawMoney(double balance,double withdraw){
      double withdraw=0;
      System.out.print("Enter your withdrawal Money: " );
       withdraw = input.nextdouble(); 

      
      
       if (withdraw < balance)  {
          balance = balance - withdraw;
          System.out.println("Your current balance is: " + balance);
          System.out.println();

          } 
       else {
          System.out.println("Your opportunity cannot be met.please enter other amount!");
          System.out.println();

          }
         
      
    }
    public static void exit(){

           System.out.println();
           System.out.println("* .. THANK YOU !COME AGAIN.. *");
           System.out.println("        ***************       ");
    } 
             
   


    
}