import java.util.Scanner;

public class AtvDaniel08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = input.nextDouble();
            soma += numero;
        }

        double media = soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}