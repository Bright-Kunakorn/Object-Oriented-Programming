//630510613 kunakorn topurin
package lab03_1_630510613;

import java.util.Scanner;
public class Lab03_1_630510613 {
    public static void main(String[] args) {
        double constant =0;
        Scanner sn = new Scanner(System.in);
        Data d1 = new Data();
        System.out.print("Enter sex: ");
        d1.SetGender(sn.next().charAt(0));
        
        System.out.print("Enter weight: ");
        d1.SetWeight(sn.nextDouble());
        
        System.out.print("Enter height: ");
        d1.SetHeight(sn.nextDouble());
        
        if (d1.gender == 'M' ||  d1.gender == 'm')
        {
            constant = 100;
        }
        else if(d1.gender == 'F' ||  d1.gender == 'f')
        {
            constant = 110;
        }
        
        if (d1.weight > d1.height-constant)
        {
            System.out.println("Your shape is not OK.");
        }
        else
        {
            System.out.println("Your shape is OK.");
        }
    }   
}
