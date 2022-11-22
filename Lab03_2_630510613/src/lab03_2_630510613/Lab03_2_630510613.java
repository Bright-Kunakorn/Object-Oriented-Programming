//630510613 kunakorn topurin
package lab03_2_630510613;

import java.util.Scanner;

public class Lab03_2_630510613 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        data d1 = new data();
        for (int i=1;i<3;i++){
        System.out.println("Enter data for vehicleparking#"+i);
        System.out.print("Enter vehicle type:");
        d1.SetType(input.next().charAt(0));
        System.out.print("Enter minute:");
        d1.SetTime(input.nextInt());
        System.out.printf("Cost = %.2f Baht(s) \n\n",d1.PrintCost(d1.time, d1.type));
        
        }
    }
    
}
