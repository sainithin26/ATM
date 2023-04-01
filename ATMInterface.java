package atminterface;

import java.util.*;

public class ATMInterface {

    public static void main(String[] args) {
        
        int balance=100000;
        int amount;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Your account current balance : "+balance);
        System.out.println("");
        
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Transfer");
            System.out.println("Choose 4 for Checking Balance");
            System.out.println("Choose 5 for Exit");
            System.out.println("");
            
            System.out.print("Eneter your choice : ");
            int choice=sc.nextInt();
            System.out.println("");
            
            switch(choice)
            {
                case 1: System.out.print("Enter amount : ");
                        amount=sc.nextInt();
                        System.out.println("");
                        balance=balance-amount;
                        System.out.println("Your account is debited by "+amount);
                        System.out.println("please! collect your money");
                        break;
                        
                case 2: System.out.print("Add Cash :");
                        amount=sc.nextInt();
                        System.out.println("");
                        balance=balance+amount;
                        System.out.println("Your account is credited by "+amount);
                        break;
                        
                case 3: System.out.print("Enter amount :");
                        amount=sc.nextInt();
                        balance=balance-amount;
                        System.out.println("");
                        System.out.println(amount+" is transfered from A to B account");
                        break;
                        
                case 4: System.out.println("Balance in your account : "+balance);
                        break;
                        
                case 5: System.exit(0);
            }
            System.out.println("");
        }
    }
    
}
