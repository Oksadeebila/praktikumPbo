package tugasPraktikumKalkulator;
import java.util.Scanner;
public class Main extends Kalkulator {

	public static void main(String[] args) {
		//insiialisai 
		int  operasi; 
		int loop; 
		Scanner operasi_input = new Scanner(System.in);
		Scanner loop_input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		Kalkulator hitung = new Kalkulator();
		
		//dsta diri 
		System.out.println("Nama : Oksa");
		System.out.println("Kelas : Reguler A");
		System.out.println("Prodi : Teknik Informatika");
		System.out.println("================================");
		
		System.out.print("\nMasukan perulangan : ");
		loop = loop_input.nextInt();
		int x = 0;
		do {
			System.out.println("\nMasukan Perhitungan yang ingin dilakukan: "
					+ "\n 1 : pertambahan"
					+ "\n 2 : pengurangan"
					+ "\n 3 : perkalian"
					+ "\n 4 : pembagian"
					+ "\n 5 : modulo");
			System.out.print("Operasi yang akan di hitung : " );
			operasi = operasi_input.nextInt();
			hitung.perhitungan(operasi);
			System.out.println("=============================================================");
			x++;
		}while(x<=loop);

		System.out.println("========= Terima Kasih ==========");
	}

	}


