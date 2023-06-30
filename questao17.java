public class populacao {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double taxaCrescimentoA = 0.035; // 3,5% ao ano
        double taxaCrescimentoB = 0.01;  // 1% ao ano
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Quantidade de anos necessária: " + anos);
    }
}

//admito, essa eu buguei na hr de fazer e precisei de ajuda do gpt.
// eu até usei o while, mas de uma forma mais burra que não tava funcionando
