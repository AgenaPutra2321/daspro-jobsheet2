package minggu5;
import java.util.Scanner;

public class Selection101 {
    public static void main(String[] args) {
        Scanner input01 =new Scanner(System.in);

        System.out.print("Input a number = ");
        int number = input01.nextInt();

         String result = (number% 2 == 0) ? ( number+ " is an even number!" ) : (number + " is an odd numbber");
         System.out.println(result);


            
        }


    }
    

