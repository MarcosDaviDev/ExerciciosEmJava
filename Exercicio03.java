import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatros números (A,B,C,D),separados por vírgula, para realizar o cálculo da formula (A*B-C*D");
		String input = sc.nextLine();
		String[] parts = input.split(",");
		
		if(parts.length !=4){
			System.out.println("Entrada inválida. Digite os quatros números inteiros separados por vírgula");
			sc.close();
			return;
		}
		
		try {
			A = Integer.parseInt(parts[0].trim());
			B = Integer.parseInt(parts[1].trim());
			C = Integer.parseInt(parts[2].trim());
			D = Integer.parseInt(parts[3].trim());
		}catch (NumberFormatException e) {
			 System.out.println("Erro ao converter valores. Certifique-se de que os valores fornecidos são números válidos.");
	            sc.close();
	            return;
		}
		
		diferenca = (A*B-C*D);
		System.out.println("A diferença é: " + diferenca);
		
		sc.close();
	}

}
