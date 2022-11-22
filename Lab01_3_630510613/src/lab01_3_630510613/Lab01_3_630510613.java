//630510613 kunakorn topurin
package lab01_3_630510613;
import java.util.Scanner;

public class Lab01_3_630510613 {

    public static void main(String[] args) {
    
    int N,sum,n,temp = 0;
    Scanner sn= new Scanner(System.in);
    System.out.print("Enter N: ");
    N = sn.nextInt();
    n = N;
    sum = N;
    while ( n>=5)
    {   
        temp = n%5;
        n = n/5;
        n = n*2;
        sum += n;
        n = n+temp;
    }
     System.out.printf("Total number of drinking bottles= %d The remaining empty bottles= %d\n",sum,n);
    }
    
}
