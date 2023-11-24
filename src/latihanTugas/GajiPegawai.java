package latihanTugas;

	/*Dikumpulkan Minggu Depan
	 * Nama : 1. Rindu Astuti ()
	 * 		  2. Oksa Dwi Nabila (221106042973) 
	 * 		  3. Putri Amanda  
	 * Kelas : Reguler A 
	 * */

public class GajiPegawai {
	
	int sisi;
	int massa;
	
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	
	public void setMassa(int massa) {
		this.massa = massa;
	}
	
	public int getSisi() {
		return this.sisi;
	}
	
	public int getMassa() {
		return this.massa;
	}
	
	public double hitungVolume(int parSisi) {
		return sisi * sisi * sisi;	
	}
	
	public int hitungMassa(int parMassa, int volume) {
		return parMassa / volume;
	}
	
	public static void main(String[] args) {
		GajiPegawai Hitung = new GajiPegawai();
		Hitung.setSisi(5);
		Hitung.setMassa(125);
		
		System.out.println("======Massa Jenis Kubus======");
		System.out.println("Sisi : "+Hitung.getSisi());
		System.out.println("Massa : "+Hitung.getMassa());
		
		System.out.println("======Hasil Perhitungan======");
		System.out.println("Volume : "+Hitung.hitungVolume(5));
		System.out.println("Massa Jenis : "+Hitung.hitungMassa(250, 125));

	}

}
