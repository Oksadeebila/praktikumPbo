package latihanTugas;
/**
@author
Nama		: Oksa Dwi Nabila (221106042973)
			 Putri Amandayantie ()
			 Rindu Astuti ()
Kelas 		: PBO
Deskripsi program : Program ini berisi program untuk menghitung massa jenis
**/


public class MassaJenis {
//inisialisasi attribut private
	private int sisi;
	private int massa;
	
//Setter untuk sisi dan massa 
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	
	public void setMassa(int massa) {
		this.massa = massa;
	}
	
//Getter untuk mengembalikan nilai sisi dan massa
	public int getSisi() {
		return this.sisi;
	}
	
	public int getMassa() {
		return this.massa;
	}


//method menghitung Volume 
	public double hitungVolume(int parSisi) {
		return sisi * sisi * sisi;	
	}


//Method menghitung Massa Jenis 
	public int hitungMassa(int parMassa, int volume) {
		return parMassa / volume;
	}
	
	public static void main(String[] args) {


//Objek Hitung untuk mengambil mathod diluar method main 
		MassaJenis Hitung = new MassaJenis();
		Hitung.setSisi(5);
		Hitung.setMassa(125);
		
//Menampilkan sisi dan massa	
            System.out.println("======Massa Jenis Kubus======");
		System.out.println("Sisi : "+Hitung.getSisi());
		System.out.println("Massa : "+Hitung.getMassa()+ "\n");
//Menampilkan hasil volume dan massa jenis		
		System.out.println("======Hasil Perhitungan======");
		System.out.println("Volume : "+Hitung.hitungVolume(5));
		System.out.println("Massa Jenis : "+Hitung.hitungMassa(250, 125));
	}
}
