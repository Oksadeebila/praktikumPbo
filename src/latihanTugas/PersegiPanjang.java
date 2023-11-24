package latihanTugas;

public class PersegiPanjang {

	private double panjang;
	private double lebar;
	
	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	
	public void setLebar(double lebar) {
		this.lebar = lebar;
	}
	
	public double getPanjang() {
		return this.panjang;
	}
	
	public double getLebar() {
		return this.lebar;
	}
	
	public double hitungKeliling() {
		return (2 * this.panjang) + (2 * this.lebar);
	}
	
	public double hitungLuas( ) {
		return this.panjang * this.lebar;
	}
	
}
