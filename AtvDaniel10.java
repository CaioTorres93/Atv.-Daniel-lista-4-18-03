import java.util.Scanner;
public class AtvDaniel10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = input.nextInt();

        // Verifica qual é o menor número
        int menor = Math.min(numero1, numero2);
        // Verifica qual é o maior número
        int maior = Math.max(numero1, numero2);

        System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");

        // Imprime os números no intervalo
        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }
    }
}