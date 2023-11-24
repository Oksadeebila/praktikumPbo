package Abstract;

public abstract class Teknik {
	
	protected static String nama, kaprodi;
	protected static int kode;
	
	//function kosong yang isinya bisa diisi nanti gitu, abstarct biar dia kosong 
	protected abstract void jurusan();
}

 class TeknikInformatika extends Teknik {
	
	public void identitasJurusan(String nama, int kode, String kaprodi) {
		TeknikInformatika.nama = nama;
		TeknikInformatika.kode = kode;
		TeknikInformatika.kaprodi = kaprodi;
	}

	@Override
	protected void jurusan() {
		// TODO Auto-generated method stub
		System.out.println("======" + TeknikInformatika.nama + "=====" +
		"\n Prodi : " + TeknikInformatika.nama +
		"\n Kode : " + TeknikInformatika.kode +
		"\n Kaprodi : " + TeknikInformatika.kaprodi);
	}
	

}
 
 class TeknikSipil extends Teknik {
		
		public void identitasJurusan(String nama, int kode, String kaprodi) {
			TeknikSipil.nama = nama;
			TeknikSipil.kode = kode;
			TeknikSipil.kaprodi = kaprodi;
		}

		@Override
		protected void jurusan() {
			// TODO Auto-generated method stub
			System.out.println("======" + TeknikSipil.nama + "=====" +
			"\n Prodi : " + TeknikSipil.nama +
			"\n Kode : " + TeknikSipil.kode +
			"\n Kaprodi : " + TeknikSipil.kaprodi);
		}
		

	}
 
 class TeknikMesin extends Teknik {
		
		public void identitasJurusan(String nama, int kode, String kaprodi) {
			TeknikMesin.nama = nama;
			TeknikMesin.kode = kode;
			TeknikMesin.kaprodi = kaprodi;
		}

		@Override
		protected void jurusan() {
			// TODO Auto-generated method stub
			System.out.println("======" + TeknikMesin.nama + "=====" +
			"\n Prodi : " + TeknikMesin.nama +
			"\n Kode : " + TeknikMesin.kode +
			"\n Kaprodi : " + TeknikMesin.kaprodi);
		}
		

	}
 
 class TeknikElektro extends Teknik {
		
		public void identitasJurusan(String nama, int kode, String kaprodi) {
			TeknikElektro.nama = nama;
			TeknikElektro.kode = kode;
			TeknikElektro.kaprodi = kaprodi;
		}

		@Override
		protected void jurusan() {
			// TODO Auto-generated method stub
			System.out.println("======" + TeknikElektro.nama + "=====" +
			"\n Prodi : " + TeknikElektro.nama +
			"\n Kode : " + TeknikElektro.kode +
			"\n Kaprodi : " + TeknikElektro.kaprodi);
		}
		

	}
 class SistemInformasi extends Teknik {
		
		public void identitasJurusan(String nama, int kode, String kaprodi) {
			SistemInformasi.nama = nama;
			SistemInformasi.kode = kode;
			SistemInformasi.kaprodi = kaprodi;
		}

		@Override
		protected void jurusan() {
			// TODO Auto-generated method stub
			System.out.println("======" + SistemInformasi.nama + "=====" +
			"\n Prodi : " + SistemInformasi.nama +
			"\n Kode : " + SistemInformasi.kode +
			"\n Kaprodi : " + SistemInformasi.kaprodi);
		}
		

	}
 class Rpb extends Teknik {
		
		public void identitasJurusan(String nama, int kode, String kaprodi) {
			Rpb.nama = nama;
			Rpb.kode = kode;
			Rpb.kaprodi = kaprodi;
		}

		@Override
		protected void jurusan() {
			// TODO Auto-generated method stub
			System.out.println("======" + Rpb.nama + "=====" +
			"\n Prodi : " + Rpb.nama +
			"\n Kode : " + Rpb.kode +
			"\n Kaprodi : " + Rpb.kaprodi);
		}
		

	}