package function_and_array;

import java.util.Arrays;

public class generate_20_random_number_and_find_max_min_duplicate {
    public static boolean flag = false;

    public static void main(String[] args) {
        int arr2[] = new int[20];
        int dubli[] = new int[10];

//        int rand_num1 ;
//        System.out.println(rand_num1);

        for (int i = 0; i < 20; i++) {


            arr2[i] = (int) (Math.random() * 101);
            ;

        }
        Arrays.sort(arr2);
        System.out.println("Min number: " + arr2[0]);
        System.out.println("Min number: " + arr2[arr2.length - 1]);
for (int i=0;i<arr2.length;i++){


}
        System.out.println("dublicate values:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j])
                    System.out.println(arr2[j]);
                flag=true;
            }


        }

    }


}
