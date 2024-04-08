import java.util.Scanner;
public class Questao7Lista3 {

    public static void main(String[] args) {

        int n1, resultado, x;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro");
            n1 = leitor.nextInt();
            System.out.println("Caso queira retornar ou parar digite 0");
            if (n1 > 0) {
                for (x = n1; x >= 1; x--) {
                    resultado = n1 * x;
                    System.out.printf("\n%d * %d = %d ", n1, x, resultado);
                }
            }

        } while (n1 == 0);
    }
}
