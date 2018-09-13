/*
* Name: Anthony Ewoma
 * Email: Tonyewoma@gmail.com
 * Course: Java Programming
 * Venue: Youth Empowerment Centre: 27 Point Road, Apapa(inside St.George's Military Church
 * Question: Guadratic Equation
 */

import java.util.Scanner;
import quadraticequation.Quadratic;

/**
 *
 * @author Anthony Ewoma
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        
        Quadratic quadratic = new Quadratic (a, b, c);
        
        quadratic.findRoot();
    }
    
}
