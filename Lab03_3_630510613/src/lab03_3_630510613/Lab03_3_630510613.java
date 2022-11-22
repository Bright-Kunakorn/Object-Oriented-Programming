//630510613 kunakorn topurin
package lab03_3_630510613;

import java.io.PrintStream;
import java.util.Scanner;

public class Lab03_3_630510613 {


    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N:");
        N = input.nextInt();        
        student s1 = new student();
        
        for (int i = 1;i<N+1;i++){
            System.out.println("Enter data for student #"+i);
            System.out.print("Enter student ID:");
            s1.id = input.nextLong();
            System.out.print("Enter midterm and final scores:");
            s1.Mid = input.nextInt();
            s1.Final = input.nextInt();
            s1.GetData();
        }
        for (int j = 0;j<N;j++){
            System.out.println(j+1+"  "+s1.arrID[j]+"   "+s1.arrScore[j]+"   "+s1.arrGrade[j]);
        }
        
    }
}
