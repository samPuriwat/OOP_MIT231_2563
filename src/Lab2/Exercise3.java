package Lab2;
//input?

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input data
        //ราคารถ
        System.out.print("ราคารถ(บาท): ");
        double x = scanner.nextDouble();
        //เงินดาวด์
        System.out.print("เงินดาวด์(บาท): ");
        double y = scanner.nextDouble();
        //ดอกเบี้ย
        System.out.print("ดอกเบี้ย(%): ");
        double z = scanner.nextDouble();
        //จำนวนงวด
        System.out.print("จำนวนปีที่ต้องการผ่อน (ปี): ");
        int w = scanner.nextInt();

        double a = x - y;  //ยอดจัด
        double b = a * (z/100)* w; //ดอกเบี้ยรวม
        double c = a + b; //ยอดจัด+ดอกเบี้ย
        double m = c / (w*12); //ผ่อนต่อเดือน
        //display
        System.out.println("ผ่อนงวดละ: "+m);

    }
}
