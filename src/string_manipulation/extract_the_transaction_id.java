//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//        Output: TXN123456

package string_manipulation;

public class extract_the_transaction_id {
    public static void main(String[] args) {
        String text="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        String numberOnly;
        numberOnly = text.replaceAll("[^\\d]", "");

        System.out.println("The Transaction Id is:");
        System.out.println("TXN"+numberOnly);

    }
}
