package praktikum5;

//abstract berguna untuk menambahkan fungsi kossong
public abstract class Hewan {
	
	protected static String name;
	
	//function kosong yang isinya bisa diisi nanti gitu, abstarct biar dia kosong 
	protected abstract void eat();
}

class Cat extends Hewan {
	String warna;
	int berat;
	//funngsi untuk ngasi identitas kucing 
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	
	public void eat() {
		System.out.println(Cat.name+" Makan Whiskas bewarna "+warna + " dan beratnya "+berat+ " gram");
		
	}
	String ambilNama() {
		return Cat.name;
	}
	 
	String ambilWarna() {
		return warna;
	}
	
	int ambilBerat() {
		return berat;
	}
}
