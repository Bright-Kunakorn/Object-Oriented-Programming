package lab04_3_630510613;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Data {
    int N;
    int NS;
    String name;
    String [][] ArrData = {};
    String [] ArrName = {};
    String course;
    String [] ArrCourse = {};
    String find;
    public void RecData()
    {  
        ArrData = Arrays.copyOf(ArrData, ArrData.length + 1);
        ArrData[ArrData.length - 1] = ArrCourse; 
        ArrCourse = new String[ArrCourse.length];
        ArrCourse = new String[0];
        Arrays.fill( ArrCourse, null );
        
        //System.out.println(Arrays.deepToString(ArrData));
    }   
    public void RecCourse()
    {
        
        ArrCourse = Arrays.copyOf(ArrCourse, ArrCourse.length + 1);
        ArrCourse[ArrCourse.length - 1] = course; 
        
    }
    public void RecName()
    {
        ArrName = Arrays.copyOf(ArrName, ArrName.length + 1);
        ArrName[ArrName.length - 1] = name; 
    }
    public void FindCourse(String find) 
    {
        for (int i = 0;i<ArrData.length;i++)
        {           
            for (int j = 0;j<ArrData[i].length;j++) {
                
                if (ArrData[i][j].equals(find)) {
                    System.out.println(ArrName[i]);
                    break;
                }
            }
        }

    }
}
