package Class1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		int idade = 31;
		String nome = "Marijuana";
		double renda = 4000.0;
		
		System.out.println (y);
		System.out.print ("Salve Rapeize!");
		System.out.println ("auevoo");
		System.out.println (x);
		System.out.printf ("%.2f%n", x);
		System.out.printf ("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf ("%.4f%n", x);
		System.out.println ("Resultado = " + x + " Metros");
		System.out.printf ("Resultado = %.2f metros%n", x);
		System.out.printf ("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		String product1 = "Nootebook dos vingadores";
	    String product2 = "PC do ben10";
	    
	    int age = 30;
		int code = 5290; 
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println (" ");
        System.out.println (" ");
        System.out.println (" ");
        
        System.out.println  ("Produtos:");
        System.out.printf ("%s tem o valor de mercado de R$%.2f dolares%n", product1, price1);
        System.out.printf ("%s: avaliado em mais de R$%.2f dolares%n", product2, price2);
        System.out.println  ("sim, eu sei q ta reais e dolares. to testano krl kkkkkkkkk");
        
        System.out.println (" ");
        System.out.println (" ");
        System.out.println (" ");
        
        System.out.print  ("Record::");
        System.out.printf ("%d anos de idade, codigo: %d e do séqso: %s%n", age, code, gender);
        
        System.out.println (" ");
        System.out.println (" ");
        System.out.println (" ");
        
        System.out.print ("Peso com oito casas decimais: ");
        System.out.printf ("%.8f", measure);
        System.out.println ("");
        System.out.print ("Arredondado:");
        System.out.printf ("%.2f", measure);
        System.out.println ("");
        System.out.print ("alasabac de US decimal o krai");
        
        
        
	}

}
