//1. Write a program to check if inputted letter is small or capital


package if_else_loop;

import java.util.Scanner;

public class letter_is_small_or_capital_1 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        char input = sc.next().charAt(0);

        if(input>='a' && input<='z'){

            System.out.println("Small Letter");
        } else if (input>='A' && input<='Z') {
            System.out.println("Capital Letter");
        }
        else{

            System.out.println("Invalid Input");
        }

    }


}
