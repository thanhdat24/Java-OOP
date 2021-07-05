package dethithuchanh;

import java.util.Scanner;

public class CauThu extends ConNguoi{
	//1. Attributes
	private int soAo;
	private String viTri;
	//2. get, set
	
	public int getSoAo() {
		return soAo;
	}

	public void setSoAo(int soAo) {
		this.soAo = soAo;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	//3. constructor
	public CauThu() {
		this.soAo = 0;
		this.viTri = "du bi";
	}
	
	
	public CauThu(String hoTen, String ngaySinh, int soAo, String viTri) {
		super(hoTen,ngaySinh);
		this.soAo = soAo;
		viTri = new String(viTri);
	}
	//4. input, output
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("So ao: ");
		soAo = sc.nextInt();
		sc.nextLine();
		System.out.print("Vi tri: ");
		viTri = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("So ao: "+soAo);
		System.out.println("Vi tri: "+viTri);
	}
	//5. business method
	

}
