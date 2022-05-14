/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethkmrs
 */
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = obj.nextLine();
        
        System.out.print("Enter age: ");
        int age = obj.nextInt();
        
        System.out.print(name+" is "+age+" years old.");
       
    }
    
}
