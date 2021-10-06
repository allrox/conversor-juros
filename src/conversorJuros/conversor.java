package conversorJuros;
import java.util.Scanner;
import java.lang.Math;

public class conversor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double tx, m;

//		Menu do Usuário
		System.out.println("Escolha o número da conversão desejada: ");
		System.out.println("---------------------------------");
		System.out.println("[1] a.a. para a.m.");
		System.out.println("[2] a.m. para a.a.");
		System.out.println("[3] a.m. para a.d.");
		System.out.println("[4] a.d. para a.m.");
		System.out.println("---------------------------------");
		int opt = entrada.nextInt();
		
		
//		Entrada da Taxa de origem
		System.out.print("\nAgora informe a taxa a ser convertida: ");
		tx = Double.parseDouble(entrada.next());
		tx /= 100.0;
		m = tx;
		System.out.println("---------------------------------");

		
//		Switch case
		switch(opt) {
		case 1:
//			a.a para a.m.
			tx = Math.pow((1.0+tx), (1.0/12.0))-1.0;
			System.out.println("\nA taxa de " + m*100.0 + "% a.a. equivale a " + tx*100.0 + "% a.m.");
			break;
		
		case 2:	
//			a.m para a.a.
			tx = Math.pow((1.0+tx), (12.0))-1.0;
			System.out.println("\nA taxa de " + m*100.0 + "% a.m. equivale a " + tx*100.0 + "% a.a.");
			break;
		
		case 3:
//			a.m para a.d.
			tx = Math.pow((1.0+tx), (1.0/30.0))-1.0;
			System.out.println("\nA taxa de " + m*100.0 + "% a.m. equivale a " + tx*100.0 + "% a.d.");
			break;
			
		case 4:
//			a.d para a.m.
			tx = Math.pow((1.0+tx), 30.0)-1.0;
			System.out.println("\nA taxa de " + m*100.0 + "% a.d. equivale a " + tx*100.0 + "% a.m.");
			break;
		}
		
		entrada.close();
		
	}

}