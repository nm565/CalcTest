/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matobanatsuki
 */
public class Calculator {
    private int total;
    public Calculator(int total) {
        this.total = total;
    
    
    }

    Calculator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Method
    public int addTwoNumbers(int total, int num2) {
        this.total += total;
        int answer;
        answer = this.total + num2;
        return answer;
    }
    
    public int subtractTwoNumbers(int total, int num2) {
       this.total += total;
       int answer;
       answer =this.total - num2;
       return answer;
    }

    
}



       
       
    

   
