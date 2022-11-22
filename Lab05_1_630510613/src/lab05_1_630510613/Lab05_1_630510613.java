//630510613 kunakorn topurin
package lab05_1_630510613;

import java.util.Scanner;

public class Lab05_1_630510613 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,c,sumCredit =0;
        double sumGrade = 0;
        String g;
        
        GPA g1 = new GPA();
        System.out.print("Input N :");
        N = input.nextInt();
        for (int i=0;i<N;i++){
            System.out.printf("Subject #%d\n",i+1);
            System.out.print("Input Grade:");
            g = input.next();
            System.out.print("Input Credit:");
            c = input.nextInt();
            g1.SetCreadit(c);
            sumCredit += c; 
            sumGrade += g1.GetGrade(g)*c;
        }               
       g1.CalGrade(sumGrade,sumCredit);
       System.out.println("GPA = " + g1.GetTotalGrade());
    }
    
}
