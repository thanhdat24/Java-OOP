package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public SDPhanSo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		PhanSo pSo1 = new PhanSo(3,7); 
//		PhanSo pSo2 = new PhanSo(4,9); 
//		pSo1.xuat();
//		pSo2.xuat();
//		PhanSo pSo3 = new PhanSo();
//		PhanSo pSo4 = new PhanSo();
//		PhanSo pSoNghichDao = new PhanSo();
//
//		System.out.println("Nhập phân số x");
//		pSo3.nhap(sc);
//		System.out.println();
//		System.out.println("Nhập phân số y");
//		pSo4.nhap(sc);	
//		System.out.print("\nGiá trị nghịch đảo của phân số x là: ");
//		pSoNghichDao = pSo3.giaTriNghichDao();
//		pSoNghichDao.xuat();
//		System.out.print("\nTổng 2 phân số x và y = ");
//		pSo3.congPhanSo(pSo4);

		PhanSo ds[];
		int n, i;
		int sum = 0;
		System.out.print("Nhập số lượng phần tử: ");
		
		
		n = sc.nextInt();
		ds = new PhanSo[n];
		for (i = 0; i < n; i++)
			ds[i] = new PhanSo();
		for (i = 0; i < n; i++) {
			System.out.println("\nNhập phần tử thứ " + i + ": ");
			ds[i].nhap(sc);
		}
		System.out.println("\nDanh sách vừa nhập: ");
		for (i = 0; i < n; i++) {
			ds[i].xuat();
		}
		System.out.print("\nTổng "+n+" phần số đó: " );
		PhanSo pSoTong = new PhanSo();
		for (i = 0; i < n; i++) {
			pSoTong = pSoTong.congPhanSo(ds[i]);
		}
		
		pSoTong.xuat();
	}
}
