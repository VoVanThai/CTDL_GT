package com.thaivv2004110036.tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lab5 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr = nhap();
        xuat(arr);
    }

    public static ArrayList<Double> nhap() {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();

            System.out.print("Nhập thêm(Y/N)? ");
            if (scanner.nextLine().equals("N") || scanner.nextLine().equals("n")) {
                break;
            }

        }
        return list;
    }

    public static void xuat(ArrayList<Double> list2) {

        System.out.println("Các phần tử của list: ");
        for (Double double1 : list2) {
            System.out.println("Xuất phần tử trong list: " + double1);

        }

    }
}
