/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_2_630510613;

import java.util.Scanner;

/**
 *
 * @author brigh
 */
public class people2 {
    private int high;
    private int weight;
    private char gender;
    private int temp;
    private String name;
    
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input data for person #2");
        System.out.print("Enter name:");
        name = input.next();
        System.out.print("Enter high:");
        high = input.nextInt();
        System.out.print("Enter weight:");
        weight = input.nextInt();
        System.out.print("Enter gender:");
        gender = input.next().charAt(0);
        if (gender == 'M')
            {
                temp = 100;
            }
        else if (gender == 'F')
            {
                temp = 110;
            }
    }
    
    public int getHigh(){
        return high;
    }
    public int getWeight(){
        return weight;
    }
    public int getTemp(){
        return temp;
    }
    public String getName(){
        return name;
    }
    
    
    
}
