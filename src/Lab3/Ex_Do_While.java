package Lab3;

import java.util.Scanner;

public class Ex_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter integer:");
            num = sc.nextInt();
        } while (num != 0);
        System.out.println("Good Bye.");








    }
}
