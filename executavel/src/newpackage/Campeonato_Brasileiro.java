package newpackage;

import java.util.Random;

public class Campeonato_Brasileiro extends Campeonatos {

    public int id_Brasileiro() {
        Random random = new Random();
        // gerar um número aleatório de 1 a 20
        int number = random.nextInt(19) + 1;
        System.out.println("O time ficou em: " + number + " ,no Campeonato Brasileiro");
        switch (number) {
            case 1:
                System.out.println("Premiação Campeonato Brasileiro Primeiro lugar: 45 milhões\n");
                break;
            case 2:
                System.out.println("Premiação Campeonato Brasileiro Segundo lugar: 42 milhões\n");
                break;
            case 3:
                System.out.println("Premiação Campeonato Brasileiro Terceiro lugar: 40 milhões\n");
                break;
            case 4:
                System.out.println("Premiação Campeonato Brasileiro Quarto lugar: 38 milhões\n");
                break;
            case 5:
                System.out.println("Premiação Campeonato Brasileiro Quinto lugar: 36 milhões\n");
                break;
            case 6:
                System.out.println("Premiação Campeonato Brasileiro Sexto lugar: 33 milhões\n");
                break;
            case 7:
                System.out.println("Premiação Campeonato Brasileiro Sétimo lugar: 31 milhões\n");
                break;
            case 8:
                System.out.println("Premiação Campeonato Brasileiro Oitavo lugar: 29 milhões\n");
                break;
            case 9:
                System.out.println("Premiação Campeonato Brasileiro Nono lugar: 27 milhões\n");
                break;
            case 10:
                System.out.println("Premiação Campeonato Brasileiro Décimo lugar: 24 milhões\n");
                break;
            case 11:
                System.out.println("Premiação Campeonato Brasileiro Décimo Primeiro lugar: 19 milhões\n");
                break;
            case 12:
                System.out.println("Premiação Campeonato Brasileiro Décimo Segundo lugar: 18 milhões\n");
                break;
            case 13:
                System.out.println("Premiação Campeonato Brasileiro Décimo Terceiro lugar: 16,6 milhões\n");
                break;
            case 14:
                System.out.println("Premiação Campeonato Brasileiro Décimo Quarto lugar: 16,2 milhões\n");
                break;
            case 15:
                System.out.println("Premiação Campeonato Brasileiro Décimo Quinto lugar: 15,7 milhões\n");
                break;
            case 16:
                System.out.println("Premiação Campeonato Brasileiro Décimo Sexto lugar: 15,2 milhões\n");
                break;
            case 17:
                System.out.println("Time rebaixado do Campeonato Brasileiro!\n");
                break;
            case 18:
                System.out.println("Time rebaixado do Campeonato Brasileiro!\n");
                break;
            case 19:
                System.out.println("Time rebaixado do Campeonato Brasileiro!\n");
                break;
            case 20:
                System.out.println("Time rebaixado do Campeonato Brasileiro!\n");
                break;

            default:
                System.out.println("ERRO404\n");
        }
        return 0;
    }
}
