import java.util.Scanner;

public class ChiTiet {
	//1. Attributes
	private HangHoa h;
	private int sluong;
	private float dgia;
	//2. get, set
	
	public int getSluong() {
		return sluong;
	}

	public void setSluong(int sluong) {
		this.sluong = sluong;
	}

	public float getDgia() {
		return dgia;
	}

	public void setDgia(float dgia) {
		this.dgia = dgia;
	}

	//3. Constructor
	public ChiTiet() {
		h = new HangHoa();
		sluong = 0;
		dgia = 0f;
	}
	
	public ChiTiet(HangHoa h, int sluong, float dgia) {
		h = new HangHoa(this.h);
		sluong = this.sluong;
		dgia = this.dgia;
	}
	
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		sluong = c.sluong;
		dgia = c.dgia;
	}
	//4. Input, output
		public void nhap(Scanner sc) {
			System.out.print("Nhap so luong: ");
			sluong = sc.nextInt();
			System.out.print("Nhap don gia: ");
			dgia = sc.nextFloat();
		}
		
		public void in () {
			System.out.println("So luong: "+sluong+"\nDon gia: "+dgia);
		}
		
		public String toSring() {
			return ("So luong: "+sluong+"\nDon gia: "+dgia);
		}
	//5. Business method

}
