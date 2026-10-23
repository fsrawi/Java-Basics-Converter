/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zuj.edu.oop;

import java.util.Scanner;

/**
 *
 * @author Ahmad
 */
public class Homework {
    
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in); 
        System.out.print("Enter The Number Convert: ");
        double num = s.nextDouble();
        
        
        System.out.println("\n----- Convert Menu -----:  ");
        System.out.println("1- Convert From CM to Inche ");
        System.out.println("2- Convert From Inche to CM ");
        System.out.println("3- Convert From M to Feet ");
        System.out.println("4- Convert From Feet to M ");
        System.out.println("5- Convert From Dunm to Hiktar ");
        System.out.println("6- Convert From Hiktar to Dunm ");
        System.out.println("7- Convert From Clas to Fenh ");
        System.out.println("8- Convert From Fenh to Clas ");
        System.out.println("Choose an Option (1-8): ");
        
        int choice = s.nextInt();
        switch (choice) {
        case 1:
            System.err.println("Result: " +(num/2.45)+ "Inches");
            break;
        case 2:
            System.out.println("Result: " +(num*2.45)+"");
            break;
             case 3:
                System.out.println("Result: " + (num * 3.28084) + " Feet");
                break;
            case 4:
                System.out.println("Result: " + (num / 3.28084) + " Meters");
                break;
            case 5:
                System.out.println("Result: " + (num / 10) + " Hiktars");
                break;
            case 6:
                System.out.println("Result: " + (num * 10) + " Dunms");
                break;
                
            case 7:
                System.out.println("Result: " + ((num * 9/5) + 32) + " F");
                break;
                
            case 8:
                System.out.println("Result: " + ((num - 32) * 5/9) + " C");
                break;
                
            default:
                System.out.println("Invalid choice! Please select a number between 1 and 8.");
        }
        }
        

        
        
        
        
        
        
        
        
    }
    

