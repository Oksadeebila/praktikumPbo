package latihanTugas;


public class Persegi {
	double sisi;
	
	public void setSisi(double sisi) {
		this.sisi = sisi;
		}
	
	public double getSisi() {
		return sisi;
	}
	
	public double hitungKeliling() {
		return this.sisi * 4;
	}
	
	public double hitungLuas() {
		return this.sisi * this.sisi;
	}
	
	
}
