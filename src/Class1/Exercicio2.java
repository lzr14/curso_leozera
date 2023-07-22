package Class1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		//EXERCICIO AULA 34 
		//CALCULADORA DE IMPOSTO DE RENDA - A TOP!!!

		Scanner sc = new Scanner (System.in);

	    double salario = sc.nextDouble();
	    double imposto = 0;
	    double diferenca;
	    
	    if (salario > 4500) {
	    	imposto = 1000 * 0.08 + 1500 * 0.18;
	    	diferenca = salario - 4500;
	    	imposto = imposto + diferenca * 0.28;
	    }
	    else if (salario > 3000) {
	    	imposto = 1000 * 0.08;
	    	diferenca = salario - 3000;
	    	imposto += diferenca * 0.18;
	    }
	    else if (salario > 2000) {
	    	diferenca = salario - 2000;
	    	imposto = diferenca * 0.08;
	    }
	    if (imposto > 0) {
	    	System.out.print("Imposto: R$ "+ imposto);
	    }
	    else if (imposto == 0) {
	    	System.out.println("Você ta pobre ein filho!");
	    }
	    
	    
	    sc.close();
	}
}