package newpackage;
import java.util.Random;

public class Id_torcedor extends SocioTorcedor{
    
        public int id_torcedor() {
        Random random = new Random();
        // gerar um número aleatório de 1 a 100
        int number = random.nextInt(99)+1;
        System.out.println("Numero da identificação do torcedor: " + number);
        return number;
    }
    
}
