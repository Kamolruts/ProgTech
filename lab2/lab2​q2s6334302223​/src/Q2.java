/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethkmrs
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
        
public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        GregorianCalendar gcal = new GregorianCalendar();
        int cday = gcal.get(Calendar.DATE);
        int cmonth = gcal.get(Calendar.MONTH);
        int cyear = gcal.get(Calendar.YEAR);
        System.out.println("Current Date: "+cday+" "+cmonth+","+" "+cyear);
        
        System.out.print("Enter day: ");
        int fday = input.nextInt();
        System.out.print("Enter month: ");
        int fmonth = input.nextInt();
        System.out.print("Enter year: ");
        int fyear = input.nextInt();

        Calendar cdate = new GregorianCalendar(cyear,cmonth,cday);
        Calendar fdate = new GregorianCalendar(fyear,fmonth-1,fday); //ที่fmonth-1เพราะว่าในGregorianCalendarมันนับเดือน1เป็น0 เวลาเรารับinputเข้ามาเลยต้อง-1เพื่อให้ตรงกัน
        
        long duration = (fdate.getTimeInMillis()-cdate.getTimeInMillis()) / (1000*60*60*24);  
        
        System.out.println("Number of days: "+duration);
       
       
    }
    
}

