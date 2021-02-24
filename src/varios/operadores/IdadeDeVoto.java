package varios.operadores;

import java.util.Scanner;

public class IdadeDeVoto {
	public static void main(String []args) {
		
		/* int nasc = teclado.nextInt();
		int i = 2020 - nasc; // substitui o Scanner
		*/ 
		Scanner voto = new Scanner(System.in);
		
		int idade;
		System.out.println("Informe a idade:" );
		idade = voto.nextInt();
		
		if(idade < 16) {
			System.out.println("Não Vota.");
		} else {
			if(idade >= 16 && idade <= 17  || idade > 65 ) {
					System.out.println("Voto Opcional.");
			  } else {
			System.out.println("O Voto é Obrigatório.");	
		
			  } 
		
	 }
 }
	
}

