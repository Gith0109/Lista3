import java.util.Scanner;

public class Questao2Lista3 {

    public static void main(String[] args) {

        int n1, n2, soma = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();

        if (n1 < n2) {
            System.out.printf("Os números divisiveis por 5 entre %d e %d são:\n ", n1, n2);
            for (int x = n1; x <= n2; x++) {
                if (x % 5 == 0) {
                    System.out.println(x);
                    soma += x;
                }
            }
            System.out.println("A soma dos números encontrados é\n" + soma);
        } else{
            System.out.println("Valores errado, tente novamente");

        }
    }
}
