package string_manipulation;

public class how_many_vowels_in_the_given_string {
    public static void main(String[] args) {
        String given_string="roadtosdet";
        int vowel=0;
        String arr[]=given_string.split("");
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals("a")||arr[i].equals("e")||arr[i].equals("i")||arr[i].equals("o")||arr[i].equals("u")){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
