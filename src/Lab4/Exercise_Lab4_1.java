package Lab4;

import java.util.Scanner;

public class Exercise_Lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Select find area list below: ");
        System.out.println("1.Rectangle");
        System.out.println("2.Triangle");
        System.out.println("3.Circle");
        System.out.print("Select: ");
        int s = scanner.nextInt();   // input integer from user

        switch (s) {  //int or char
            case 1: findAreaRec();
                break;
            case 2: //findAreaTri();
                break;
            case 3: //findAreaCir();
                break;
            default:System.out.println("Please, select 1-3. thank.");
        }



    }//main

    private static void findAreaRec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double x = sc.nextDouble();
        System.out.print("Enter length: ");
        double y = sc.nextDouble();

        System.out.println("The area of rectangle is: "+(x*y));
    }

}
