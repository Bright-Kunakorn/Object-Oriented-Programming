package lab06_1_630510613;

/**
 *
 * @author brigh
 */
public class drawing {
     public void drawingangle(int N) {
         for (int i =0;i<N;i++)
         {
            for (int j = 0;j<i+1;j++)
             {
                System.out.print("*");
             }
            System.out.println(); 
         }
     }
     public void drawTriangle(int N, char X){
         for (int i =0;i<N;i++)
         {
            for (int j = 0;j<N-i;j++)
             {
                System.out.print(X);
             }
            System.out.println(); 
         }  
     }
    
}
