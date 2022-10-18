
/*3. Suppose, in a company , here are some employee salaries in an array
        [35000, 25000, 28000, 32500, 44000, 32800]
        Find out the 3rd highest salary*/

package function_and_array;

import java.util.Arrays;

public class find_out_the_3rd_highest_salary {
    public static void main(String[] args) {
        int arr[]={35000, 25000, 28000, 32500, 44000, 32800};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
  }



}
