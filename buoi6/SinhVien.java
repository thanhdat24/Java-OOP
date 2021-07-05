package th7;

import java.util.Scanner;

import com.sun.tools.javac.tree.DCTree.DCAttribute;

public class SinhVien extends Nguoi{
	// thuoc tinh
	private String MSSV;
	private boolean dangvien ;
	private String chucvu;
	// get, set
	
	public boolean isDangvien() {
		return dangvien;
	}
	public void setDangvien(boolean dangvien) {
		this.dangvien = dangvien;
	}
	// phuong phuc
	public SinhVien() {
		super();
		MSSV = "b123456";
		dangvien = true;
		chucvu = "lop truong";
	}
	public SinhVien(String ht, String ns, String qq, String MSSV1, boolean dangvien1, String chucvu1) {
		super(ht, ns, qq);
		MSSV = new String(MSSV1);
		dangvien = dangvien1;
		chucvu = new String(chucvu1);
	}
	
	public SinhVien(SinhVien sv) {
		super((SinhVien) sv);
		MSSV = sv.MSSV;
		dangvien = sv.dangvien;
		chucvu = sv.chucvu;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
//		System.out.print("Nhap MSSV: ");
//		MSSV = sc.nextLine();
		System.out.print("Nhap dang vien: ");
		dangvien = sc.nextBoolean();
//		sc.nextLine();
//		System.out.print("Nhap chuc vu: ");
//		chucvu = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("MSSV: "+MSSV+"\nDang vien: "+(dangvien ? "Co":"Khong"+"\nChuc vu: "+chucvu ));
	}
}
