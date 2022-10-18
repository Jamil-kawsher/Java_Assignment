//6. Write  a program to find the factorial of a given number

package if_else_loop;

import java.util.Scanner;

public class factorial_of_a_given_number {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        double value=1;
        System.out.println("Enter The Number:");
        double input=sc.nextDouble();
        while(input>=1){
value*=input;

input--;
        }
        System.out.println("facterial value is :"+value);

    }
}
