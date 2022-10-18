/*1. Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8]
        Input: 7
        Output: Found in the position 3
        Input: 9
        Output: Found no element*/


package function_and_array;

import java.util.Scanner;

public class check_if_the_number_exists_in_the_array {
    static Scanner sc=new Scanner(System.in);
    public static int index_num=-1;
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 7, 2, 4, 6, 8};

        System.out.println("Enter the value You want to search:");
        int input=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==input){
                index_num=i;
            }

        }
        if(index_num>-1){
            System.out.println("Found at  "+index_num+" Number");
        }
        else{
            System.out.println("Not Found");
        }

    }


}
