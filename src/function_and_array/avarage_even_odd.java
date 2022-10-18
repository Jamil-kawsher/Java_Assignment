//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(),
//countEvenNumbers(), countOddNumbers()


package function_and_array;

import java.util.Scanner;

public class avarage_even_odd {
    public static int countEvenNumbers(int arr[]){
        int even=0;
        for (int i=0;i<arr.length;i++){



            if(arr[i]%2==0){
                even++;
            }


        }

        return even;
    }


    public static int countOddNumbers(int arr[]){
        int odd=0;
        for (int i=0;i<arr.length;i++){



            if(arr[i]%2!=0){
                odd++;
            }


        }

        return odd;
    }



    public static int average(int arr[]){
        int avg=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){



        sum+=arr[i];



        }

        return (sum/5);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int arr2[]=new int[5];


        for (int i=0;i<5;i++){


            arr2[i]=sc.nextInt();

        }
        int num_of_even=countEvenNumbers(arr2);
        int num_of_odd=countOddNumbers(arr2);
        int avg=average(arr2);
        System.out.println("Total Even Numbers: "+num_of_even);
        System.out.println("Total odd Numbers: "+num_of_odd);
        System.out.println("Average is: "+avg);

    }
}
