package buoi4;

import java.util.Scanner;

public class SDSVCNTT {

	public static void main(String[] args) {
		SinhVienCNTT ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = Integer.parseInt(sc.nextLine());
		ds = new SinhVienCNTT[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new SinhVienCNTT();
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sv cntt thứ "+ (i+1) +": ");
			ds[i].nhap(sc);
			ds[i].nhapDiem(sc);
		}
		
		System.out.println("Danh sách sinh viên cntt vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			System.out
					.println("Sinh viên thứ " + (i + 1) + ": \n" + ds[i].toString() + ", Điểm TB: " + ds[i].tinhDTB());
		}
		
		// Tìm sv có email nhập từ bàn phím
		String email;
		System.out.println("Nhập email cần tìm: ");
		email = sc.nextLine();
		for (SinhVienCNTT sv: ds) {
			if (sv.getEmail().equals(email)) {
				System.out.println("Tài khoản sinh viên cần tìm: "+sv.getTaiKhoan() 
				+ ",\tĐTB: " + sv.tinhDTB());
				break;
			}
		}
	}

}
