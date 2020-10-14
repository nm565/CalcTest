/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matobanatsuki
 */
public class Main {
    public static void main(String[] args) {
        //Pass in the argument to the costrutor
        Calculator myCalc = new Calculator(5);
        System.out.println(myCalc.getTotal());
        System.out.println(myCalc.addTwoNumbers(20, 5));
        System.out.println(myCalc.getTotal());
    }
}    