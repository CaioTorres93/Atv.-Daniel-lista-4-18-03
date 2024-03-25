import java.util.Scanner;

public class AtvDaniel07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maior = Double.NEGATIVE_INFINITY; // Inicializa com o menor valor possível

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = input.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}