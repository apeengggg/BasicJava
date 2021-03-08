package percabangan;

public class Coba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inisiasi variabel a =2
		int a=2;        
//		memulai switch
		switch (a) { 
//		case 1, jika a =1
		     case 1: 
//		    	 statemen jika case 1 bernilai true / =a
		        System.out.println("Nilai a=1");break;
//		case 2 jika a =2
		     case 2:
//		    	 statemen jika case 1 false dan case 2 true / =a
		        System.out.println("Nilai a=2"); break;
//		case 3 jika a=3
		     case 3: 
//		    	 statemen jika case 1, 2 false dan case 3 true / =a
		        System.out.println("Nilai a=3");break;
//		jika case 1, 2, dan 3 false
		     default: 
//		    	 statemen jika case 1,2,3 false
		        System.out.println("Nilai a=4"); break;
		}

	}

}
