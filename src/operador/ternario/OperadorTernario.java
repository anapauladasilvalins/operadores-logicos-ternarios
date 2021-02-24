package operador.ternario;

public class OperadorTernario {
	
	public static void main(String [] args) {
		// Se( ) Então? senão: 
		 int n1, n2, r;
		n1 = 4;
		n2 = 8;
		r = (n1 > n2) ? 0 : 1;    // Aqui é uma condição: Lêr-se: Se(n1 > n2) então(?) 0 é true ,senão (:) 1 é false.
		// r = (n1 > n2) ? n1 + n2 : n1 - n2; 
		System.out.println("O resultado é: " + r);
		 
		
		
		
	}

}

