package Abstract;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeknikInformatika ti = new TeknikInformatika();
		ti.identitasJurusan("Teknik Informatika", 4015, "Fitrah Fajar S.Kom, M.kom");
		ti.jurusan();
		
		TeknikSipil ts = new TeknikSipil();
		ts.identitasJurusan("Teknik Sipil", 4016, "Nurul Chayati, Ir., M.T.");
		ts.jurusan();
		
		TeknikElektro te = new TeknikElektro();
		te.identitasJurusan("Teknik Elektro", 4017, "Fithri Muliawati, S.T., M.Pd., M.T.");
		te.jurusan();
		
		SistemInformasi si = new SistemInformasi();
		si.identitasJurusan("Sistem Informasi ", 4018, "R. Fitria Rachmawati, S.Si., M.Kom.");
		si.jurusan();
		
		Rpb rpb = new Rpb();
		rpb.identitasJurusan("Rekayasa Pertanian dan Biosistem ", 4019, "Dr. Tika Hafzara Siregar, S.TP., M.Si,");
		rpb.jurusan();
	}

}
