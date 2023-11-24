package Praktikum4;

public class Tabungan {
	//inisialisasi variabel saldo 
	public int saldo;
	
	//untuk nampung saldonya baerapa 
	public Tabungan(int initSaldo) {
		saldo = initSaldo;
	}
	
	//hitung sisa saldonya 
	//void digunakan untuk yang ada perhitungannya 
	public boolean AmbilUang(int jumlah) {
		if(saldo - jumlah < 0 ) {
			return false;
		} else {
			saldo = saldo - jumlah;
			return true;
		}
		
	}
	 
	public int simpanUang(int jumlah) {
		return saldo = saldo + jumlah; 
	}
	
	public int getSaldo() {
		return saldo;
	}
}
