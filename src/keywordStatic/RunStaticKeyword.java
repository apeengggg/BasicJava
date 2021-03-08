package keywordStatic;

public class RunStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inisiasi variable x pada class StaticKeyword
		StaticKeyword.x =4;
//		inisiasi variable y pada class StaticKeyword
		StaticKeyword.y = 5;
//		menampilkan method jumlah (x+y)
		System.out.println("Hasil Penjumlahan :" + StaticKeyword.jumlah());
	}

}
