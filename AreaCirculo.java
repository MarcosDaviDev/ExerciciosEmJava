import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;
        
        // Entrada
        System.out.println("Digite o raio do c�rculo no formato <00.0> para calcular pela f�rmula A= " + pi + " * R�");
        String input = sc.nextLine();
        
        R = Double.parseDouble(input);
        
        A = pi * Math.pow(R, 2);

        // Sa�da
        System.out.printf("A �rea do c�rculo �: %.4f%n", A);
        
        
        sc.close();
    }
}
