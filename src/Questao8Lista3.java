import java.util.Scanner;
public class Questao8Lista3 {

    public static void main(String[] args) {

        String n1, M, m, F, f;
        int n2, n3, x, resultado, QuantidadeF = 0, ContagemN2 = 0, QuantidadeM = 0, ContagemN3 = 0;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println(" Qual seria seu gênero? Digite F para Feminino e M para Masculino");
            n1 = leitor.next();

            if (n1.equalsIgnoreCase("M")) {
                System.out.println("Qual sua idade?");
                n2 = leitor.nextInt();

                ContagemN2 += n2;
                QuantidadeM++;

                float MediaM;
                MediaM = (float) ContagemN2 / QuantidadeM;
                System.out.printf("%d anos a média de idade de %d Homens", MediaM, QuantidadeM);

            } else if (n1.equalsIgnoreCase("F")) {
                System.out.println("Qual sua idade?");
                n3 = leitor.nextInt();

                ContagemN3 += n3;
                QuantidadeF++;

                float MediaF;
                MediaF = (float) ContagemN3 / QuantidadeF;
                System.out.printf("%d anos a média de idade de %d Fêmeas", MediaF, QuantidadeF);
            }
        } while (n1.equalsIgnoreCase("F") || n1.equalsIgnoreCase("M"));


    }
}
