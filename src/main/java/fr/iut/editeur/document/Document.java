package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String nouvo = "";
        for (int i = debut; i <= fin; i++) {
            nouvo += Character.toUpperCase(texte.charAt(i));
        }
        remplacer(debut, fin, nouvo);
    }
    public void minuscules(int debut, int fin) {
        String nouvo = "";
        for (int i = debut; i <= fin; i++) {
            nouvo += Character.toLowerCase(texte.charAt(i));
        }
        remplacer(debut, fin, nouvo);
    }

    public void effacer(int i, int i1) {
        remplacer(i, i1, "");
    }

    public void clear() {remplacer(0, texte.length(), "");}

    public void inserer(int debut, String ajout){
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(debut);
        texte = partieGauche + ajout + partieDroite;
    }
}
