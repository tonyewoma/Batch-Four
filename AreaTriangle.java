/*
* Name: Anthony Ewoma
 * Email: Tonyewoma@gmail.com
 * Course: Java Programming
 * Venue: Youth Empowerment Centre: 27 Point Road, Apapa(inside St.George's Military Church
 * Question: Triangle Area = 1/2(base x height)
 */
package areatriangle;

import java.util.Scanner;

/**
 *
 * @author Anthony Ewoma
 */
public class AreaTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Triangle Area = 1/2(base x height)
        double bSide;
        double hSide;
        double area;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please write the \"b\" value of your triangle: ");
        bSide = keyboard.nextDouble();
        
        System.out.println("Please write the \"h\" value of your triangle: ");
        hSide = keyboard.nextDouble();
        
        area = (bSide * hSide) / 2;
        System.out.println("The area of your triangle is:" +  area);
    }
    
}
