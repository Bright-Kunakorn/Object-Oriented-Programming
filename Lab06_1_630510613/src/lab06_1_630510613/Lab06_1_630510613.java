//630510613 Kunakorn Topurin
package lab06_1_630510613;

import java.util.Scanner;


public class Lab06_1_630510613 {

    public static void main(String[] args) {
        drawing myDrawing = new drawing();
        Scanner input = new Scanner(System.in);
        System.out.print("enter N:");
        int N = input.nextInt();
        System.out.print("Enter X:");
        char X = input.next().charAt(0);
        myDrawing.drawingangle(N);
        myDrawing.drawTriangle(N, X);
    }
    
}
