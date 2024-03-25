import java.util.Scanner;

public class AtvDaniel02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha ;
        String nomeUsuario;

        
        System.out.println("Digite seu usuario: ");
        nomeUsuario = input.nextLine();
        System.out.println("Digite sua senha: ");
        senha = input.nextLine();

        while (senha.equalsIgnoreCase(nomeUsuario)) {

    

            System.out.println("Informações inválidas.");
            System.out.println("Digite nova senha.");
            senha = input.nextLine();
        
            

        }

        System.out.println("Cadastro aprovado");



        input.close();
    
    
    
    
    }
}