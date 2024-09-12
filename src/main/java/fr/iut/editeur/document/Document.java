package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getTexte() {
        return contentDocument;
    }

    public void setTexte(String texte) {
        this.contentDocument = texte;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String nouvo = "";
        for (int i = debut; i <= fin; i++) {
            nouvo += Character.toUpperCase(contentDocument.charAt(i));
        }
        remplacer(debut, fin, nouvo);
    }
    public void minuscules(int debut, int fin) {
        String nouvo = "";
        for (int i = debut; i <= fin; i++) {
            nouvo += Character.toLowerCase(contentDocument.charAt(i));
        }
        remplacer(debut, fin, nouvo);
    }

    public void effacer(int i, int i1) {
        remplacer(i, i1, "");
    }

    public void clear() {remplacer(0, contentDocument.length(), "");}

    public void inserer(int debut, String ajout){
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(debut);
        contentDocument = partieGauche + ajout + partieDroite;
    }
}
