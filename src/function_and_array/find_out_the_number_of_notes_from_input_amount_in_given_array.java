package function_and_array;

import java.util.Scanner;

public class find_out_the_number_of_notes_from_input_amount_in_given_array {
    public static int amount;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]={1000,500,100,50,20,10,5,2,1};
        System.out.println("Enter The amount:");
        amount=sc.nextInt();
        int note1000=0;
        int note500=0;
        int note100=0;
        int note50=0;
        int note20=0;
        int note10=0;
        int note5=0;
        int note2=0;
        int note1=0;

        for (int i=0;i<arr.length;i++){

          while(amount>=arr[i]){


              if(amount>=1000){

                  amount-=arr[i];

                  note1000++;
              } else if (amount>=500) {
                  amount-=arr[i];

                  note500++;
              }
              else if (amount>=100) {
                  amount-=arr[i];
                  note100++;
              }
              else if (amount>=50) {
                  amount-=arr[i];
                  note50++;
              }
              else if (amount>=20) {
                  amount-=arr[i];
                  note20++;
              }
              else if (amount>=10) {
                  amount-=arr[i];
                  note10++;
              }
              else if (amount>=5) {
                  amount-=arr[i];
                  note5++;
              }
              else if (amount>=2) {
                  amount-=arr[i];
                  note2++;
              }
              else if (amount>=1) {
                  amount-=arr[i];
                  note1++;
              }
          }


        }

        System.out.println("1000 "+note1000+"\n500 "+note500+"\n100 "+note100+"\n50 "+note50+"\n20 "+note20+"\n10 "+note10+"\n5 "+note5+"\n2 "+note2+"\n1 "+note1);
    }
}
