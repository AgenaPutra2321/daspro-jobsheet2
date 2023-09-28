package minggu5;
import java.util.Scanner;

public class Selection201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float FinalExam = input01.nextFloat();

        System.out.print("Nilai uts     : ");
        float midexam = input01.nextFloat();

        System.out.print("Nilai kuis    : ");
        float quiz = input01.nextFloat();

        System.out.print("Nilai tugas   : ");
        float assingment = input01.nextFloat();

        float total = (FinalExam * 0.4F ) + (midexam * 0.3F ) + (quiz * 0.1F ) + (assingment * 0.2F );
        String message = total < 65 ? "Retake" : "Pass";
        System.out.println("Final Grade = " + total + "and the decission is " + message);
        
    }
    
}
