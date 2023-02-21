import java.util.Scanner ;

public class Atm {
    
public static void main(String args[]){
   
    int balance  = 10000,withdraw,deposit,transfer;
     
    Scanner sc = new Scanner( System.in);
    System.out.println("Welcome...!");
    System.out.println("Enter details to unlock your account");
    System.out.println("Enter user id :" );
    int userid = sc.nextInt();
    System.out.println("Enter pin : ");
    int pin = sc.nextInt();
    if (userid == 12345678 && pin == 9604){
        System.out.println("Your Ac is unlocked");

    }
    else if (userid != 12345678 && pin != 9604){
        System.out.println("Check your details and try again");
        System.exit(0);
        
    
    }
    System.out.println();
     
    while(true){
        System.out.println("Welcome");
        System.out.println("choose 1 to withdraw");
        System.out.println("choose 2 to Deposit");
        System.out.println("choose 3 to Transfer");
        System.out.println("choose 4 to Check Balance");
        System.out.println("choose 5 to Exit");
        System.out.println("Choose your option :");

        int choose = sc.nextInt();
        switch(choose){
            case 1 :
            System.out.println("Your Current Balance is :"+balance);
            System.out.println("Enter the money to withdraw");
            
            withdraw = sc.nextInt();
            if(balance >= withdraw ){
                balance = balance - withdraw;
                System.out.println("Please collect your money");
                System.out.println();
            }
            else{
                System.out.println("insufficient amount");
                System.out.println();
            }
            break;
            case 2 :
            System.out.println("Enter the money to deposit");
            deposit = sc.nextInt();
            
                balance = balance + deposit;
                System.out.println("successfull");
                System.out.println();
            
           
            break;
            case 3 :
            System.out.println("Enter  money to transfer");
            transfer = sc.nextInt();
            System.out.println("Enter Ac no to transfer");
            int Account_no = sc.nextInt();
            if(balance >= transfer ){
                balance = balance - transfer;
                System.out.println("Transfer Successfull");
                System.out.println();
            }
            else{
                System.out.println("Transfer Unsuccessfull");
                System.out.println();
            }
            break;
              
               
             case 4 :
             System.out.println("Available Balance is :"+balance);
             System.out.println();
             
             break;
             case 5 :
             System.out.println("Thank you for Banking with us...!");
             System . exit(0);
          

        }
    }

}
}