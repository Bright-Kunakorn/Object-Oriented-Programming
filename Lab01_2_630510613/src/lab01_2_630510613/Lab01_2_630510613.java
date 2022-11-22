//kunakorn topurin 630510613
package lab01_2_630510613;
import java.util.Scanner;
import java.util.Arrays;

public class Lab01_2_630510613 {

    public static void main(String[] args) {
        int score,count = 0;
        int[] student = {};
        int sum = 0;
        boolean exit = false;
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter score between 1-100 or press 0 for stop");
        while (exit == false)
        {
            score = sn.nextInt();
            if (score == 0)
            {
                exit = true;
            }
            else if (score <=100 && score >0)
            {
                sum += score;
                student = Arrays.copyOf(student, student.length + 1);
                student[student.length - 1] = score;
            
            }
            else
            {
                System.out.println("Enter score again (between 1-100 or press 0 for stop)");    
            }
        }
        int min = Arrays.stream(student).min().getAsInt();
        int max = Arrays.stream(student).max().getAsInt();
        System.out.println(student);
        for (int i : student )
        {
            if (i < (sum/student.length))
            {
                count++;
            }
        }
        System.out.print("Maximum Score =");
        System.out.println(max);
        System.out.print("Minimum Score =");
        System.out.println(min);
        System.out.print("Average Score =");
        System.out.println(sum/student.length);
        System.out.print("The number of students who scored below average score = ");
        System.out.println(count);
                 
    }
    
}
