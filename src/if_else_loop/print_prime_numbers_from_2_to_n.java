
//7. Write a program to print prime numbers from 2 to n

package if_else_loop;

import java.util.Scanner;
import java.util.Stack;

public class print_prime_numbers_from_2_to_n {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> STACK = new Stack<Integer>();
        System.out.println("Enter the nth value:");
        int nth_number= sc.nextInt();
        for(int i=2;i<=nth_number;i++){

            int num = i;
            boolean flag = false;
            for (int j = 2; j <= num / 2; ++j) {
                // condition for nonprime number
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.println();

                STACK.push(num);

            }

        }
        System.out.println("Prime Numbers Are "+STACK);
    }


}
