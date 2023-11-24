package latihanTugas;

public class MasKawin {

	
	    private double hargaPerGram;
	    private double beratPerGram;

	    public double getHarga() {
	        return hargaPerGram;
	    }

	    public void setHarga(double hargaPerGram) {
	        this.hargaPerGram = hargaPerGram;
	    }

	    public double getBerat() {
	        return beratPerGram;
	    }

	    public void setBerat(double beratPerGram) {
	        this.beratPerGram = beratPerGram;
	    }

	    public double hitungHargaEmas(double hargaPerGram, double beratPerGram){
	        this.beratPerGram = beratPerGram;
	        this.hargaPerGram = hargaPerGram;

	        return hargaPerGram * beratPerGram;
	    }

	    public static void main(String[] args) {
	        MasKawin mahar = new MasKawin();
	        mahar.setBerat(15.7);
	        mahar.setHarga(570000);
	        System.out.println("Biaya yg harus dikeluarkan adalah : Rp."+mahar.hitungHargaEmas(mahar.getBerat() , mahar.getHarga()));
	    }
	}

