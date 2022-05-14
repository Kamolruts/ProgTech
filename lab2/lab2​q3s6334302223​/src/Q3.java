/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethkmrs
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
        
public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        GregorianCalendar gcal = new GregorianCalendar();
        int cday = gcal.get(Calendar.DATE);
        int cmonth = gcal.get(Calendar.MONTH);
        int cyear = gcal.get(Calendar.YEAR);
        System.out.println("Current Date: "+cday+"-"+cmonth+"-"+cyear);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
 
        Random day = new Random();
        int bday = day.nextInt(1,29);
        Random month = new Random();
        int bmonth = month.nextInt(0,12);
        Random year = new Random();
        int byear = year.nextInt(2000,2022);
        System.out.println("Birth date: "+bday+"-"+bmonth+"-"+byear);
        
        Calendar cdate = new GregorianCalendar(cyear,cmonth,cday);
        Calendar bdate = new GregorianCalendar(byear,bmonth,bday);
       
        long duration = (cdate.getTimeInMillis()-bdate.getTimeInMillis()) / (1000*60*60*24);  
        
        System.out.println("Age in days: "+duration);
        
        
    }
    
}
