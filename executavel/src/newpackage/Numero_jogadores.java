package newpackage;

import java.util.Random;

public class Numero_jogadores extends Time {

    public int Njogador() {
        Random random = new Random();
        // gerar um número aleatório de 21 a 29
        int number = random.nextInt(17 - 8) + 20;
        System.out.println("Numero de jogadores do time: " + number);
        return number;
    }
}
