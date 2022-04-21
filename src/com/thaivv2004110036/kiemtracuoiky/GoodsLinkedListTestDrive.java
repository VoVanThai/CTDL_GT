package com.thaivv2004110036.kiemtracuoiky;

import java.util.Scanner;

public class GoodsLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GoodsLinkedList instance = new GoodsLinkedList();
        int luaChon;
        do {
            System.out.println("----------MENU----------");
            System.out.println("- 1: Them hang hoa.");
            System.out.println("- 2: Tim theo ma.");
            System.out.println("- 3: Tim theo gia.");
            System.out.println("- 4: Sap xep tang dan theo gia.");
            System.out.println("- 5: Sap xep giam dan theo gia.");
            System.out.println("- 6: In danh sach.");
            System.out.println("- 0: Thoat.");
            System.out.print("- Nhap lua chon: ");

            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap thong tin hang hoa:");
                    instance.them();
                    break;
                case 2:
                instance.timTheoMaHang("1");
                    break;
                case 3:
                instance.timTheoGiaHang(10);
                    break;
                case 4:
                    System.out.println("Sap xep tang dan theo gia ");
                    instance.xepTangDan();
                    break;
                case 5:
                    System.out.println("Sap xep giam dan theo gia ");
                    instance.xepGiamDan();
                    break;
                case 6:
                    System.out.println("Danh sach hang hoa:");
                    instance.in();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Nhap lai chuc nang");
                    break;
            }

        } while (luaChon != 0);
    }

}
