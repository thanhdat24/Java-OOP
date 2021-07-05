package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem{
	//1. Attributes
	private String mau;
	//2. get,set 
	
	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	//3. constructor
	public DiemMau() {
		super();
		mau = new String();
	}

	
	public DiemMau(int x, int y, String m1) {
		super(x, y);
		mau = new String (m1);
	}
	
	// hàm sao chép
	public DiemMau(DiemMau dm) {
		super((Diem) dm);
		mau = new String (dm.mau);
		
	}

	//4. input, output
	public void nhapDiemMau(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhập màu: ");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("mau = " + mau);
	}
	
	public String toSring() {
		return super.toString() + ", và màu = " + mau;
	}
	//5. business methods
	
	public void gan(String m) {
		mau = new String (m);
	}
	
	public void gan(int x1, int y1, String m1) {
		super.gan(x1, y1);
		mau = new String(m1);
	}

}
