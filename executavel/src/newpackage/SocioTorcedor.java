package newpackage;
import java.util.Scanner;

public abstract class SocioTorcedor implements Cnome{

        @Override
    public void nome(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome do Torcedor: ");
        String nome = sc1.nextLine();
        System.out.println("Nome do Torcedor: " + nome);
    }

    public void dadosTorcedor(){
        Id_torcedor sc = new Id_torcedor();
        sc.id_torcedor();
        Categoria_socio sc1 = new Categoria_socio();
        sc1.categoria();
    }
}
