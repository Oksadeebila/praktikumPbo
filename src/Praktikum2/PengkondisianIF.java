package Praktikum2;
import java.util.Scanner; //Memakai library scanner 

public class PengkondisianIF {
	public static void main(String args[]) {
		//inisialisasi variabel 
		int angka1, angka2, hasil, perhitungan;
		Scanner input = new Scanner(System.in);
		//input user 
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		System.out.print("List Perhitungan yang diinginkan: "
				+ "\n 1 : pertambahan"
				+ "\n 2 : pengurangan"
				+ "\n 3 : perkalian"
				+ "\n 4 : pembagian"
				+ "\n 5 : modulo"
				+ "\n Masukan angka perhitungan");
		perhitungan = input.nextInt();
		//kondisi if 
		if(perhitungan == 1 ) {
			hasil = angka1 + angka2; 
			System.out.println("Hasilnay adalah : "+hasil);
			
		} else if (perhitungan == 2 ) {
			hasil = angka1 - angka2;
			System.out.println("Hasilnay adalah : "+hasil);
		} else if (perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.println("Hasilnay adalah : "+hasil);
		} else if (perhitungan == 4){
			hasil = angka1 / angka2;
			System.out.println("Hasilnay adalah : "+hasil);
		} else {
			hasil = angka1 % angka2;
			System.out.println("Hasilnay adalah : "+hasil);
		}
	}
}
