package latihanTugas;
import latihanTugas.Persegi;
import latihanTugas.PersegiPanjang;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persegi persegi = new Persegi();
		persegi.setSisi(7);

		PersegiPanjang Pp = new PersegiPanjang();
		Pp.setPanjang(7);
		Pp.setLebar(12);
		
		System.out.println("=====Persegi====");
		System.out.println("Sisi = "+persegi.getSisi());
		System.out.println("Keliling Persegi = "+persegi.hitungKeliling());
		System.out.println("Luas Persegi = "+persegi.hitungLuas()+ "\n");
		
		System.out.println("=====Persegi Panjang====");
		System.out.println("Panjang = "+Pp.getPanjang());
		System.out.println("Lebar = "+Pp.getLebar());
		System.out.println("Keliling Persegi = "+Pp.hitungKeliling());
		System.out.println("Luas Persegi = "+Pp.hitungLuas());
		
	}

}
