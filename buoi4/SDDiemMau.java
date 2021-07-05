package buoi4;

import java.util.Scanner;

public class SDDiemMau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	DiemMau A =  new DiemMau(5, 10, "trắng");
	A.in();
	DiemMau B = new DiemMau();
	B.nhapDiemMau(sc);
	B.tinhTien(10, 8);
	B.gan("Vàng");
	B.in();
	}
}
