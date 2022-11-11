package newpackage;

import java.util.Scanner;

public class Estadio extends Time {

    public int DadosEstadio() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome do Time: ");
        String Ntime = sc1.nextLine();
        Renda RN = new Renda();
        Numero_jogadores NJ = new Numero_jogadores();
        Campeonatos campeonatos = new Campeonatos() {
        };

        switch (Ntime) {
            case "Corinthias":
                System.out.println("Estádio Arena Corinthians (Corinthians)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "corinthias":
                System.out.println("Estádio Arena Corinthians (Corinthians)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Cruzeiro":
                System.out.println("Estádio Mineirão (Cruzeiro)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "cruzeiro":
                System.out.println("Estádio Mineirão (Cruzeiro)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Chapecoense":
                System.out.println("Estádio Arena condá (Chapecoense\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "chapecoense":
                System.out.println("Estádio Arena condá (Chapecoense\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Palmeiras":
                System.out.println("Estádio Allianz Parque (Palmeiras)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "palmeiras":
                System.out.println("Estádio Allianz Parque (Palmeiras)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Santos":
                System.out.println("Estádio Vila Belmiro (Santos)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "santos":
                System.out.println("Estádio Vila Belmiro (Santos)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Sao Paulo":
                System.out.println("Estádio Morumbi (São Paulo)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "sao paulo":
                System.out.println("Estádio Morumbi (São Paulo)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Internacional":
                System.out.println("Estádio Beira-Rio (Internacional)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "internacional":
                System.out.println("Estádio Beira-Rio (Internacional)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Gremio":
                System.out.println("Estádio Arena do Grêmio (Grêmio)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "gremio":
                System.out.println("Estádio Arena do Grêmio (Grêmio)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                ;
                break;
            case "Goias":
                System.out.println("Estádio Serra Dourada (Goiás)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "goias":
                System.out.println("Estádio Serra Dourada (Goiás)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "Botafogo":
                System.out.println("Estádio Nilton Santos (Botafogo)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            case "botafogo":
                System.out.println("Estádio Nilton Santos (Botafogo)\n");
                NJ.Njogador();
                RN.Renda_time();
                campeonatos.dadosCampeonatos();
                break;
            default:
                System.out.println("Time não Localizado!\n");

        }
        return 0;
    }

}
