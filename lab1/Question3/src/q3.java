/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethkmrs
 */
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double m = obj.nextDouble();
        System.out.print("Enter another number: ");
        double n = obj.nextDouble();
        
        double result = (m*n)/(m+n);
        
        System.out.print("The ratio between their product and their sum is "+result);
    }
    
}
