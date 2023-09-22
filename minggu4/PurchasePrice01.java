package minggu4;
import java.util.Scanner;

public class PurchasePrice01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int price, quantity;
        double Discount=0.1, totalPrice, purchasePrice, totalDiscount;
        System.out.println("Input price: ");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();

        totalPrice=price*quantity;
        totalDiscount=totalPrice*Discount;
        purchasePrice=totalPrice-totalDiscount;
        System.out.println("Total discouont: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);

            }
}