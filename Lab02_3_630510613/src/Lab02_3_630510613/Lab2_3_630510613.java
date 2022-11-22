//630510613 kunakorn topurin
package Lab02_3_630510613;
import java.util.Scanner;

public class Lab2_3_630510613 {

    public static void main(String[] args) {
        int number;
        Scanner sn= new Scanner(System.in);
        System.out.print("Enter number:");
        number = sn.nextInt();
        checkOddEven(number);
        if (checkPrime(number)) {  
           System.out.printf("%d is a prime number\n",number);  
       } else {  
           System.out.printf("%d is not a prime number\n",number);  
       }  
    }
    public static void checkOddEven(int number)
    {
       if (number%2 == 0)
       {
           System.out.printf("%d is even number.\n",number);
       }
       else
       {
           System.out.printf("%d is odd number.\n",number);
       }
    }
    public static boolean checkPrime(int number)
    {
        if (number <= 1) 
        {  
           return false;  
        }  
       for (int i = 2; i < Math.sqrt(number); i++) {  
           if (number % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
    }  
        
}
    


