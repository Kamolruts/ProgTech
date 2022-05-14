
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nethkmrs
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Student 1: Enter ID, birthday, name");
        String data1 = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Student 2: Enter ID, name");
        String data2 = input2.nextLine();

        String[] part1 = data1.split(" ");
        String ID1 = part1[0];
        String birthday1 = part1[1] + " " + part1[2] + " " + part1[3];
        String name1 = part1[4] + " " + part1[5];
        Student s1 = new Student(name1, Integer.parseInt(ID1), Integer.parseInt(part1[1]), Integer.parseInt(part1[2]) - 1, Integer.parseInt(part1[3]));
        

        String[] part2 = data2.split(" ");
        String ID2 = part2[0];
        String name2 = part2[1] + " " + part2[2];
        Student s2 = new Student(name2, Integer.parseInt(ID2));
        

        System.out.println("Student 1: " + s1.getId() + " " + s1.getName() + " " + s1.getAge());
        System.out.println("Student 2: " + s2.getId() + " " + s2.getName() + " " + s2.getAge());

        if (s1.equals(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter birthday for Student 2");
        String data3 = input3.nextLine();
        String[] part3 = data3.split(" ");
        s2.setBD(Integer.parseInt(part3[0]), Integer.parseInt(part3[1]), Integer.parseInt(part3[2]));
        input1.close();
        input2.close();
        input3.close();
        
        System.out.println("Student 1: " + s1.getId() + " " + s1.getName() + " " + s1.getAge());
        System.out.println("Student 2: " + s2.getId() + " " + s2.getName() + " " + s2.getAge());
        
        if (s1.equals(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
