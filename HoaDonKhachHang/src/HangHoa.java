import java.util.Scanner;

public class HangHoa {
	// 1. Attributes
	private String maso, tenhh, nhasx;
	// 2. Get,set 
	
	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public String getTenhh() {
		return tenhh;
	}

	public void setTenhh(String tenhh) {
		this.tenhh = tenhh;
	}

	public String getNhasx() {
		return nhasx;
	}

	public void setNhasx(String nhasx) {
		this.nhasx = nhasx;
	}

	// 3. Constructor methods 
	public HangHoa() {	
		 maso = new String();
		 tenhh = new String();
		 nhasx = new String();
	}
	
	public HangHoa (String maso, String tenhh, String nhasx) {
		maso = new String(this.maso);
		tenhh = new String(this.tenhh);
		nhasx = new String(this.nhasx);
	}
	
	public HangHoa (HangHoa h) {
		maso = new String(h.maso);
		maso = new String(h.tenhh);
		maso = new String(h.nhasx);
	}
	
	// 4. Input, output
	public void nhap(Scanner sc) {
		System.out.print("Nhap ma so: ");
		maso = sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		tenhh = sc.nextLine();
		System.out.print("Nhap nha san xuat: ");
		nhasx = sc.nextLine();
	}
	public void in () {
		System.out.println("----- Hang hoa -----");
		System.out.println("Ma so: "+maso+"\nTen hang hoa: "+tenhh+"\nNha san xuat: "+nhasx);
	}
	
	public String toString() {
		return ("Ma so: "+maso+"\nTen hang hoa: "+tenhh+"\nNha san xuat: "+nhasx);
	}
	// 5. Business method
}
