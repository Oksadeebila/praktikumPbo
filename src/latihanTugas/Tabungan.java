package latihanTugas;
import java.util.Scanner;

public class Tabungan {
		
		private int saldo;
		
		public void tabungan(int saldo) {
			this.saldo = saldo;

		}
		
		public int ambilUang(int jumlah) {
			int hasil = this.saldo - jumlah;
			return hasil;
		}
	public static void main (String[] args) {
		
		
		Tabungan saving = new Tabungan();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan saldo Awal : ");
		int saldo = input.nextInt();
		saving.tabungan(saldo);
		
		
		System.out.print("Jumlah uang yang diambil : " );
		int ambilSaldo = input.nextInt();
		int sisaSaldo = saving.ambilUang(ambilSaldo);

		System.out.print("Saldo : "+saldo + "\n");
		System.out.print("Jumlah uang yang diambil : "+ambilSaldo+ " \n" );
		System.out.print("Saldo Anda Sekarang  : " + sisaSaldo);

		

	}
}
