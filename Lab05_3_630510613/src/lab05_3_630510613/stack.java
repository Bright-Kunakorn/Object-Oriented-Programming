/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_3_630510613;
import java.util.Arrays;

public class stack {

    public int top;
    private boolean isEmpty;
    private boolean isFull = false;
    private int[] ListStack = {};
    
    stack(){
        top = -1;        
    }

    public void push(int x){
        if (isFull() == false)
        {  
            top+=1;
            ListStack = Arrays.copyOf(ListStack, ListStack.length + 1);
            ListStack[top] = x;
        }
        else
            System.out.print("stack is full");
        
    }
    
    public void pop(){
        if (ListStack.length == 0)
            System.out.print("stack is empty");
        else if (isEmpty == false)
        {
         if (top > -1)
         {
            ListStack = Arrays.copyOf(ListStack, ListStack.length - 1); 
            top -=1;
         }
        }
    }
    
    public void show(){
        for(var i:ListStack){
            System.out.print(i+" ");
        }
                
    }
    
    public boolean isEmpty(){
        if  (top <= -1)
        {
            isEmpty = true;
        }
        else
        {
            isEmpty = false;
        }
        return isEmpty;
    }
    
    public boolean isFull() {
        if (ListStack.length == 5)
            isFull = true;
        return isFull;
    }
   
}
