import java.util.Scanner;

public class SelectionExp101 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.println("Input year ");
        int year = input01.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
            
        input01.close();
    }
}
