package buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDSinhVien {

	public static void timDSSVCoDTBCaoNhat(int n, SinhVien ds[]) {
		double diemTB[] = new double[n];
		for (int i = 0; i < n; i++) {
			diemTB[i] = ds[i].tinhDTB();
		}

		double max = 0;
		int vitriMAX = 0;
		for (int i = 0; i < n; i++) {
			if (max < diemTB[i]) {
				max = diemTB[i];
				vitriMAX = i;
			}
		}

		for (int i = vitriMAX; i < n; i++) {
			if (max == diemTB[i]) {
				System.out.println(ds[i].getHoTen());
			}
		}
	}

	public static void timDSSVBiCanhBaoHocVu(int n, SinhVien ds[]) {
		double diemTB[] = new double[n];
		for (int i = 0; i < n; i++) {
			diemTB[i] = ds[i].tinhDTB();
		}

		double max = 0;
		int vitriMAX = 0;
		for (int i = 0; i < n; i++) {
			if (diemTB[i] < 1.0f) {
				System.out.println(ds[i].getHoTen());
			}
		}
	}

	public static void sortDSSV(int n, SinhVien ds[]) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					SinhVien temp = new SinhVien();
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;					
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		a.dKyHP("LTHDT", "A");
		System.out.print(a.toString() + ", diem TB " + a.tinhDTB());
		
		int n;
		System.out.print("\nNhập số lượng sinh viên: ");
		n = Integer.parseInt(sc.nextLine());

		SinhVien ds[] = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new SinhVien();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập sinh viên thứ " + (i + 1) + " :");
			ds[i].nhap(sc);
			ds[i].nhapDiem(sc);
		}

		System.out.println("Danh sách sinh viên vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			System.out
					.println("Sinh viên thứ " + (i + 1) + ": \n" + ds[i].toString() + ", Điểm TB: " + ds[i].tinhDTB());
		}

		// Tìm sinh viên có điểm trung bình cao nhất lớp
		System.out.println("\nSinh viên có điểm trung bình cao nhất lớp: ");
		timDSSVCoDTBCaoNhat(n, ds);
		// Tìm các sinh viên bị cảnh báo học vụ
		System.out.println("\nSinh viên bị cảnh báo học vụ:");
		timDSSVBiCanhBaoHocVu(n, ds);
		// Sắp xếp danh sách sinh viên theo thứ thự Alphabet của Tên
		System.out.println("\nSắp xếp danh sách sinh viên theo thứ thự Alphabet của Tên");
		sortDSSV(n,ds);
		for (int i = 0; i < n; i++) {
			System.out.println(ds[i]);
		}
	}
}
