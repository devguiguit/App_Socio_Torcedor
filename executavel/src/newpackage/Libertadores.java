package newpackage;

import java.util.Random;

public class Libertadores extends Campeonatos {

    public int id_Libertadores() {
        Random random = new Random();
        // gerar um número aleatório de 1 a 4
        int number = random.nextInt(3) + 1;
        System.out.println("O time ficou em: " + number + " ,na Libertadores");
        switch (number) {
            case 1:
                System.out.println("Premiação Libertadores Primeiro lugar: 93 milhões\n");
                break;
            case 2:
                System.out.println("Premiação Libertadores Segundo lugar: 36 milhões\n");
                break;
            case 3:
                System.out.println("Premiação Libertadores Terceiro lugar: 5 milhões\n");
                break;
            case 4:
                System.out.println("Premiação Libertadores Quarto lugar: 4 milhões");
                break;

            default:
                System.out.println("ERRO404\n");
        }
        return 0;
    }
}
