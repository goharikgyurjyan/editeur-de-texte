package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {


    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;int;int");
            return;
        }
        this.document.majuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet de mettre en majsucules le texte situé entre les indices donnés";
    }

}
