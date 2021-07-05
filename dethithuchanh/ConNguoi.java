package dethithuchanh;

import java.util.Scanner;

public class ConNguoi{
	// 1. Attributes
	private String hoTen;
	private String ngaySinh;
	// 2. Get, set methods

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	// 3. Constructor methods
	public ConNguoi() {
		this.hoTen = "Le Thanh Dat";
		this.ngaySinh = "10-11-2000" ;
	}
	public ConNguoi(String hoTen, String ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	
	// copy constructor
	public ConNguoi(ConNguoi cn) {
		hoTen = cn.hoTen;
		ngaySinh = cn.ngaySinh;
		
	}
	// 4. Input, output
	public void nhap(Scanner sc) {
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
//		System.out.print("Ngay sinh: ");
//		ngaySinh = sc.nextLine();
	}
	public void in() {
		
		System.out.println("Ho ten: "+hoTen+"; Ngay sinh: "+ngaySinh);
	}
	
	public String toString() {
		return ("Ho ten: "+hoTen+"; Ngay sinh: "+ngaySinh);
	}
	
	
	
	// 5. Business methods
	public String namSinh() {
		return  ngaySinh.split("-")[1];
	}
	
	public String layTen() {
//		return (hoTen.substring(hoTen.lastIndexOf(" ")+1));
		return hoTen.split(" ")[3];
	}
}
