
package minggu4;
import java.util.Scanner;

public class Circle01 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double circumference, area, phi;
        System.out.println("Input radius: ");
        phi = 3.14;
        r = input.nextInt();
        area = phi*r*r;
        circumference = 2*phi*r;
        System.out.println("Area " +area);
        System.out.println("Circumference "+circumference);
        

        
    }
}