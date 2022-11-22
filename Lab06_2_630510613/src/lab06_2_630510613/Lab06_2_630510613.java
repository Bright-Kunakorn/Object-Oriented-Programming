//630510613 Kunakorn Topurin
package lab06_2_630510613;

import static java.lang.Math.abs;
import java.util.Scanner;


public class Lab06_2_630510613 {
    
    static int CloseToStandard(people1 st,people2 nd){
        int standard1 = st.getHigh() - st.getTemp();
        int standard2 = nd.getHigh() - nd.getTemp();
        
        standard1 = standard1- st.getWeight();
        standard2 = standard2- nd.getWeight();
        
        return abs(standard1) - abs(standard2);    
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        people1 p1 = new people1();
        people2 p2 = new people2();
        p1.setData();
        p2.setData();
       
        if (CloseToStandard(p1,p2) == 0)
        {
            System.out.println("The weight of both of them are close to the standard weight equally");
        }
        else if (CloseToStandard(p1,p2) < 0)
        {
            System.out.printf("Weight of %s is closer to standard weight than %s\n",p1.getName(),p2.getName());
        }
        else if (CloseToStandard(p1,p2) > 0)
        {
            System.out.printf("Weight of %s is closer to standard weight than %s\n",p2.getName(),p1.getName());
        }
         
    }
    
}
