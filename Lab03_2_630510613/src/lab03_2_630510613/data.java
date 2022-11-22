/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_2_630510613;

/**
 *
 * @author brigh
 */
public class data {
    char type;
    int time;
    double cost;
    
    public void SetType(char type){
        this.type = type;
    }
    public void SetTime(int time){
        this.time = time;  
    }
    public double PrintCost(int time,char type){
        this.time = time;
        this.type = type;
        double multiply = 0;
        double temp = 0;
        double cost = 0;
        
        if (type == 'M' ||  type == 'm')
        {
           cost = time/60;
           if (time%60 != 0)
           {
               cost++;
           }
           cost = cost*5;
        }
        else if(type == 'C' ||  type == 'c')
        {
            if (time > 240){
                temp = time-240;
                cost += temp*0.25;
                time -= temp;
            }
            if (time > 120){
                temp = time-120;
                cost += temp*0.50;
                time -= temp;
            }
            if (time > 60){
                temp = time-60;
                cost += temp*0.75;
                time -= temp;
            }
            if (time > 1){
                cost += time*1;    
            }
        }
        return cost;
    }
}
    

