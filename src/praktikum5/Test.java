package praktikum5;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int berat;
		
		Scanner nama_Input = new Scanner(System.in);
		Cat kucingSaya = new Cat();
		System.out.print("Masukan nama kucing kamu : ");
		String name = nama_Input.next();
		
		System.out.print("Masukan nama warna kucing kamu : ");
		String warna = nama_Input.next();
		System.out.print("Masukan nama berat kucing kamu : ");
		berat = nama_Input.nextInt();
		
		kucingSaya.identitas(name, warna, berat);
		System.out.println("Nama kucingku adalah "+ kucingSaya.ambilNama());
		System.out.println("Warna kucingku "+ kucingSaya.ambilWarna());
		System.out.println("Berat kucingku "+ kucingSaya.ambilBerat());
		kucingSaya.eat();
	}

}
