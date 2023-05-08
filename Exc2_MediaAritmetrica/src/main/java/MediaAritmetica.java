import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leia.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leia.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("A média aritmética dos números informados é: " + media);
    }
}
