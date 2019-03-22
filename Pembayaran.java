
public class Pembayaran extends Data{
	private long Pinjam,Sisa;
	private float Angsuran;
	private int  BerapaKali,i;
	private final int Bunga;
	 
	
	public Pembayaran(String Nama, int Bunga, long Pinjam, int BerapaKali) {
		this.Nama = Nama;
		this.Bunga = Bunga;
		this.Pinjam = Pinjam;
		this.BerapaKali = BerapaKali;
	}
	
	public void judul() {
		System.out.println("contoh Program menghitung angsuran");
	}
	
	 public void inSisa(){
	     this.Sisa = Pinjam;
	 }
	 public void setSisa(){
	     this.Sisa =(long)((Sisa-(Pinjam/BerapaKali)));
	 }
	 public void setAngsuran(){
	 Angsuran=((Pinjam/BerapaKali)+(((float)Bunga/100)*Sisa));
	}

	 public void PrintScr(){
	System.out.println("Nama : " + Nama);
	super.judul();
	 System.out.println("\n======================"+"===========================");
	 System.out.println("| Angsuran ke- |  Besar Angsuran  |     Sisa    |");
	 System.out.println("=================================================");
	 inSisa();
	 for(i=1;i<=BerapaKali;i++){
	 setAngsuran();
	 setSisa();
	 
	 System.out.println("|      "+i+"       |   Rp. "+Angsuran+     "    | " +
	 "Rp.  "+Sisa+      " |");
	 System.out.println("==================================================");
	 
	        }
	 }

}
