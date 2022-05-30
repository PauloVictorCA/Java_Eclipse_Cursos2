package Secao7_Utilit;

public class Aula73_CurrencyConverter {
		
	public static final double IOF = 6.00;
	
	public static double valorDolar;
	public static double dolares;
	
	public static double valorTotal() {
		return ((dolares * IOF)/100 + dolares) * valorDolar; 
	}
	
	public static String resp() {
		return "Amout to be paid in reais = " + String.format("%.2f", valorTotal());
	}
	
}
