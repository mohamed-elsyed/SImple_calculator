/*the frist program
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fristproject;
import java.util.Scanner;
/**
 *
 * @author Connect
 */
public class Fristproject {

  static  public  void main(String []args){
     Scanner in = new Scanner (System.in);
    double a , b, c = 0.0;            

        System.out.println("Enter the first number");
a =in.nextDouble();
        System.out.println("Enter the second number");
b =in.nextDouble();

        System.out.println("""
                           Choose the operation
                           1.Addition
                           2.Subtraction
                           3.Multiplication
                           4.Division
                           5.Power
                           #please enter the num of opertion""");
        double something =in.nextDouble();
        double addition =1;
        double subtraction = 2;
        double multiplication = 3;        
        double Division = 4;
        double power = 5;
        if(something==addition){
        c = a + b;
            System.out.println( a + "+" + b + "=" + c);
        } else if(something==subtraction){
       c = a - b ;
            System.out.println(a + "-" + b + "=" + c);
        } else if (something==multiplication){
        c = a * b ;
            System.out.println(a + "*" + b + "=" + c);
        } else if(something==Division){
        c = a / b ;
            System.out.println(a + "/" + b + "=" + c);
        } else if (something == power){
            System.out.println("""
                               Enhance A or B?
                               1.A
                               2.B""");
        double enhance = in.nextDouble();
        double first = 1 ;
        double second = 2 ;
        
        if(enhance == first){
            System.out.println(Math.pow(a, 2));                                  
            
        }else if (enhance == second);{
            System.out.println(Math.pow(b, 2));
        }
        }}


}
  

        


    

