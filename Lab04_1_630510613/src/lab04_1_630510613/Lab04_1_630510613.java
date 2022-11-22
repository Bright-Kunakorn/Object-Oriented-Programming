//630510613 Kunakorn Topurin
package lab04_1_630510613;

import java.util.Scanner;


public class Lab04_1_630510613 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        matrix m1 = new matrix();
        System.out.print("Input size :");
        m1.size = input.nextInt();
        m1.MatrixChecked(m1.size);
        
    }
    
}
