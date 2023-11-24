package Praktikum2;
import java.util.Scanner; //memakai library scanner 

public class PengkondisianSWITCH {
	public static void main( String args[]){
		
//inisialisasi variabel 
		int angka1, angka2, hasil;
		String perhitungan;
		
		Scanner input = new Scanner(System.in);
		//input user 
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		System.out.print("List Perhitungan yang diinginkan: "
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n % : modulo"
				+ "\n Masukan simbol yang diinginkan : ");
		perhitungan = input.next();//inputan yang menerima suatu nilai berdata String 
		//kondisi Switch
		switch(perhitungan ) {
		case "+": 
			hasil = angka1 + angka2; 
			System.out.println("Hasilnya adalah : "+ hasil);
			break; //program berhenti jiak memenuhi kondiis atasnya
		case "-": 
			hasil = angka1 - angka2; 
			System.out.println("Hasilnya adalah : "+ hasil);
			break;
		case "*": 
			hasil = angka1 * angka2; 
			System.out.println("Hasilnya adalah : "+ hasil);
			break;
		case "/": 
			hasil = angka1 / angka2; 
			System.out.println("Hasilnya adalah : "+ hasil);
			break;
		case "%": 
			hasil = angka1 % angka2; 
			System.out.println("Hasilnya adalah : "+ hasil);
			break;
		default: //jika kondisi keseluurhan tidak memenuhi maka pakai default saja  
			System.out.println("Simbol yang dimasukan salah!");
		}
		
	}
}
