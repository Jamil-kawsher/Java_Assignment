//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
//After your purchase what will be your total cost?


package string_manipulation;

public class total_cost_sharee_shirt {
    public static void main(String[] args) {
        String str=" Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";

        str = str.replaceAll("[^\\d]", "");
        String shirt=str.substring(0,4);
        String sharee=str.substring(4,8);
        String shirtq=str.substring(8,9);
        String shareeq=str.substring(9,10);
        String discount=str.substring(10);

        int shirt_i=Integer.parseInt(shirt);
        int sharee_i=Integer.parseInt(sharee);
        int shirtq_i=Integer.parseInt(shirtq);
        int shareeq_i=Integer.parseInt(shareeq);
        int discount_i=Integer.parseInt(discount);


        System.out.println("total cost:"+((shirt_i*shirtq_i+sharee_i)-discount_i));
    }
}
