package latihanTugas;

public class EnergiKinetik {
	
	//inisialisai variabel 
	private double massa, kecepatan, Ekin, Ekin2, Usaha;
	
	//Setter untuk nilai massa
	public void setMassa(double massa) {
		this.massa = massa;
	}
	
	//Setter untuk nilai kecepatan
	public void setKecepatan(double kecepatan ) {
		this.kecepatan = kecepatan;
	}
	
	//Getter untuk nilai masa
	public double getMassa() {
		//0.145kg * 1000g = 145g 
		return massa * 1000;
	}
	
	//Getter kecepatan 
	public double getKecepatan() {
		return kecepatan;
	}
	
	//method Rumus atau perhitungan Energi Kinetik
	public double Ekin(double massa, double kecepatan) {
		return Ekin = 0.5 * massa * (kecepatan * kecepatan);
	}
	
	//method Rumus atau perhitungan Energi Kinetik dengan kecepatan 0
	public double Ekin2(double massa) {
		return Ekin2 = 0.5 * massa * 0;
	}
	
	//method rumus atau perhitungan Usaha 
	public double Usaha(double Ekin, double Ekin2) {
		return Usaha = Ekin - Ekin2;
	}
	
	//Method main untuk output-ing
	public static void main (String[] args) {
		
		//Membuat objek Kinetik untuk mengambil method-method diluar method main
		EnergiKinetik Kinetik = new EnergiKinetik();
		
		//Memasukan nilai massa dan kecepattan dengan mengisi param pada setter
		Kinetik.setMassa(0.145);
		Kinetik.setKecepatan(25);
		
		//output Energi Kinetik 
		System.out.println("=====Energi Kinetik (Ek)=====");
		System.out.println("Massa = "+Kinetik.getMassa()+"g");
		System.out.println("Kecepatan = "+Kinetik.getKecepatan()+"m/s^2");
		System.out.println("Energi Kinetik = 0.5mv^2 = 0.5 * 145 * 25^2 = "+Kinetik.Ekin(0.145, 25)+"\n");
		
		//Output Usaha 
		System.out.println("=====Usaha (W)=====");
		System.out.println("Usaha = W = Ekin - Ekin2");
		System.out.println("Massa = "+Kinetik.getMassa()+"g");
		System.out.println("Kecepatan = "+Kinetik.getKecepatan()+"m/s^2");
		System.out.println("Energi Kinetik 2 = 0.5mv^2 = 0.5 * 145 * 0^2 = "+Kinetik.Ekin2(0.145));
		System.out.println("Usaha(W) = Ekin - Ekin2 =  "+Kinetik.Ekin(0.145, 25)+" - "+ Kinetik.Ekin2(0.145) +" = "+Kinetik.Usaha(45.3125,0));
		
	}
	
	
	
	
	
}
