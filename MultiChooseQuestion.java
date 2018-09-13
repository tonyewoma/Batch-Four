/*
 * Name: Anthony Ewoma
 * Email: Tonyewoma@gmail.com
 * Course: Java Programming
 * Venue: Youth Empowerment Centre: 27 Point Road, Apapa(inside St.George's Military Church
 * Question: Multi-Choice Question
*/
package multichoosequestion;

import java.util.Scanner;

/**
 *
 * @author Anthony Ewoma
 */
public class MultiChooseQuestion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        
        int Answer;
        int reply = 10;
        int score = 0;
        
        System.out.println("How many students would CodeLagos train? ");
                System.out.println("(a) 1000\n" + "(b) 600,000\n" + "(c) 2,000,000\n" + "(d) 1,000,000\n");
                        System.out.println("Whats your answer");
                        Answer = keyboard.nextInt();
                                
                                if (Answer == 1000000){
                                    System.out.println("That is correct " + (score = score + reply));

                                    }else {System.out.println("Wrong\n");
                                }

                       
        System.out.println("CodeLagos started in what year? ");
                 System.out.println("(a) 2010\n" + "(b) 2015\n" + "(c) 2018\n" + "(d) 2017\n");
                        System.out.println("Whats your answer");
                        Answer = keyboard.nextInt();
                        
                                if (Answer == 2017){
                                    System.out.println("That is correct " + (score = score + reply));
                                    }else {System.out.print("Wrong\n");
                                }

         
        System.out.println("The resumption time for the first morning class is _______? ");
                     System.out.println("(a) 8:00\n" + "(b) 8:30\n" + "(c) 9:00\n" + "(d) 7:30\n");
                        System.out.println("Whats your answer");
                        Answer = keyboard.nextInt();
                        
                                if (Answer == 8){
                                    System.out.println("That is correct " + (score = score + reply));
                                    }else {System.out.print("Wrong\n");
                                }
                                
                              

                 
        System.out.println("Howmany pupils are being trained in the morning session? ");
                     System.out.println("(a) 100\n" + "(b) 19\n" + "(c) 20\n" + "(d) 15\n");
                        System.out.println("Whats your answer");
                        Answer = keyboard.nextInt();
                        
                                if (Answer == 19){
                                    System.out.println("That is correct " + (score = score + reply));
                                    }else {System.out.print("Wrong\n");
                                }

        
        System.out.println("The Governor sponsoring the COdeLagos 2018 was electedinw what year? ");
                     System.out.println("(a) 2016\n" + "(b) 2014\n" + "(c) 2018\n" + "(d) 2005\n");
                        System.out.println("Whats your answer");
                        Answer = keyboard.nextInt();
                        
                                if (Answer == 2014){
                                    System.out.println("That is correct " + (score = score + reply));
                                    }else {System.out.print("Wrong\n");
                                }

        System.out.println("Your total score is " + (score));
    }
}
