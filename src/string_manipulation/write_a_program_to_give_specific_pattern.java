//
//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

package string_manipulation;

public class write_a_program_to_give_specific_pattern {
    public static void main(String[] args) {
        String text="chattogram";
        String first_letter=text.substring(0,1).toUpperCase();
        String last_letter=text.substring(text.length()-1).toUpperCase();
        String middle_string=text.substring(1,text.length()-1);
        System.out.println(first_letter+middle_string.length()+last_letter);


    }
}
