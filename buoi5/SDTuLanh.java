package th6;

import java.util.Scanner;

public class SDTuLanh {
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        int n;
	        n = scanner.nextInt();
	        TuLanh[] ds= new TuLanh[n];
	        for (int i = 0; i < n; i++) {
	        	ds[i] = new TuLanh();
	        	ds[i].nhapThongTin();
	        }
	        
	       for (int i = 0; i < n -1 ; i++) {
	    	   for (int j = i+1; j < n; j++) {
	    		   if (ds[i].layGia() < ds[j].layGia()) {
	    			   TuLanh temp = ds[i];
	    			   ds[i] =ds[j];
	    			   ds[j] =temp;
	    		   }
	    	   }
	       }
	       
	       for (int i = 0; i < n; i++)
	            ds[i].hienThi();
	}

}
