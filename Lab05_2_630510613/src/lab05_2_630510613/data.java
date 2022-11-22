/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_2_630510613;

import java.util.Scanner;

/**
 *
 * @author brigh
 */
public class data {
    private double Volume,Width,Length,Height ;
    Scanner input = new Scanner(System.in);
    
    data(double w,double l,double h){
        System.out.println("Hello from 1st constructor");
        Width  = w;
        Length = l;
        Height = h; 
        System.out.println("The Volume of Box: SizeA = " + calVolume());
    }
    data(){
        System.out.println("Hello from 2nd constructor");
        System.out.print("Input Name of Box: ");
        String name = input.next();
        System.out.print("Input Width:");
        Width = input.nextDouble();
        System.out.print("Input Length:");
        Length = input.nextDouble();
        System.out.print("Input Height:");
        Height = input.nextDouble();
        System.out.printf("The Volume of Box: %s = %.1f \n",name,calVolume());
        
    }
    public double calVolume(){
        Volume = Width*Length*Height;
        return Volume;
    }
    
    
}
