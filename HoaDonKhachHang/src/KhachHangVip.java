import java.util.Scanner;

public class KhachHangVip extends KhachHang{
	// 1. Attributes
	private Date ngay;
	private float tile;
	// 2. Get, set
	
	public float getTile() {
		return tile;
	}

	public void setTile(float tile) {
		this.tile = tile;
	}

	// 3. Constructor
	public KhachHangVip() {
		super();
		ngay = new Date();
		tile = 0f;
	}
	
	public KhachHangVip(String hoTen, String diaChi, Date ngaySinh, String gioiTinh, Date ngay, float tile) {
		super(hoTen, diaChi, ngaySinh, gioiTinh);
		ngay = new Date(this.ngay);
		tile = this.tile;
	}
	public KhachHangVip(KhachHangVip kh) {
		super((KhachHang) kh);
		ngay = new Date(kh.ngay);
		tile = kh.tile;
	}
	 
	// 4. Input, output
	public void nhap (Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhap ngay: ");
		ngay.nhap(sc);
		System.out.print("Nhap ti le: ");
		tile = sc.nextFloat();
	}
	
	public void in () {
		super.in();
		System.out.println("Ngay: "+ngay+"\nTi le: "+tile);
	}
	// 5. Business method
	
	
	

}
