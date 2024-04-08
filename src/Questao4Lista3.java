import java.util.Scanner;

public class Questao4Lista3 {

    public static void main(String[] args) {

        int n1, n2;
        Scanner leitor = new Scanner(System.in);


        do {
            System.out.println(" Digite o primeiro número: ");
            n1 = leitor.nextInt();
            System.out.println(" Digite o segundo número: ");
            n2 = leitor.nextInt();

            if (n1 < n2) {
                System.out.printf(" Os número %d e %d estão em ordem crescente!!\n", n1, n2);
            } else if (n1 > n2) {
                System.out.printf(" Os número %d e %d estão em ordem decrescente!!", n1, n2);
            } else if ( n1 == n2){
                System.out.printf(" Os número %d e %d são iguais!!", n1, n2);

            }
        } while (n1 != n2) ;
    }
}

