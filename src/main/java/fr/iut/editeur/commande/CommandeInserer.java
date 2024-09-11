package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : inserer;debut;chaine");
            return;
        }
        String texte;
        if (parameters.length == 2) texte = "";
        else texte = parameters[2];
        this.document.inserer(Integer.parseInt(parameters[1]), texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Permet d'insérer un texte à l'indice donné";
    }
}
