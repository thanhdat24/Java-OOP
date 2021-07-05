package th7;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
		private String hoTen;
		private String ngaySinh; // dinh dang "DD/MM/YYYY", vi du: "01/01/1999"
		private String queQuan; // tieng Viet khong dau, vi du: "Vinh Long"
	// phuong thuc
		public Nguoi() {
			hoTen = new String("chua biet");
			ngaySinh = new String("01/01/1999");
			queQuan = new String("chua biet");
		}
		public Nguoi(String ht, String ns, String qq) {
			hoTen = new String(ht);
			ngaySinh = new String(ns);
			queQuan = new String(qq);
		}
		public Nguoi(Nguoi n) {
			hoTen = new String(n.hoTen);
			ngaySinh = new String(n.ngaySinh);
			queQuan = new String(n.queQuan);
		}
		public void makeCopy(Nguoi n) {
			hoTen =  n.hoTen;
			ngaySinh = n.ngaySinh;
			queQuan = n.queQuan;	
		}
		
		public void nhap() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ho ten:");
			hoTen = sc.nextLine();
			System.out.println("Nhap ngay sinh:");
			ngaySinh = sc.nextLine();
			System.out.println("Nhap que quan:");
			queQuan = sc.nextLine();		
		}
		
		public void in() {
			System.out.println("Ho ten: " + hoTen);
			System.out.println("Ngay sinh: " + ngaySinh);
//			System.out.println("Que quan: " + queQuan);
		}
		public void ganHoTen(String hoTenMoi) {
			hoTen = new String(hoTenMoi);
		}
		public void ganNgaySinh(String ngaySinhMoi) {
			ngaySinh = new String(ngaySinhMoi);
		}
		public void ganQueQuan(String queQuanMoi) {
			queQuan = new String(queQuanMoi);
		}
		public String layHoTen() {
			return hoTen;
		}
		public String layNgaySinh() {
			return ngaySinh;
		}
		public String layQueQuan() {
			return queQuan;
		}
		public int namSinh() {
//			int kq = 0;
//			kq = Integer.parseInt(ngaySinh.substring(6));
//			return kq;
			String str[] = ngaySinh.split("/");
			int nam = Integer.parseInt(str[2]);
			return nam;
		}
		
		public String layTen1() {
			return (hoTen.substring(hoTen.lastIndexOf(" ")+1));
		}
}
