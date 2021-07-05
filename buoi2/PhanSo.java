package buoi2;

import java.util.Scanner;

public class PhanSo {

	// 1. Thuộc tính
	private int tuSo, mauSo;
	// 2. Get, set methods

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	// 3. Constructors methods
	public PhanSo() {
		this.tuSo = 0;
		this.mauSo = 1;
	}

	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	// 4. Input, output methods
	public void nhap(Scanner sc) {
		System.out.print("Nhập tử số: ");
		this.tuSo = sc.nextInt();
		System.out.print("Nhập mẫu số: ");
		this.mauSo = sc.nextInt();
		while (this.mauSo == 0) {
			System.out.println("Nhập lại mẫu số khác 0!");
			this.mauSo = sc.nextInt();
		}
	}

	public void xuat() {
		if (this.tuSo == 0)
			System.out.println("0");
		else if (this.mauSo == 1 || this.mauSo == this.tuSo)
			System.out.println(this.tuSo / this.mauSo);
		else {
			if (this.mauSo * this.tuSo < 0)
				System.out.print("-");
			System.out.println((int) Math.abs(this.tuSo) + "/" + (int) Math.abs(this.mauSo));
		}

	}

	// 5. Business methods
	public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
	public void toiGianPhanSo() {
        int i = timUSCLN(this.tuSo, this.mauSo);
        this.setTuSo(this.tuSo/ i);
        this.setMauSo(this.mauSo/ i);
    }
	
	public void nghichDao() {
		if (this.tuSo == 0)
			System.out.println("Lỗi do tử số bằng 0, không tồn tại nghịch đảo phân số!");
		else {
			
			int tam;
			tam = this.tuSo;
			this.tuSo = this.mauSo;
			this.mauSo = tam;
		}
	}
	public float giaTriThuc() {
		return ((float) this.tuSo / this.mauSo);
	}
	
	public PhanSo giaTriNghichDao() {
		PhanSo pSo = new PhanSo(tuSo, mauSo);
		int mauSo1 =1;
		int tuSo1 = 0;
		mauSo1 = pSo.tuSo ;
		tuSo1 = pSo.mauSo ;
		PhanSo pSo1 = new PhanSo(tuSo1, mauSo1);
		return pSo1;
	}


	public boolean lonHon(PhanSo a) {
		boolean flag = false;
		PhanSo pSo = new PhanSo(this.tuSo, this.mauSo);
		float b1 = pSo.giaTriThuc();
		float b2 = a.giaTriThuc();
		if (b1 > b2)
			flag = true;
		return flag;
	}
	public PhanSo congPhanSo(PhanSo a) {
		boolean flag1 = true;
		boolean flag2 = true;
		int tuSo1 = (this.tuSo*a.mauSo) +(a.tuSo*this.mauSo);
		if (tuSo1 < 0 )  flag1 = false;
		tuSo1 = Math.abs(tuSo1);
		int mauSo1 = (this.mauSo*a.mauSo);
		if (mauSo1 < 0 )  flag2 = false;
		PhanSo phanSoTong = new PhanSo(tuSo1, mauSo1);
		phanSoTong.toiGianPhanSo();
//		if (flag1 == true  || (flag1 == false && flag2 == false)) System.out.println(+ phanSoTong.tuSo + "/" + phanSoTong.mauSo);
//		else System.out.println("-"+ phanSoTong.tuSo + "/" + phanSoTong.mauSo);
		return phanSoTong;
	}
	
	public PhanSo truPhanSo(PhanSo a) {
		boolean flag = true;
		int tuSo1 =this.getTuSo()*a.getMauSo() - a.getTuSo()*this.getMauSo();
		if (tuSo1 < 0 )  flag = false;
		tuSo1 = Math.abs(tuSo1);
		int mauSo1 = (this.getMauSo()*a.getMauSo());
		PhanSo phanSoHieu = new PhanSo(tuSo1, mauSo1);
		phanSoHieu.toiGianPhanSo();
		if (flag == true) System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
		else System.out.println("Hiệu hai phân số = " + "-"+phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
		return phanSoHieu;
	}
	
	public PhanSo nhanPhanSo(PhanSo a) {
		boolean flag = true;
		int tuSo1 =this.getTuSo()*a.getTuSo();
		if (tuSo1 < 0 )  flag = false;
		tuSo1 = Math.abs(tuSo1);
		int mauSo1 = (this.getMauSo()*a.getMauSo());
		PhanSo phanSoNhan = new PhanSo(tuSo1, mauSo1);
		phanSoNhan.toiGianPhanSo();
		if (flag == true) System.out.println("Nhân hai phân số = " + phanSoNhan.tuSo + "/" + phanSoNhan.mauSo);
		else System.out.println("Nhân hai phân số = " + "-"+phanSoNhan.tuSo + "/" + phanSoNhan.mauSo);
		return phanSoNhan;
	}

	public PhanSo chiaPhanSo(PhanSo a) {
		boolean flag1 = true;
		boolean flag2 = true;
		int tuSo1 =this.getTuSo()*a.getMauSo();
		if (tuSo1 < 0 )  flag1 = false;
		tuSo1 = Math.abs(tuSo1);
		int mauSo1 = (this.getMauSo()*a.getTuSo());
		if (mauSo1 < 0 )  flag2 = false;
		mauSo1 = Math.abs(mauSo1);
		PhanSo phanSoChia = new PhanSo(tuSo1, mauSo1);
		phanSoChia.toiGianPhanSo();
		if (flag1 == true || (flag1 == false && flag2 == false)) System.out.println("Chia hai phân số = " + phanSoChia.tuSo + "/" + phanSoChia.mauSo);
		else System.out.println("Chia hai phân số = " + "-"+phanSoChia.tuSo + "/" + phanSoChia.mauSo);
		return phanSoChia;
	}
}
