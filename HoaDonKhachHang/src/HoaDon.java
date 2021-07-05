import java.util.Scanner;

public class HoaDon {
	//1. Attributes
	private final int Max = 20;
	private int mahd;
	private String tenhd, tennl;
	private Date ngayky;
	private KhachHang k;
	private ChiTiet c[];
	//2. Get,set methods
	
	//3. Constructor methods
	public HoaDon() {
		mahd = 0;
		tennl = new String();
		tenhd = new String();
		ngayky = new Date();
		k =new KhachHang();
		c = new ChiTiet[Max];
	}
	
	public HoaDon(int mahd, String tenhd, String tennl, Date ngayky, KhachHang k) {
		mahd = this.mahd;
		tenhd = new String(this.tenhd);
		tennl = new String(this.tennl);
		ngayky = new Date(this.ngayky);
		k = new KhachHang(this.k);
		for (int i = 0; i < Max; i++) {
			c[i] = new ChiTiet();
		}
	}
	
	public HoaDon(HoaDon hd) {
		mahd = 0;
		tennl = new String(hd.tennl);
		tenhd = new String(hd.tenhd);
		ngayky = new Date(hd.ngayky);
		k =new KhachHang(hd.k);
		for (int i = 0; i < Max; i++) {
			c[i] = new ChiTiet();
		}
		
	}
	//4. input, output
	public void nhap(Scanner sc){
		System.out.print("Nhap ma hoa don: ");
		mahd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ten hoa don: ");
		tenhd = sc.nextLine();
		
		System.out.print("Nhap ten nguoi lap: ");
		tennl = sc.nextLine();
		ngayky.nhap(sc);
		
		System.out.println("Nhap thong tin khach hang: ");
		k.nhap(sc);
		
		System.out.print("Nhap so chi tiet cua hoa don: ");
		int sluong = sc.nextInt();
		c = new ChiTiet[sluong];
		for(int i=0;i<sluong;i++){
			c[i] = new ChiTiet();
			c[i].nhap(sc);
		}
	}
	
	public void in(){
		System.out.println("\n----- Hoa don -----");
		System.out.print("Ma hoa don: "+ mahd +"\n"+"Ten hoa don: " +tenhd);
		System.out.println("\n\n----- Nguoi lap hoa don -----");
		System.out.println("Ten nguoi lap: "+tennl +"\tNgay lap: "+ngayky.toSring());
		System.out.println("\n----- Thong tin khach hang -----");
		k.in();
		System.out.println("\n----- Chi tiet hoa don -----");
		for(int i=0;i<c.length;i++){
			c[i].in();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		HoaDon  h = new HoaDon();
//		HangHoa hh = new HangHoa();
//		hh.nhap(sc);
//		h.nhap(sc);
//		hh.in();
//		h.in();
		System.out.print("Nhap vao so hoa don: ");
		int n = sc.nextInt();
		HoaDon h1[];
		h1 = new HoaDon[n];
		for (int i = 0; i < n; i++) {
			h1[i] = new HoaDon();
			h1[i].nhap(sc);
		}
		
		for (HoaDon d: h1) {
			d.in();
		}
	}
	

}
