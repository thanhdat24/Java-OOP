import java.util.Scanner;

public class KhachHang {
	// 1. Attributes
	private String hoTen;
	private String diaChi;
	private Date ngaySinh;
	private String gioiTinh;
	// 2. Get,set methods

	public String getHoTenKH() {
		return hoTen;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTen = hoTenKH;
	}

	public String getDiaChiKH() {
		return diaChi;
	}

	public void setDiaChiKH(String diaChiKH) {
		this.diaChi = diaChiKH;
	}

	public Date getNamSinh() {
		return ngaySinh;
	}

	public void setNamSinh(Date namSinh) {
		this.ngaySinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	// 3. Constructor methods
	public KhachHang() {
		hoTen = new String();
		diaChi = new String();
		ngaySinh = new Date();
		gioiTinh = new String();

	}

	public KhachHang(String hoTen, String diaChi, Date ngaySinh, String gioiTinh) {
			hoTen = new String(this.hoTen);
			diaChi = new String(this.diaChi);
			ngaySinh = new Date(this.ngaySinh);
			gioiTinh = new String(this.gioiTinh);
					
	}

	public KhachHang(KhachHang kh) {
		hoTen = new String(kh.hoTen);
		diaChi = new String(kh.diaChi);
		ngaySinh = new Date(kh.ngaySinh);
		gioiTinh = new String(kh.gioiTinh);
	}

	// 4. Input, output
	public void nhap(Scanner sc) {
		sc.nextLine();
		System.out.print("Họ tên khách hàng: ");
		hoTen = sc.nextLine();
		System.out.print("Địa chỉ khách hàng: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		ngaySinh.nhap(sc);
		sc.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh = sc.nextLine();

//		sc.nextLine();
	}
	public void in () {
		System.out.println("Họ tên khách hàng: " + hoTen + ", Địa chỉ: " + diaChi + ", Ngày sinh: " + ngaySinh.toSring() + ", Giới tính: "
				+ gioiTinh);
	}
	public String toString() {
		return "Họ tên khách hàng: " + hoTen + ", Địa chỉ: " + diaChi + "\nNgày sinh: " + ngaySinh.toSring() + ", Giới tính: "
				+ gioiTinh;

	}

	// 5. Business methods

}
