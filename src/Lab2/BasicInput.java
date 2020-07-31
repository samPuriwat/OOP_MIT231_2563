package Lab2;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        // input data เช่น อ่านข้อมูลจากผู้ใช้ทาง keyboard หรือ อ่านข้อมูลจากฐานข้อมูล
        // Scanner เป็น library ของ Java ที่ใช้ในรับข้อมูลจากผู้ใช้

        Scanner scanner = new Scanner(System.in); // ประกาศ object ชื่อ scanner

        //1. รับข้อมูลที่เป็นข้อความ (String) จากผู้ใช้
//        System.out.print("What your name? : ");
//        String name = scanner.nextLine();
//        System.out.println("Your name is "+name);

        //2. รับข้อมูลที่เป็นจำนวนเต็ม (Integer)
        // nextInt()
//        System.out.print("What is your favorite number? : ");
//        int num = scanner.nextInt();
//        System.out.println("Your favorite number is "+num);

        //3. รับข้อมูลเป็นจำนวนจริง (float and double)
        System.out.print("What is your favorite number? : ");
        double rnum = scanner.nextDouble();
        System.out.println("Your favorite number is "+rnum);
    }//main







}//class
