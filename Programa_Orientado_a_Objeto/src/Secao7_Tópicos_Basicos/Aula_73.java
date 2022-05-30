package Secao7_Tópicos_Basicos;

import java.util.Locale;
import java.util.Scanner;

import Secao7_Utilit.Aula73_CurrencyConverter;

public class Aula_73 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Aula73_CurrencyConverter.valorDolar = sc.nextDouble();
		System.out.print("How many dollars will be bougth? ");
		Aula73_CurrencyConverter.dolares = sc.nextDouble();
		
		
		System.out.println(Aula73_CurrencyConverter.resp());
		
		
		sc.close();
	}

}
