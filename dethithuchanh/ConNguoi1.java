package dethithuchanh;

import java.util.Scanner;

public class ConNguoi1{
	// 1. Attributes
	private char hoTen;
	private String ngaySinh;
	// 2. Get, set methods

	public char getHoTen() {
		return hoTen;
	}

	public void setHoTen(char hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	// 3. Constructor methods
	public ConNguoi1() {
//		this.hoTen = 'D';
//		this.ngaySinh = "10-10-2000" ;
	}
	public ConNguoi1(char hoTen, String ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	
	// copy constructor
	public ConNguoi1(ConNguoi1 cn) {
		hoTen = cn.hoTen;
		ngaySinh = cn.ngaySinh;
		
	}
	// 4. Input, output
	public void nhap1(Scanner sc) {
		
		System.out.print("Ho ten: ");
		String stringValueOf = String.valueOf(hoTen);
		
//		System.out.print("Ngay sinh: ");
//		ngaySinh = sc.nextLine();
	}
	public void in1() {
		
		System.out.println("Ho ten: "+hoTen+"; Ngay sinh: "+ngaySinh);
	}
	
	public String toString() {
		return ("Ho ten: "+hoTen+"; Ngay sinh: "+ngaySinh);
	}
	
	// 5. Business methods
	public int namSinh() {
		String str[] = ngaySinh.split("-");
		int nam = Integer.parseInt(str[2]);
		return nam;
	}
	
	
}
