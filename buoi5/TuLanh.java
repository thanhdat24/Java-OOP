package th6;

import java.util.Scanner;


public class TuLanh {
	//1. Attributes
	private String nhanhieu, maso, nuocsx;
	private boolean tkdien;
	private int dungtich, gia;

	//2. Constructor
    public TuLanh() {
		nhanhieu ="Electrolux";
		maso = "UNKNOWN";
		nuocsx = "Việt Nam";
		tkdien = true;
		dungtich = 256;
		gia = 7000000;
	}
	public TuLanh(String nhanhieu1, String maso1, String nuocsx1, boolean tkdien1, int dungtich1, int gia1) {
		nhanhieu = new String(nhanhieu1);
		maso = new String(maso1);
		nuocsx = new String(nuocsx1);
		tkdien = tkdien1;
		dungtich = dungtich1;
		gia = gia1;
	}
	
	public TuLanh(TuLanh t) {
		nhanhieu = new String(t.nhanhieu);
		maso = new String(t.maso);
		nuocsx = new String(t.nuocsx);
		tkdien = t.tkdien;
		dungtich = t.dungtich;
		gia = t.gia;
	}
	
	public void makeCopy(TuLanh tl) {
		nhanhieu = new String(tl.nhanhieu);
		maso = new String(tl.maso);
		nuocsx = new String(tl.nuocsx);
		tkdien = tl.tkdien;
		dungtich = tl.dungtich;
		gia = tl.gia;
	}
	
	//3. Input, output
	public void nhapThongTin() {
	    Scanner sc = new Scanner(System.in);
		nhanhieu =sc.nextLine();
		maso = sc.nextLine();		
		nuocsx = sc.nextLine();
		tkdien =sc.nextBoolean();
		dungtich =sc.nextInt();
		gia = sc.nextInt();
		sc.nextLine();
	}
    public void hienThi() {
    	System.out.println("==========");
        System.out.println("Nhãn hiệu: " + nhanhieu);
        System.out.println("Mã số    : " + maso);
        System.out.println("Nước SX  : " + nuocsx);
        System.out.println("T/K điện : " + (tkdien ? "Có" : "Không"));
        System.out.println("Dung tích: " + dungtich  + "L");
        System.out.println("Giá      : " + gia + "VNĐ");
        System.out.println("==========");
	}
	
	//4. get,set
	public String layNhanHieu() {
		return nhanhieu;
	}

	public int layGia() {
		return gia;
	}
	//5. Business method
	public int soNguoiSD() {
		return Math.round(dungtich/100* 10) / 10;
	}
	
	public boolean cungNhanHieu(TuLanh tl) {
		 return nhanhieu.equals(tl.nhanhieu);
	}
	
	public  boolean nhoHon(TuLanh tl) {
		return dungtich < tl.dungtich;
	}
}





