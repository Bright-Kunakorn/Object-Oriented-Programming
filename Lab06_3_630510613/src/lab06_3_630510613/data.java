/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_3_630510613;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author brigh
 */
public class data {

    private String name;
    private int N;
    private int MStar;
    private int FStar;
    private int[] MList = {0,0,0};
    private String[] MName = {"Nadech","Wier","Mario"};
    private int[] FList = {0,0,0};
    private String[] FName = {"Aum","Yaya","Bella"};
    private String[] Voter = {};
    private int[] VoterM = {};
    private int[] VoterF = {};
    
    
    
    public void checkAndPrintVote( ){
        switch (MStar) {
            case 1 -> MList[0] += 1;
            case 2 -> MList[1] += 1;
            case 3 -> MList[2] +=  1;
            default -> {
            }
        }
        switch (FStar) {
            case 1 -> FList[0] += 1;
            case 2 -> FList[1] += 1;
            case 3 -> FList[2] += 1;
            default -> {
            }
        }
        
    }
    public void printGoodLuckPeople( ){
        int Mmax = MList[0];
        int Mindex = 0;
        for (int i = 0; i < MList.length; i++) 
        {
            if (Mmax < MList[i]) 
        {
            Mmax = MList[i];
            Mindex = i;
        }
    }
    System.out.println("Top star award (Actor) goes to " + MName[Mindex]);
    
        int Fmax = FList[0];
        int Findex = 0;
        for (int i = 0; i < FList.length; i++) 
        {
            if (Fmax < FList[i]) 
        {
            Fmax = FList[i];
            Findex = i;
        }
    }
    System.out.println("Top star award (Actress) goes to " + FName[Findex]);
    
    System.out.print("Good luck voter ->");
        for (int j = 0;j < Voter.length;j++)
        {
            
            if (VoterM[j] == Mindex+1 && VoterF[j] == Findex+1)
            {
                
                System.out.print(Voter[j]+" ");
            }  
            
        }
        System.out.println();
        
    }
    public void SetData(){
        Scanner input = new Scanner(System.in);
        data d1 = new data();
        System.out.print("Enter N:");
        N = input.nextInt();
        
        for (int i =1;i<=N;i++)
        {
         System.out.println("Input vote#"+i);
         System.out.print("Enter name:");
         name  = input.next();
         
         Voter = Arrays.copyOf(Voter, Voter.length + 1);
         Voter[Voter.length-1] = name;
         
         System.out.print("Input number of actor and number of actress :");
         MStar = input.nextInt();
         VoterM = Arrays.copyOf(VoterM, VoterM.length + 1);
         VoterM[VoterM.length-1] = MStar;
         
         FStar = input.nextInt();
         VoterF = Arrays.copyOf(VoterF, VoterF.length + 1);
         VoterF[VoterF.length-1] = FStar;
         
        }
        checkAndPrintVote();
        printGoodLuckPeople();
    }
    public String getName(){
        return name;
    }
    
}
