package latihanTugas;
import java.util.Scanner;

public class TandanyaKamu {
	
	private int yearBirth, yearNow, umur;
	private String red;
	int hargaPerGram = 540000;
	double mahar;
	
	public void Age(int yearNow) {
		Scanner inputAge = new Scanner(System.in);
		System.out.print("Sekarang tahun berapa: ");
		yearNow = inputAge.nextInt();
		
	}
	
	public void setMhar(double setMhar) {
		this.mahar = mahar;
//		canner input = new Scanner(System.in);
//		System.out.print("Tahun lahir anda berapa: ");
//		yearBirth = input.nextInt();
//		umur = yearBirth - 2003;
//		System.out.println("Umur kamu adalah " + umur);
	}
	
	public double getMhar() {
		return mahar ;
	}
}
	

	
	public double mahar(double totalMahar) {
		int totalMahar = yearBirth * hargaPerGram;
		return totalMahar;
	}
	
	public static void main (String[] args) {
		
		TandanyaKamu Maharnya = new TandanyaKamu();
		Maharnya.setMhar(15.7);
		
		System.out.print("Umur anda : "+umur.getYearBirth());
		
	}
}
