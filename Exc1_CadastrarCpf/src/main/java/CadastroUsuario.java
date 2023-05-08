import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int idade;
        String nome;
        
        do {
            System.out.print("Digite seu nome: ");
            nome = leia.nextLine().trim();
            
            if (nome.isEmpty()) {
                System.out.println("Nome não pode ser vazio.");
            }   
        } 
        
        while (nome.isEmpty());

        String cpf;
        
        do {
            System.out.print("Digite seu CPF (11 dígitos): ");
            cpf = leia.nextLine().trim();
            
            if (cpf.length() != 11) {
                System.out.println("CPF inválido.");
            }
        } 
        
        while (cpf.length() != 11);

        do {
            System.out.print("Digite sua idade: ");
            idade = leia.nextInt();
            
            if (idade < 0 || idade > 120) {
                System.out.println("Idade inválida.");
            } 
        } 
        
        while (idade < 0 || idade > 120);

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}
