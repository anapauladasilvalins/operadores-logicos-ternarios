package operador.logico;

import java.util.Date;

public class OperadorLogico {
	public static void main(String [] args) {
	
		int x, y, z;
		
		x = 4;
		y = 7;
		z = 12;
		
		Boolean r;
		r = (x < y ^ y > z) ? true : false; // exclusivamente uma ou outra seja true
		System.out.println(r);
		
		
		
	}

}
