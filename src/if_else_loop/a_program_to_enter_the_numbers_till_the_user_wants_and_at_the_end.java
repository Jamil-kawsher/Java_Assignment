
//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.


package if_else_loop;

import java.util.Arrays;
import java.util.Scanner;

public class a_program_to_enter_the_numbers_till_the_user_wants_and_at_the_end {
    static Scanner sc=new Scanner(System.in);
    int number;
   public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {

        restart:
        while(true){


            int input= sc.nextInt();
            if(input > max)
            {
                max = input;
            }

            if(input < min)
            {
                min = input;
            }

            System.out.println("Do You want to continue:\n 1.Yes 2. No");
            int yesno= sc.nextInt();
            if (yesno==1){
                continue restart;

            }
            else{
                break ;
            }
        }
        System.out.println("Smallest Value: "+min);
        System.out.println("Largest value: "+max);

    }
}
