/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethkmrs
 */
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = obj.nextLine();
        
        System.out.print("Enter birth year: ");
        int byear = obj.nextInt();
        
        int age = 2565-byear;
        
        System.out.print(name+" is "+age+" years old.");
    }
    
}
