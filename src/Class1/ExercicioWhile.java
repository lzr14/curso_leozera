package Class1;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ESTRUTURA WHILE EXERCICIOS 1: MOSTRAR SE NUMERO É CRESCENTE OU DECRESCENTE E ENCERRAR COM X E Y IGUAIS.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	    int idade = sc.nextInt();
	    int soma = 0;
	    int sabugo = 0;
	    
	    while (idade >= 0) {
	    	soma += idade;
	    	sabugo += 1;
	    	
	    	
	    		    		    	
	    	idade = sc.nextInt();
	    }
	    
	    if (sabugo > 0) {
	    double media = (double) soma / sabugo;
	    System.out.printf ("%.2f%n",media);
	    }
	    
	    else {
	    	System.out.println("Impossivel calcular");
	    }
		
		
		
		
		sc.close();

	}

}
