//630510613 kunakorn topurin
package lab04_2_630510613;

import java.util.Scanner;


public class Lab04_2_630510613 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        word w1 = new word();
        System.out.print("Input text :");
        w1.str = input.nextLine();
        w1.Secret(w1.str);
        
    }
    
}
