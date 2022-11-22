//630510613 kunakorn topurin
package lab02_2_630510613;

import java.util.Scanner;

public class Lab02_2_630510613 {

    public static void main(String[] args) {
        int n,i = 1,x,y;
        int Qaudrant1=0,Qaudrant2=0,Qaudrant3=0,Qaudrant4=0,Xaxit = 0,Yaxit = 0,origin =0;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter N:");
        n = sn.nextInt();
        while (i <= n)
        {
            System.out.print("Enter point #"+i+": ");
            x = sn.nextInt();
            y = sn.nextInt();
            if (checkQuadrant(x,y) == 7)
            {
               origin++; 
            }
            else if (checkQuadrant(x,y) == 1)
            {
                Qaudrant1++;
            }
            else if (checkQuadrant(x,y) == 2)
            {
                Qaudrant2++;
            }
            else if (checkQuadrant(x,y) == 3)
            {
                Qaudrant3++;
            }
            else if (checkQuadrant(x,y) == 4)
            {
                Qaudrant4++;
            }
            else if (checkQuadrant(x,y) == 5)
            {
                Xaxit++;
            }
            else if (checkQuadrant(x,y) == 6)
            {
                Yaxit++;
            }
            i++;
        }
         System.out.printf("Number of points in Qaudrant 1 = %d\n",Qaudrant1);
         System.out.printf("Number of points in Qaudrant 2 = %d\n",Qaudrant2);
         System.out.printf("Number of points in Qaudrant 3 = %d\n",Qaudrant3);
         System.out.printf("Number of points in Qaudrant 4 = %d\n",Qaudrant4);
         System.out.printf("Number of points on X axis = %d\n",Xaxit);
         System.out.printf("Number of points on Y axis = %d\n",Yaxit);
         System.out.printf("Number of points on origin point = %d\n",origin);
         
        
    }
    public static int checkQuadrant(int x,int y){
        int position;
        if (x == 0 && y == 0)
        {
            return 7;
        }
        else if(x>0 && y>0)
        {
            return 1;
        }
        else if(x<0 && y<0)
        {
            return 3;
        }
         else if(x>0 && y<0)
        {
            return 4;
        }
        else if(x<0 && y>0)
        {
            return 2;
        }
        else if(x==0 && y != 0)
        {
            return 5;
        }
        else if (x!=0 && y==0 )
        {
            return 6;
        }
        return 0;
        
        
    }
    
}
