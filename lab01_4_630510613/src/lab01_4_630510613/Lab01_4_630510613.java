//630510613 kunakorn topurin
package lab01_4_630510613;
package lab01_3_630510613;
import java.util.Scanner;
import java.util.Arrays;

public class Lab01_4_630510613 {

    public static void main(String[] args) {
       int number;
       int[] A ={},B = {},C = {};
       Scanner sn= new Scanner(System.in);
       //loop A
       System.out.println("Enter Array A");
       for (int i=0;i<5;i++)
       {   
           number = sn.nextInt();
           A = Arrays.copyOf(A, A.length + 1);
           A[A.length - 1] = number;
       }
       //loop B
       System.out.println("Enter Array B");
       for (int i=0;i<5;i++)
       {
           number = sn.nextInt();
           B = Arrays.copyOf(B, B.length + 1);
           B[B.length - 1] = number;
       }
       for (int j:A)
       {
           C = Arrays.copyOf(C, C.length + 1);
           C[C.length - 1] = j;
       }
       for (int j:B)
       {
           C = Arrays.copyOf(C, C.length + 1);
           C[C.length - 1] = j;
       }
       for (int i:C)
       {
           String s = String.valueOf(i+" ");
           System.out.print(s);
       }
       
       }
       
}
