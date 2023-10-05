import java.util.Scanner;
public class SelectionExp201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        int  totalangle;

        System.out.println("Input angle 1:");
        int angle1 = input01.nextInt();
        System.out.println("Input angle 2:");
        int angle2 = input01.nextInt();
        System.out.println("Input angle 3:");
        int angle3 = input01.nextInt();

        totalangle = angle1+angle2+angle3;

        if(totalangle == 180) {}
            if(angle1==90 || angle2==90 || angle3==90)
                System.out.println("Right triangle");
            else 
                System.out.println("Not a right triangle");
        else
            System.out.println("Not a triangle");



        
    }
    
}
