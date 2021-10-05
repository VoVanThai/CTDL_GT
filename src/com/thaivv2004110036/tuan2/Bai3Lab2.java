package com.thaivv2004110036.tuan2;

import java.util.Scanner;

public class Bai3Lab2 {
    public static void main(String[] args) {
        System.out.println("Nhập số điện sử dụng: ");
        int ElectricUsed = new Scanner(System.in).nextInt();
        if (ElectricUsed < 50)
            System.out.println("Tiền: " + ElectricUsed * 1000);
        else
            System.out.println("Tiền: " + (50 * 1000 + (ElectricUsed - 50) * 1200));
    }

}
