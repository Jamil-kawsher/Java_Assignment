//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?


package string_manipulation;

public class laptop_purchase_price {
    public static void main(String[] args) {


        String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        String numberOnly;
        numberOnly = str.replaceAll("[^\\d]", "");
        String   main_price=numberOnly.substring(1,6);
        String discount=numberOnly.substring(6);
        double fprice=    Double.parseDouble(main_price);
        double fdiscount=   Double.parseDouble(discount);
        double  fdiscountf=((fdiscount/100)*fprice);

        System.out.println("Total price "+(fprice-fdiscountf));



    }
}
