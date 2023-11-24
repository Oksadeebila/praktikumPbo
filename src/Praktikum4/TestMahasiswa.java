package Praktikum4;
//import scanner
import java.util.Scanner;

public class TestMahasiswa {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		//bikin variabel loakl utk simpa inputan 
		String nama; 
		int npm;
		
		//membuat objek untuk memanggil variabel dan method di class mahasiswa
		Mahasiswa murid = new Mahasiswa();
		System.out.println("Masukan nama : ");
		nama = input.next();
		
		System.out.println("Masukan npm : ");
		npm = input.nextInt();
		
		murid.setNama(nama);
		murid.setNpm(npm);
		
		
		
		
		System.out.println("Nama Mahasiswa : "+ murid.nama
				+ "\nNpm Mahasiswa : "+ murid.npm);
		
	}
}
