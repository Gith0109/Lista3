import java.util.Scanner;

public class Questao5Lista3 {

    public static void main(String[] args) {

        int n1, resultado;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite um números inteiro");
            n1 = leitor.nextInt();

            if (n1 > 0) {
                System.out.printf("A tabuada do %d até o 10, seria\n",n1);
                for (int x = 1; x <= 10; x++) {
                    resultado = n1 * x;
                    System.out.printf("\n%d * %d = %d ", n1, x, resultado);
                }
            }else {
                System.out.println("Número inválido");
            }

        }while(n1 > 10);

    }
}

