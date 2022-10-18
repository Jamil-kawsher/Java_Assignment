/* 8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers.
 If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.*/

package if_else_loop;

import java.util.Scanner;

public class random_number_guessing_game {
    static Scanner sc = new Scanner(System.in);
public static int points=0;
    public static void main(String[] args) {

        System.out.println("\t\tWelcome to Guessing Game");
        System.out.println("\t\tGuess a Number from 1 to 99");
        System.out.println("\t\tYou can Try for 10 times");




for (int i=1;i<=10;i++){
    double rand_num1 = Math.random() * 100;
    double rand_num2 = Math.random() * 100;
    int fvalue1 = (int) rand_num1;
    int fvalue2 = (int) rand_num2;
//    System.out.println(fvalue1+" "+ fvalue2);
    int input = sc.nextInt();




    if(input==fvalue1||input==fvalue2){
        points++;
    }


}

        System.out.println("Total Points:"+points);
    }
}
