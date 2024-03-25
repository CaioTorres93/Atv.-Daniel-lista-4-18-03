import java.util.Scanner;
public class AtvDaniel04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // População inicial dos países A e B
        int populacaoA = 80000;
        int populacaoB = 200000;

        // Taxas de crescimento anual (em decimal)
        double taxaCrescimentoA = 0.03; // 3%
        double taxaCrescimentoB = 0.015; // 1.5%

        int anos = 0; // Contador de anos

        // Calcula até que a população de A ultrapasse ou iguale a população de B
        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Após " + anos + " anos, o país A ultrapassou ou igualou a população do país B.");
        System.out.println("População do país A: " + populacaoA);
        System.out.println("População do país B: " + populacaoB);
        
        input.close();
    }
}

    