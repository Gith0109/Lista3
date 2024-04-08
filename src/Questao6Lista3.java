public class Questao6Lista3 {

    public static void main(String[] args) {

        int n1 = 101, x = 0 ;

        while (x < 50) {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(n1); i++) {
                if (n1 % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(n1);
                x++;
            }
            n1++;
        }
    }
}
