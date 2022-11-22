//630510613 kunakorn topurin
package lab05_3_630510613;

import java.util.Scanner;

/**
 *
 * @author brigh
 */
public class Lab05_3_630510613 {


    public static void main(String[] args) {
        int c;
        menu m = new menu();        
        stack s = new stack();
        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        while (isExit == false){
        System.out.print("""
                         **********
                         1.push
                         2.pop
                         3.show
                         4.exit
                         **********
                         Please select choice : """);
        c = input.nextInt();
        m.setChoice(c);
        switch (c) {
            case 1 ->{
                if (s.isFull() == false){
                System.out.print("Enter number:");
                }
                int x = input.nextInt();
                s.push(x);
                }
            case 2 -> s.pop();
            case 3 -> s.show();
            case 4 -> {
                isExit = true;
                System.out.print("Bye bye");
            }
            default -> {
            }
        }
        
    }
    
    }
}
