//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case


package if_else_loop;

import java.util.Scanner;

public class check_balance_and_withdraw_money_from_ATM_booth {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\t\t\tAssume that You Have Entered Your card");
        System.out.println("\t\t\tDefault PIN is 123\n\n");
        System.out.println("Enter Your PIN:");
        int input = sc.nextInt();
        double user_balance=2000;

        if(input==123){
            System.out.println("Please Select Your desire Option");
            System.out.println("1.Check balance \t2.Withdrawal\n");
            int atm_option=sc.nextInt();
            switch (atm_option){

                case 1:
                    System.out.println("Your Current balance Is:"+user_balance);
                    break;
                case 2:
                    System.out.println("Enter The Amount You want to withdraw: ");
                    int amount=sc.nextInt();
                    if(amount>user_balance){
                        System.out.println("Insufficient balance ");
                        break;
                    }
                    else {
                        user_balance-=amount;
                        System.out.println("Withdrawal Successful!!!\nYour Current balance is :"+user_balance);
                        break;
                    }

                default:
                    System.out.println("Invalid action");
            }

        }
        else{
            System.out.println("Incorrect PIN");
        }

    }
}
