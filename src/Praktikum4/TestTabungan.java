package Praktikum4;
import java.util.Scanner;

public class TestTabungan {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int saldo; 
		int jumlah;
		//definisikan kelas tabungan 
		
		
		System.out.println("Saldo anda : ");
		saldo = input.nextInt();
		Tabungan atm = new Tabungan(saldo);
		
		//ambil uang 
		System.out.println("Saldo yang anda ambil : ");
		jumlah = input.nextInt();
		atm.AmbilUang(jumlah);
		
		System.out.println("Saldo anda : " + saldo);
		System.out.println("Saldo yang anda ambil : " + jumlah);
		System.out.println("Sisa saldo anda : " + atm.saldo);
	}
}
