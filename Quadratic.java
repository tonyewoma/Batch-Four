/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

/**
 *
 * @author Anthony Ewoma
 */
public class Quadratic {
    double a;
    double b;
    double c;
    
    public Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findRoot(){
        double x1 = (-b + Math.sqrt(Math.pow(b, 2)) - (4 * a * c)) / (2 * a);
        double x2 = (+b + Math.sqrt(Math.pow(b, 2)) - (4 * a * c)) / (2 * a);
        
        System.out.println("First solution for x = " + x1);
        System.out.println("Second solution for x = " + x2);
        
    }
}
