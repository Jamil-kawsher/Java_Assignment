/*4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.*/


package function_and_array;

import java.util.HashMap;
import java.util.Scanner;

public class bazar_list_pocket_expenditure_search {
    static Scanner sc=new Scanner(System.in);
    public static String serachItem(){

        System.out.println("Enter The Item Name You want to Search");
        String input=sc.nextLine();
        return input;

    }


    public static int totalPrice(String arr[]){
        int fprice=0;
        for (int i=0;i< arr.length-1;i++){
            int value=Integer.parseInt(arr[i]);
//    System.out.println(arr[i]);
            fprice+=value;

        }
        return fprice;
    }
    public static void main(String[] args) {
        String price[] = new String[5];
        HashMap<String, String> bazarList = new HashMap<String, String>();
        bazarList.put("Tomato","120");
        bazarList.put("Alu","30");
        bazarList.put("Gajor","80");
        bazarList.put("Morich","100");
        int j=0;
        for (String i : bazarList.values()) {
//            System.out.println(i);
            price[j]=i;
            j++;
        }

        String value=bazarList.get(serachItem());
        if (value==null){
            System.out.println("Not Found");
        }
        else {

            System.out.println("The Price Is "+value);
        }

        System.out.println("Total Price Of the Whole List Is:"+totalPrice(price));


    }
}
