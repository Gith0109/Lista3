import java.util.Scanner;

public class Questao1Lisat3 {

        public static void main(String[] args) {

            int NP = 0, NI = 0, NPSOMA = 0, NISOMA = 0, ler;

            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite um valor inteiro e positivo: ");
            ler = leitor.nextInt();

            for (int x = 1; x <= ler ; x++){
                if (x % 2 == 0) {
                    NP++;
                    NPSOMA += x;

                } else {
                    NI++;
                    NISOMA += x;
                }

            }
            System.out.println("A quantidade de números pares entre 1 e o valor digitado é:\n " + NP );
            System.out.println("A soma de todos os números pares entre 1 e o valor digitado é:\n "+ NPSOMA );
            System.out.println("A quantidade de números ímpar entre 1 e o valor digitado é:\n "+ NI );
            System.out.println("A soma de todos os números ímpar entre 1 e o valor digitado é:\n "+ NISOMA );
        }

    }

