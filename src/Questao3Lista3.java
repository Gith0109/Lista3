import java.util.Scanner;

public class Questao3Lista3 {

    public static void main(String[] args) {

        int n1, somadivisores = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número positivo:");
        n1 = leitor.nextInt();

        for (int x = 1; x < n1; x++) {
            if (n1 % x == 0) {
                somadivisores += x;
            }
        }
        System.out.printf("A soma dos valores divisores: %d\n", somadivisores);
        if (n1 == 0 || n1 == 1) {
            System.out.printf("Os valores %d e %d não são considerados perfeitos", 0, 1);
        } else if (n1 == somadivisores ) {
            System.out.printf("O número %d é perfeito", n1);
        } else {
            System.out.printf("O número %d não é perfeito", n1);
        }
    }
}
