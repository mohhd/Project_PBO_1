import java.util.Scanner;

public class Utama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String Nama;
		long Pinjam;
		int Berapakali;
		int Bunga;
	   
	    System.out.print("Masukan Nama Peminjam : ");
	    Nama = scan.nextLine();
	    System.out.print("Masukan Besar Pinjaman : ");
	    Pinjam = scan.nextLong();
	    System.out.print("Masukan Besar Bunga(%) : ");
	    Bunga = scan.nextInt();
	    System.out.print("Masukan Banyak Angsuran : ");
	    Berapakali = scan.nextInt();
	    Pembayaran bayar = new Pembayaran(Nama, Bunga, Pinjam, Berapakali);
	     
	    bayar.PrintScr();
	}
}
