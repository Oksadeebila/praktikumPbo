package Praktikum4;

//menampung beberapa function yang akan dipakai untuk class main 
public class Nasabah {
	
	//inisialisasi 
	public String namaDepan; 
	public String namaBelakang; 
	public Tabungan tabungan; 
	
	//menampung nama nasabah 
	public Nasabah(String namaDepan, String namaBelakang) {
		//kalau variabel yang mau dupake itu sama, maka dipakein this aja
		this.namaDepan = namaDepan; 
		this.namaBelakang = namaBelakang;
	}
	
	//function untuk ambil nama 
	public String getNamaDepan() {
		return namaDepan;
	}
	
	public String getNamaBelakang() {
		return namaBelakang;
	}
	
	//function untuk ambil nilai tabungan 
	public Tabungan getTabungan() {
		return tabungan;
	}
	
	public void setTabungan(Tabungan tabungan) {
		this.tabungan = tabungan;
	}
	
	
}
