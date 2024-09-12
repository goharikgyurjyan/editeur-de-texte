package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {


    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : clear;int;int");
            return;
        }
        this.document.clear();
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet de clear le document, de tout effacer";
    }

}
