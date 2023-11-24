package latihanTugas;

import java.util.Scanner;

public class TandaKamu {
	
	private int yearBirth;
	private int yearNow;
	private String red;
	
	public void Age(int yearNow) {
		this.yearNow = yearNow;
	}
	
	public int getYearNow() {
		return yearNow = 2023;
	}
	
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	public int getYearBirth() {
		return yearBirth;
	}
	
	public int hitungUmur() {
		int age = this.yearNow - this.yearBirth;
		return  age;
	}
	
	public String tandanyaKamu(int umur) {
		red = Integer.toString(umur);
		return red;
	}
	
	
	 
	public static void main (String[] args) {
		
		TandaKamu kamu = new TandaKamu();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan tahun lahir : ");
		kamu.setYearBirth(input.nextInt());
		
		System.out.println("Tahun lahir anda : "+kamu.getYearBirth());
		System.out.println("Hari ini tahun : "+kamu.getYearNow());
		System.out.println("Umur kamu sampai hari ini adalah "+kamu.hitungUmur()+" tahun");
		
		String red = kamu.tandanyaKamu(kamu.hitungUmur());
		if( 0 <= kamu.hitungUmur() & kamu.hitungUmur() <= 5 ) {
			red = "LAGI LUCU-LUCUNYA";
			System.out.println("Tandanya kamu "+red);
		} else if ( 5 < kamu.hitungUmur() & kamu.hitungUmur() <= 10) {
			red = "Masih kanak-kanak";
			System.out.println("Tandanya kamu "+red);
		}else if ( 10 < kamu.hitungUmur() & kamu.hitungUmur() <= 13) {
			
			red = "Maih remaja";
			System.out.println("Tandanya kamu "+red);
		}else if ( 13 < kamu.hitungUmur() & kamu.hitungUmur() <= 19) {
			
			red = "Alay";
			System.out.println("Tandanya kamu "+red);
		}else if ( 19 < kamu.hitungUmur() & kamu.hitungUmur() <= 29) {
			
			red = "Lagi galau nyari jodoh";
			System.out.println("Tandanya kamu "+red);
		}else if ( 29 < kamu.hitungUmur() & kamu.hitungUmur() <= 35) {
		
			red = "Lagi sibuk nyari uang";
			System.out.println("Tandanya kamu "+red);
		}else if ( 35 < kamu.hitungUmur() & kamu.hitungUmur() <= 150) {
			
			red = "SUDAH TUA";
			System.out.println("Tandanya kamu "+red);
		} else if (0 > kamu.hitungUmur() & kamu.hitungUmur() > 150) {
			red = "TIDAK TERDETEKSI KEHIDUPAN";
			System.out.println("Tandanya kamu "+red);
		}
		
		
		
		
//		System.out.print("a : " );
//		int ambilSaldo = input.nextInt();
//		int sisaSaldo = saving.ambilUang(ambilSaldo);
//		
	}
}
