package praktikum1;
import java.util.Scanner; 

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Selamat Datang!\n");	
		
		//inisialisasi scanner 
		Scanner input = new Scanner(System.in);
		
		//inisialisasi variabel string 
		String namaDepan, namaBelakang, fullName, npm; 
		
		//input 
		System.out.println("Masukan nama depan kamu : ");
		namaDepan = input.next();
		System.out.println("Masukan nama belakang kamu : ");
		namaBelakang = input.next();
		System.out.println("Masukan npm kamu :");
		npm = input.next();
		fullName = namaDepan + " " + namaBelakang; 
		
		//output full name dan npm
		System.out.println("Hallo "+namaDepan +"!");
		System.out.println("Nama : "+fullName);
		System.out.println("Npm : "+npm+"\n");
		
		
		//inisialiasai variabel integer
		int angka1, angka2, hasil; 
		
		//input 
		System.out.println("Masukan angka1 : ");
		angka1 = input.nextInt();
		System.out.println("Masukan angka2 : ");
		angka2 = input.nextInt();
		
		//operasi angka1 dan angka2
		hasil = angka1 * angka2; 
		
		//output 
		System.out.println("Hasil perkalian : "+hasil);
		
	}
}
