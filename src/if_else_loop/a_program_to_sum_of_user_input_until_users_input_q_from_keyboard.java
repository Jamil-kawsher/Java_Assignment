//9. Write a program to sum of user input until users input ‘q’ from keyboard

package if_else_loop;

import java.util.Scanner;

public class a_program_to_sum_of_user_input_until_users_input_q_from_keyboard {

    static Scanner sc=new Scanner(System.in);
    public static int sum=0;
    public static void main(String[] args) {



        try {


            while (true){
                String input_string=sc.nextLine();

//                input_string=sc.nextLine();
                if(input_string.equals("q")){

                    break;
                }
                else {
                    int input_int=Integer.parseInt(input_string);
                    sum+=input_int;

                }


            }

        }
        catch (Exception e){

            System.out.println(sum);

        }


    }

}
