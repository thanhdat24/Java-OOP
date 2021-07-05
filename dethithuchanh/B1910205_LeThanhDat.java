package dethithuchanh;

import java.util.Scanner;

import buoi4.SinhVienCNTT;

public class B1910205_LeThanhDat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConNguoi1 conNguoi = new ConNguoi1();
		conNguoi.nhap1(sc);
		conNguoi.in1();
		
		
//		CauThu dangVanLam = new CauThu();
//		dangVanLam.nhap(sc);
//		dangVanLam.in();
		
//		CauThu ds[];
//		System.out.print("Nhap so luong cau thu: ");
//		
//		int n = sc.nextInt();
//		sc.nextLine();
//		ds = new CauThu[n];
//		for (int i = 0; i < n; i++) {
//			ds[i] = new CauThu();
//		}
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Nhap cau thu thu "+(i+1)+" : ");
//			ds[i].nhap(sc);
//		}
//		// Tim cau thu nho tuoi nhat
//		int namSinhList[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			namSinhList[i] = ds[i].namSinh();
//		}
//		
//		double max = 0;
//		int vitrimax = 0;
//		for (int i = 0; i < n; i++) {
//			if (max < namSinhList[i]) {
//				max = namSinhList[i];
//				vitrimax = i;
//			}
//		}
//		
//		System.out.println("Danh sach cac cau thu nho tuoi nhat la: ");
//		for (int i = vitrimax; i < n; i++) {
//			if (max == namSinhList[i]) {
//				ds[i].in();
//			}
//		}
//		
		// Tim cau thu co vi tri: Thu mon
//		System.out.println("\nDanh sach cac cau thu co vi tri thu mon: ");
//		for (int i = 0; i < n; i++) {
//			if (ds[i].getViTri().equals("thu mon")) {
//				ds[i].in();
//			}
//		}
////		
//		// Sap xep cau thu co so ao giam dan
//		System.out.println("\nDanh sach cau thu co so ao giam dan: ");
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (ds[i].getSoAo() < ds[j].getSoAo()) {
//					CauThu temp = new CauThu();
//					temp = ds[i];
//					ds[i] = ds[j];
//					ds[j]= temp;
//					
//				}
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			ds[i].in();
//		}
	}
}
