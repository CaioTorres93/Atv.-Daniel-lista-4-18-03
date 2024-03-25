import java.util.Scanner;
public class AtvDaniel05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // População inicial dos países A e B
         int populacaoA = 80000;
         int populacaoB = 200000;
 
         // Taxas de crescimento anual (em decimal)
         double taxaCrescimentoA;
         double taxaCrescimentoB;

         System.out.println("Digite a taxa de crecimento A: ");
         taxaCrescimentoA = input.nextDouble();
         System.out.println("Digite a taxa de crescimento B: ");
         taxaCrescimentoB = input.nextDouble();  

 
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
 
    
