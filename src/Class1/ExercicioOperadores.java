package Class1;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOperadores {

	public static void main(String[] args) {
		
		
		// EXERCICIO - AULA 40~
		// OPERADORES
		// VARIAVEL WHILE = ESTRUTURA REPETITIVA. (se verdadeiro = executa || falso = pula fora)
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
				
				
		while (x != 0) {
			
			soma += x; // soma = soma + x
			x = sc.nextInt();
		}
 
		System.out.println(soma);
	
		sc.close();

	}

}
