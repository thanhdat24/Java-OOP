package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private final int MAX = 60;
	//1. Attributes
	private String maSo;
	private String hoTen;
	private Date ngaySinh;
	private int soHP;
	private String tenHP[];
	private String diemHP[]; // Tinh theo thang diem A,B+,B,...
	//2 .Get, set methods
	
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	public String[] getTenHP() {
		return tenHP;
	}

	
	public String[] getDiemHP() {
		return diemHP;
	}

	//3. Constructor methods
	public SinhVien() {
		maSo = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soHP = 0;
		tenHP=new String[MAX];
		diemHP = new String[MAX];
		for(int i=0;i<MAX;i++){
			tenHP[i]=new String();
			diemHP[i]=new String();
		}
	}
	
	public SinhVien(SinhVien sv) {
		maSo = new String(sv.maSo);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		soHP = sv.soHP;
		tenHP=new String[MAX];
		diemHP = new String[MAX];
		for(int i = 0; i < MAX; i++){
			tenHP[i]=new String(sv.tenHP[i]);
			diemHP[i]=new String(sv.diemHP[i]);
		}
	}
	//4. input, output 
	public void nhap(Scanner sc){
		System.out.print("Nhập mssv: ");
		maSo = sc.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		
//		System.out.println("Nhập ngày sinh:");
//		ngaySinh.nhap(sc);
//		sc.nextLine();
	}
	public void nhapDiem(Scanner sc) {
		do {
			System.out.print("Nhập số học phần đăng ký: ");
			soHP = Integer.parseInt(sc.nextLine());
		}while(soHP > MAX);
		
		System.out.println("\nNhập các môn học: ");
		
		for (int i = 0; i < soHP; i++) {
			System.out.print("Nhập tên môn học thứ " +(i+1)+" : ");
			tenHP[i] =sc.nextLine();
			System.out.print("Nhập điểm môn học thứ "+ (i+1) +" : ");
			diemHP[i] =sc.nextLine();
		}
	}
	
	public String toString() {
		String s = "Mssv: "+maSo + ", " +"Họ tên: "+ hoTen + "\n Các môn học đã đký: " +"[ ";
		for (int i = 0; i < soHP; i++) {
			s += tenHP[i] + ": " + diemHP[i] + "; ";
		}
		s += "]";
		return s;
	}
	//5. Business methods
	public float tinhDTB() {
		float d = 0f;
		for (int i = 0; i < soHP; i++) {
			if (diemHP[i].equals("A")) d += 4;
			else if (diemHP[i].equals("B+")) d += 3.5;
			else if (diemHP[i].equals("B")) d += 3.0;
			else if (diemHP[i].equals("C+")) d += 2.5;
			else if (diemHP[i].equals("C")) d += 2.0;
			else if (diemHP[i].equals("D+")) d += 1.5;
			else if (diemHP[i].equals("D")) d += 1.0;
			else d += 0.0;
		}
		return d / soHP;
	}
	
	public void dKyHP(String ten, String d) {
		if (soHP < MAX) {
			tenHP[soHP] = new String(ten);
			diemHP[soHP] = new String(d);
			soHP++;
		}
		else System.out.println("Không thể thêm môn mới");
	}
	public void xoaHP(String ten) {
		for (int i = 0 ; i < soHP; i++) {
			if (tenHP[i].compareTo(ten) == 0) {
				for (int j = i; j < soHP - 1; j++) {
					tenHP[j] = tenHP[j+1];
				}
				soHP--;
				break;
			}
		}
	}
	
	public String layTen() {
		return (hoTen.substring(hoTen.lastIndexOf(" ")+1));
	}

}
