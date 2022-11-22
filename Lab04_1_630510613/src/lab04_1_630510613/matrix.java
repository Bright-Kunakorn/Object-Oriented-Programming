package lab04_1_630510613;

import java.util.Scanner;


public class matrix {
    int size;
    int num;
    Scanner input = new Scanner(System.in);
    public void MatrixChecked(int size)
    {   
        boolean IsMatrix = true;
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                System.out.printf("Input number [%d][%d] :",i,j);
                num = input.nextInt();
                if (i == j)
                {
                    if (num  != 1)
                        IsMatrix = false;

                }
                else
                {
                    if (num != 0)
                        IsMatrix = false;
                    
                }
            }
        }
        if (IsMatrix == true)
            System.out.println("This matrix is identity matrix.");
        else
            System.out.print("This matrix is not identity matrix.");
        
    }
    
}
