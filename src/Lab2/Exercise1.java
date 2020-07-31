package Lab2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter number 3: ");
        double n3 = sc.nextDouble();
        System.out.print("Enter number 4: ");
        double n4 = sc.nextDouble();
        System.out.print("Enter number 5: ");
        double n5 = sc.nextDouble();

        double total = n1 + n2 + n3 + n4 + n5;//ผลรวม
        double avg = total / 5; //ค่าเฉลี่ย = ผลรวมของข้อมูลทั้งหมด/จำนวนข้อมูล

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
    }
}
