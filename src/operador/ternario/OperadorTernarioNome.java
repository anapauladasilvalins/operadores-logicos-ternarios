package operador.ternario;

public class OperadorTernarioNome {
	public static void main(String[] args) {
		String nome1 = "Ana";
		String nome2 = "Ana";
		String nome3 = new String("Ana"); // objeto
		String res ;
		 res=(nome1 == nome3)? "Igual" : "Diferente" ;
		 //res = (nome1.equals(nome3)) ? "Igual" : "Diferente";
		System.out.println(res);
	}

}
