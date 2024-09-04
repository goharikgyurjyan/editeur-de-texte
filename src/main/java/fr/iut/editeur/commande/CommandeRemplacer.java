package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;debut;fin:chaine");
            return;
        }
        String texte = parameters[2];
        this.document.remplacer(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]), texte);
        super.executer();
    }

}