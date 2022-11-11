package newpackage;

import java.util.Random;

public class Categoria_socio extends SocioTorcedor{
    
        public char categoria(){
        Random random = new Random();
        char Character = (char) (random.nextInt(26) + 'A');
        System.out.println("Categoria do Socio torcedor é: " + Character);
        return Character;
    }
}
