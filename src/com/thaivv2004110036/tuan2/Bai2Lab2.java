package tuan2;

import java.util.Scanner;

public class Bai2Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta < 0)
            System.out.println("Phương trình vô nghiệm.");
        else if (delta == 0)
            System.out.println("Phương trình có nghiệm kép x = " + (float) -b / 2 * a);
        else if (delta > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / 2 * a);
        }

    }
}
