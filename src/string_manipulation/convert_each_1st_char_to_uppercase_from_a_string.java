//8. Write a program to convert each 1st char to uppercase from a string
//        Input: rahim lives in sylhet
//        Output: Rahim Lives in Sylhet

package string_manipulation;

public class convert_each_1st_char_to_uppercase_from_a_string {
    public static void main(String[] args) {
        String text = "rahim lives in sylhet";
        String final_capitalize_word="";
        String arr[] = text.split(" ");
        String arr2[]=new String[4];



        for (int i=0;i<arr.length;i++){

            String text1 = arr[i];
            String first_letter = String.valueOf((char) text1.charAt(0)).toUpperCase();


            String sub_string = text1.substring(1);
            String final_string=first_letter+sub_string;
            arr2[i]=final_string;
        }

        for (int i=0;i<arr2.length;i++){
            final_capitalize_word+=" "+arr2[i];

        }
        System.out.println(final_capitalize_word.substring(1));
    }

}
