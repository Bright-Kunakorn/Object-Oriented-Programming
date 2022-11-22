//630510613 kunkaorn topurin
package lab04_3_630510613;

import java.util.Arrays;
import java.util.Scanner;


public class Lab04_3_630510613 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data d1 = new Data();
        System.out.print("Input number of students :");
        d1.N = input.nextInt();
        
        for (int i = 0;i<d1.N;i++)
        {
            System.out.print("Student name: ");
            d1.name = input.next();
            d1.RecName();
            System.out.print("Number of subjects: ");
            d1.NS = input.nextInt();
            System.out.print("Course list :");
            for (int j = 0;j < d1.NS;j++)
            {
                d1.course = input.next();
                d1.RecCourse();
                //System.out.println(Arrays.toString(d1.ArrCourse));
            }       
            d1.RecData();
     
        }
    System.out.print("Input subject for searching :");
    d1.find = input.next();
    String c = d1.find;
    d1.FindCourse(c); 
    }
    
}
