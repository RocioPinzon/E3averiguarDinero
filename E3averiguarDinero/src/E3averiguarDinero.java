import java.util.Scanner;

/*
 * Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. 
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que 
 * calcule e imprima la cantidad de dinero que tienen entre los tres. 
 * 
 * */
public class E3averiguarDinero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float guillermo, luis, juan, dineroTotal;
		
		
		System.out.println("Digite cuanto dinero que tiene Guillermo");
		guillermo = entrada.nextFloat();
		
		luis = guillermo/2;
		juan = (guillermo+luis)/2;
		
		dineroTotal = guillermo + luis + juan;
		System.out.println("La cantidad de dinero entre los 3 es: " + dineroTotal);
	}

}
