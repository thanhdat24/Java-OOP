package buoi2;

import java.util.Scanner;

/**
 * Mục đích: Quản lí các nghiệp vụ liên quan ngày tháng năm
 * Người tạo: Thành Đạt
 * Ngày tạo: 16/3/2021
 * Version: 1.0
 */
public class XuLy2 {

	public XuLy2() {
		
	}

	public static void main(String[] args) {
		Date date1 = new Date();
		Scanner sc = new Scanner(System.in);
		date1.nhap(sc);

		if (date1.hLe()) {
			date1 = date1.ngayHomSau();
			if (date1.hLe()) {
				System.out.println("Ngày hôm sau là: ");
				date1.xuat();
			}
		} else
			System.out.println("Ngày không hợp lệ, vui lòng nhập lại!");
		
		Date date2 = new Date(5,3,2020);
		int n;
		System.out.print("Nhập vào số ngày cần cộng: ");
		n = sc.nextInt();
		if (date2.hLe()) {
			date2 = date2.congNgay(n);
			if (date2.hLe()) {
				System.out.println("Ngày sao khi cộng thêm "+n+" ngày là:");
				date2.xuat();
			}
		} else
			System.out.println("Ngày không hợp lệ, vui lòng nhập lại!");
	}

}
