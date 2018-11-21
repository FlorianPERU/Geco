package geco;

import java.util.Random;

public class PasswordGeneration {

    public PasswordGeneration(){

    }

    /**
     * Génère un mot de passe aléatoirement de 8 chiffres
     *
     * @return un Sring corespondant au mot de passe généré de 8 chiffres
     */
    public String getRandomPassword(){
        Random r = new Random();
        String mdp = "";
        for (int i = 0; i < 8; ++i){
            mdp += r.nextInt((9 - 0) + 1) + 0;
        }
        return mdp;
    }

}
