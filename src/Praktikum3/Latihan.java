package Praktikum3;
import java.util.Scanner;

public class Latihan {

	public static void main(String[] args) {
		//inisialisasi scanner 
		Scanner input = new Scanner(System.in);
		//inisialisasai variabel 
		int angka1, angka2, hasil, perulangan,perhitungan;
		
		//input perulangannya 
		System.out.println("Masukan perulangan : ");
		perulangan = input.nextInt();
		
		//perulangan for 
		for(int i = 1; i <= perulangan; i++) {
			//input angka 1 dan angka3 oleh user
			System.out.println("Masukan angka 1 : ");
			angka1 = input.nextInt();
			System.out.println("Masukan angka 2 : ");
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
				System.out.println("Hasilnay adalah : "+hasil+"\n");
				
			} else if (perhitungan == 2 ) {
				hasil = angka1 - angka2;
				System.out.println("Hasilnay adalah : "+hasil+"\n");
			} else if (perhitungan == 3) {
				hasil = angka1 * angka2;
				System.out.println("Hasilnay adalah : "+hasil+"\n");
			} else if (perhitungan == 4){
				hasil = angka1 / angka2;
				System.out.println("Hasilnay adalah : "+hasil+"\n");
			} else {
				hasil = angka1 % angka2;
				System.out.println("Hasilnay adalah : "+hasil+"\n");
			}
		}
	}

}
