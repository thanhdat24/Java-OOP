import java.util.Scanner;

public class Date {

	// 1. Các thuộc tính
	private int ngay, thang, nam;
	// 2. Các phương thức get, set

	// 3. Các phương thức khởi tạo
	public Date() {
		ngay = 1;
		thang = 1;
		nam = 2021;
	}

	public Date(int d, int m, int y) {
		this.ngay = d;
		this.thang = m;
		this.nam = y;
	}
	
	public Date(Date d) {
		ngay = d.nam;
		thang = d.thang;
		nam = d.nam;
	}
	

	// 4. Các phương thức nhập, xuất
	public void nhap(Scanner sc) {
		do {
			if (hLe()) {
				System.out.print("Nhập ngày: ");
				ngay = sc.nextInt();
				System.out.print("Nhập tháng: ");
				thang = sc.nextInt();
				System.out.print("Nhập năm: ");
				nam = sc.nextInt();
			}
			else break;
		} while (!hLe());
	}

	public boolean hLe() {
		boolean h = false;
		int max[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (nam % 4 == 0)
			max[2] = 29;
		if (nam > 0 && thang > 0 && thang < 13 && ngay > 0 && ngay <= max[thang])
			h = true;
		return h;
	}

	public void xuat() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	
	public String toSring() {
		return (ngay + "/" + thang + "/" + nam);
	}
	// 5. Các phương thức xử lí nghiệp vụ liên quan
	public Date ngayHomSau() {
		Date date = new Date(ngay, thang, nam);
		date.ngay++;
		if (!date.hLe()) {
			date.ngay = 1;
			date.thang++;
			if (!date.hLe()) {
				date.thang = 1;
				date.nam++;
			}
		}
		return date;
	}

	public Date congNgay(int n) {
		Date date = new Date(ngay,thang,nam);
		for (int i = 0; i < n; i++)
			date = date.ngayHomSau();
		return date;
	}

}
