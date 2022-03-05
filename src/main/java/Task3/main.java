package Task3;

import javax.security.auth.kerberos.KerberosKey;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		while (a < 3) {
			while((a + b ) %2 == 0)
				b++; 	a++;
			System.out.println(a+" "+ b);
		}
//		for(int i = 0; i< 5; i++) {
//			int k = i * (i + 5) %10;
//			System.out.println(k);
//		}
//		int k = 0/4;
//		System.out.println(k);
	}

}
