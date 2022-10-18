//2.Write a program to calculate GPA and find grade

package if_else_loop;

import java.util.Scanner;

public class calculate_GPA_and_find_grade {
    static  Scanner sc =new  Scanner(System.in);
    public  static boolean fail=false;
    public static  double grade;
    public static  double totalgrade=0;
    public static  double finalgrade;


    //    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Number Of Subject");
        int sub_number= sc.nextInt();

        int inputValue;

        for (int i=1;i<=sub_number;i++){
            System.out.println("Enter marks:");
            inputValue= sc.nextInt();
            if(inputValue<33){

                fail=true;
                break;
            }
            else{

//       sum+=inputValue;

                if(inputValue>=33 && inputValue<=39){

                    grade=1;
                    totalgrade+=grade;
                } else if (inputValue>=40 && inputValue<=49) {
                    grade=2;
                    totalgrade+=grade;
                }
                else if (inputValue>=50 && inputValue<=59) {
                    grade=3;
                    totalgrade+=grade;
                }
                else if (inputValue>=60 && inputValue<=69) {
                    grade=3.5;
                    totalgrade+=grade;
                }
                else if (inputValue>=70 && inputValue<=79) {
                    grade=4;
                    totalgrade+=grade;
                }
                else if (inputValue>=80 && inputValue<=100) {
                    grade=5;
                    totalgrade+=grade;

                }


            }

        }
        if(fail){
            System.out.println("fail");
        }
        else{
            finalgrade=totalgrade/sub_number;
            System.out.println(finalgrade);
            if(finalgrade>=1 && finalgrade<2){
                System.out.println("D grade");
            } else if (finalgrade>=2 && finalgrade<3) {
                System.out.println("C grade");
            }
            else if (finalgrade>=3 && finalgrade<3.5) {
                System.out.println("B grade");
            }
            else if (finalgrade>=3.5 && finalgrade<4) {
                System.out.println("A- grade");
            }
            else if (finalgrade>=4 && finalgrade<5) {
                System.out.println("A grade");
            }
            else {
                System.out.println("A+ Grade");
            }
        }



    }
}
