package th7;

import java.util.Scanner;

import dethithuchanh.ConNguoi;

public class QuanLy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n;
		n = sc.nextInt();
		
		SinhVien[] ds = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new SinhVien();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap sinh vien thu "+(i+1)+" : ");
			ds[i].nhap();
		}
		
		System.out.println("\nSinh vien sinh nam 2000 va qu o Vinh Long la:\n");
		for (int i = 0; i < n; i++) {
			if (ds[i].namSinh() == 2000 && ds[i].layQueQuan().equalsIgnoreCase("vinh long")) {
					ds[i].in();
			}
		}
		
		System.out.println("\nSap xep nam sinh tang dan\n");
		for (int i = 0; i < n; i++) {
			for (int j = i +1; j < n; j++){
				if (ds[i].namSinh() > ds[j].namSinh()) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			ds[i].in();
		}
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (ds[i].isDangvien() == true) {
				dem++;
			}
		}
		System.out.println("Tong so dang vien la: "+dem);
	}
}
