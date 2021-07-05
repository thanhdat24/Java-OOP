package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{

	//1. Attributes
	private String taiKhoan, matKhau, email;
	//2. get,set
	
	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//3. Constructor
	public SinhVienCNTT() {
		super();
		taiKhoan = new String();
		matKhau = new String();
		email = new String();
	}
	
	
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taiKhoan = new String(sv.taiKhoan);
		matKhau = new String(sv.matKhau);
		email = new String(sv.email);
	}	
	
	//4. input, output
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.println("Nhập tài khoản: ");
		taiKhoan = sc.nextLine();
		System.out.println("Nhập mật khẩu: ");
		matKhau = sc.nextLine();
		System.out.println("Nhập email: ");
		email = sc.nextLine();
	}
	
	public String toString() {
		return super.toString() + "Tài khoản: " +taiKhoan 
				+", Mật khẩu: "+matKhau + ", Email: " + email;
	}
	//5. Business method
	public void doiMatKhau(String mk) {
		matKhau = new String(mk);
	}

}
