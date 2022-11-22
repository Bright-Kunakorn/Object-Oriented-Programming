/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_1_630510613;

/**
 *
 * @author brigh
 */
public class GPA {
    private double GradePoint;
    private int credit;
    private String grade;
    private double Total;


    public double GetGrade(String grade){
        if (null != grade)
        switch (grade) {
            case "A" -> GradePoint = 4;
            case "B+" -> GradePoint = 3.5;
            case "B" -> GradePoint = 3;
            case "C+" -> GradePoint = 2.5;
            case "C" -> GradePoint = 2;
            case "D+" -> GradePoint = 1.5;
            case "D" -> GradePoint = 1;
            case "F" -> GradePoint = 0;
            default -> {
            }
        }
        return GradePoint;      
    }
    public void SetCreadit(int c){
        credit = c; 
    }
    public int SetCredit(){
        return credit;
    }
    public void CalGrade(double p,int c){
        Total = p/c;
    }
    public double GetTotalGrade(){
        return Total;
    }
    
}
