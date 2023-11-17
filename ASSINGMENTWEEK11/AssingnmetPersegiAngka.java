package ASSINGMENTWEEK11;

import java.util.Scanner;

public class AssingnmetPersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        for (int h=0;h<5;h++) {
            //bintang 5 kolom
            for(int i=0;i<5;i++){
                if(h==0 || h==4 || i==0 || i==4 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
