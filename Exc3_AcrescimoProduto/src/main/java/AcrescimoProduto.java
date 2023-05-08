import java.util.Scanner;

public class AcrescimoProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        if (valorProduto <= 0) {
            System.out.println("Número inválido, tente novamente.");
            return;
        }

        double novoValorProduto = valorProduto * 1.1;

        System.out.println("Novo valor do produto: " + novoValorProduto);
    }
}
