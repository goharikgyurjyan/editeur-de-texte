package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }
        String texte;
        if (parameters.length == 3) texte = "";
        else texte = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet de remplacer le texte situé aux indices donnés par le texte fourni en paramètre";
    }

}