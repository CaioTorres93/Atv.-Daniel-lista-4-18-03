import java.util.Scanner;

public class AtvDaniel03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        
        while (nome.length() <= 3) {
            System.out.println("Nome inválido. Deve ter mais de 3 caracteres.");
            System.out.print("Digite o nome novamente: ");
            nome = input.nextLine();
        }

        
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida. Deve estar entre 0 e 150 anos.");
            System.out.print("Digite a idade novamente: ");
            idade = input.nextInt();
        }
        System.out.print("Digite o salário: ");
        double salario = input.nextDouble();

        
        while (salario <= 0) {
            System.out.println("Salário inválido. Deve ser maior que zero.");
            System.out.print("Digite o salário novamente: ");
            salario = input.nextDouble();
        }

        
        System.out.print("Digite o sexo (f/m): ");
        char sexo = input.next().charAt(0);

        
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo inválido. Digite 'f' para feminino ou 'm' para masculino.");
            System.out.print("Digite o sexo novamente: ");
            sexo = input.next().charAt(0);

        System.out.print("Digite o estado civil (s/c/v/d): ");
        char estadoCivil = input.next().charAt(0);

        // Valida o estado civil ('s', 'c', 'v' ou 'd')
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Estado civil inválido. Digite 's', 'c', 'v' ou 'd'.");
            System.out.print("Digite o estado civil novamente: ");
            estadoCivil = input.next().charAt(0);
        }

        
        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + estadoCivil);
        
        
        input.close();
    }
}
        
    }
