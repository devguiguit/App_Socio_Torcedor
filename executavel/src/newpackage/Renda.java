package newpackage;

import java.util.Random;

public class Renda extends Time {

    public int Renda_time() {
        
        Random random = new Random();
        // gerar um número aleatório de 10000000 a100000000
        int number = random.nextInt(100000000 - 10000000);
        System.out.println("Valor em caixa: " + number + "\n");
        return number;
    }
}
