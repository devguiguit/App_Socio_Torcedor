package newpackage;

import java.util.Random;

public class Copa_do_Brasil extends Campeonatos {

    public int id_Copa_Brasil() {
        Random random = new Random();
        // gerar um número aleatório de 1 a 4
        int number = random.nextInt(3) + 1;
        System.out.println("O time ficou em: " + number + " ,na Copa do Brasil");

        switch (number) {
            case 1:
                System.out.println("Premiação Copa do Brasil Primeiro lugar: 60 milhões\n");
                break;
            case 2:
                System.out.println("Premiação Copa do Brasil Segundo lugar: 25 milhões\n");
                break;
            case 3:
                System.out.println("Premiação Copa do Brasil Terceiro lugar: 8 milhões\n");
                break;
            case 4:
                System.out.println("Premiação Copa do Brasil Quarto lugar: 4 milhões\n");
                break;

            default:
                System.out.println("ERRO404");
        }
        return 0;
    }
}
