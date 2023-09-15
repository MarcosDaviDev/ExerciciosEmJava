import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatros n�meros (A,B,C,D),separados por v�rgula, onde a diferen�a ser� calculada pela m�ltiplica��o de A*B ser� subtra�do de C*D.");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if(parts.length !=4){
			System.out.println("Entrada inv�lida. Digite exatemente dois n�meros inteiros separados por v�rgula");
			sc.close();
			return;
		}
		
		try {
			A = Integer.parseInt(parts[0].trim());
			B = Integer.parseInt(parts[1].trim());
			C = Integer.parseInt(parts[2].trim());
			D = Integer.parseInt(parts[3].trim());
		}catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos s�o n�meros v�lidos.");
	            sc.close();
	            return;
		}
		
		diferenca = (A*B-C*D);
		System.out.println("A diferen�a �: " + diferenca);
		
		sc.close();
	}

}
