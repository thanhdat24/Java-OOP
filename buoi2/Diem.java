package buoi2;
import java.util.Scanner;


public class Diem {

	//1. Các thuộc tính
	private int x,y;
	
	//2. Các phương thức get, set
	
	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}

	//3. Các phương thức khởi tạo
	public Diem() {
		this.x = this.y = 0;
		// System.out.println("Goi ham xay dung 1");
	}
	
	public Diem(int x, int y){
		this.x = x;
		this.y = y;
		// System.out.println("Goi ham xay dung 2");
	}
	
	//copy constructor
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	//4. Các phương thức nhập, xuất
	public void nhap(Scanner sc){
		System.out.print("Nhập x = ");
		 x = sc.nextInt();
		System.out.print("Nhập y = ");
		 y = sc.nextInt();
		 sc.nextLine();
	}
	
	public void in(){
		System.out.println("("+x+","+y+")");
	}
	
	public String toString() {
		return ("("+x+","+y+")");
	}
	//5. Các phương thức xử lí nghiệp vụ liên quan
	public void gan(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void tinhTien(int dx, int dy){
		x +=dx;
		y +=dy;
	}
	
	public double Kcach(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double Kcach(Diem d){
		return Math.sqrt(Math.pow(x-d.x,2) + Math.pow(y-d.y, 2));
	}
}
