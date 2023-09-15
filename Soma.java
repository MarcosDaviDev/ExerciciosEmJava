import java.util.Scanner;


public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2 , resultado;
		
		//Entrada
		System.out.println("Digite dois n�meros inteiros, separados por v�rgulas para efetuar a soma: ");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if (parts.length != 2){
			System.out.println("Entrada inv�lida. Digite exatemente dois n�meros inteiros separados por v�rgula");
			sc.close();
			return;
		}
		
		try {
			num1 = Integer.parseInt(parts[0].trim());
			num2 = Integer.parseInt(parts[1].trim());
		} catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos s�o n�meros v�lidos.");
	            sc.close();
	            return;
		}

		//C�lculo e sa�da
		resultado = ((num1) + (num2));
		System.out.println("O resultado da soma �: " + resultado);
		
		System.exit(0);
		
	}

}
