//630510613 kunakoen topurin
package lab03_3_630510613;

import java.util.Arrays;

public class student {
    long id;
    int Final;
    int Mid;
    int total;
    String Grade;
    
    long[] arrID = {};
    int[] arrScore = {};
    String[] arrGrade = {};
    
    public void GetData(){
        
        arrID = Arrays.copyOf(arrID, arrID.length + 1);
        arrID[arrID.length - 1] = id;
        
        arrScore = Arrays.copyOf(arrScore, arrScore.length + 1);
        arrScore[arrScore.length - 1] = CalGrade(Mid,Final);
        
        arrGrade = Arrays.copyOf(arrGrade, arrGrade.length + 1);
        arrGrade[arrGrade.length - 1] = DisplayGrade();      
    }
    
        public int CalGrade(int Mid,int Final){
        this.Final = Final;
        this.Mid = Mid;
        total = Mid+Final;
        return total;
    }
    
    public String DisplayGrade()
    {   
        this.total = CalGrade(Mid,Final);
        
        if (total > 84){
            Grade = "A";
        }
        else if (total >79){
            Grade = "B+";
        }
        else if (total >74){
            Grade = "B";
        }
        else if (total >59){
            Grade = "C+";
        }
        else if (total >54){
            Grade = "C";
        }
        else if (total >49){
            Grade = "D+";
        }
        else if (total >44){
            Grade = "D";
        }
        else if (total <45){
            Grade = "F";
        }
        
        return Grade;
    }
    
}
