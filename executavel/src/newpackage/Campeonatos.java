package newpackage;

public abstract class Campeonatos extends Time {

    public void dadosCampeonatos() {
        Libertadores sc = new Libertadores();
        sc.id_Libertadores();
        Copa_do_Brasil sc1 = new Copa_do_Brasil();
        sc1.id_Copa_Brasil();
        Campeonato_Brasileiro sc2 = new Campeonato_Brasileiro();
        sc2.id_Brasileiro();
    }
}
