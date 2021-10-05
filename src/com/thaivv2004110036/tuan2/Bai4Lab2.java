package com.thaivv2004110036.tuan2;

import java.util.Scanner;

public class Bai4Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============Menu============");
        System.out.println(" >1. Giải phương trình bậc I");
        System.out.println(" >2. Giải phương trình bậc II");
        System.out.println(" >3. Tính tiền điện");
        System.out.println("==============Menu============");
        System.out.print("Lựa chọn chức năng:");
        int suLuaChon = sc.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chọn chức năng khác");
        }
    }

    static void giaiPTBacI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        } else
            System.out.println("Phương trình có nghiệm là: " + (float) -b / a);
    }

    
    static void giaiPTBacII(){
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

    static void tinhTienDien(){
        System.out.println("Nhập số điện sử dụng: ");
        int ElectricUsed = new Scanner(System.in).nextInt();
        if (ElectricUsed < 50)
            System.out.println("Tiền: " + ElectricUsed * 1000);
        else
            System.out.println("Tiền: " + (50 * 1000 + (ElectricUsed - 50) * 1200));
    }

    }

