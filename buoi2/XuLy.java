package buoi2;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diem a,b,c;
		System.out.println("Tạo đối tượng \n");
		
		a = new Diem();
		b = new Diem();
		
		System.out.println("Nhập tọa độ a: ");
		a.nhap(sc);
		
		System.out.println("Tọa độ a: ");
		a.in();
		
		System.out.println("Nhập tọa độ b: ");
		b.nhap(sc);
		
		System.out.println("Tọa độ b: ");
		b.in();
		
		System.out.println("Khoảng cách a: "+a.Kcach());
		
	}

}
