//630510613 kunakorn topurin
package lab02_1_630510613;
import java.util.Scanner;

public class Lab02_1_630510613 {

    public static void main(String[] args) {
       int number;
       String Aplabet;
       Scanner sn= new Scanner(System.in);
       System.out.print("Enter Aplabet: ");
       Aplabet = sn.nextLine();
       System.out.print("Enter number: ");
       number = sn.nextInt();
       char patten = Aplabet.charAt(0);
        switch (patten) {
            case 'A', 'a' -> printStartA(number);
            case 'B', 'b' -> printStartB(number);
            default -> System.out.println("Good Bye");  
        }
    }
    public static void printStartA(int number) 
    {
        int i,j;
        for(i = number;i>=1;i--)
        {
            for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
            System.out.println();
        }
    }
    public static void printStartB(int number) 
    {
        int i, j;  
        for(i=0; i<number; i++)
        {
            for(j=number-i; j>1; j--)
            {           
                System.out.print(" ");
            } 
            for(j=0; j<=i; j++)
            {       
                System.out.print("*");
            }           
            System.out.println();
        }
        
    }
}
