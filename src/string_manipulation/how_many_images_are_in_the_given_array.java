package string_manipulation;

public class how_many_images_are_in_the_given_array {
    public static void main(String[] args) {
        String arr[]={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        int img=0;
        for (int i=0;i<arr.length;i++){

//    System.out.println(arr[i].contains(".jpg"));

            if(arr[i].contains("jpg")||(arr[i].contains(".png"))){
                img++;
            }
        }
        System.out.println("Total number of Image :"+img);
    }
}
