
/*6. Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
Let the username: admin, password: admin@123*/


package function_and_array;

import java.util.Scanner;

public class logged_in_to_the_system {
    static Scanner sc=new Scanner(System.in);
    public static String username;
    public static String password;
    public static boolean valid=false;
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            System.out.println("Enter Your User Name:");
            username=sc.nextLine();
            System.out.println("Enter Your Password:");
            password=sc.nextLine();
            if(username.equals("admin") && password.equals("admin@123")){
                valid=true;
                break;
            }
            else {
                continue;
            }
        }

        if ((valid)){
            System.out.println(username+" Logged in Successfully");
        }
        else {
            System.out.println("User has been temporary locked");
        }
    }

}
