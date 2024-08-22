public class Book1 {

    private String titre, auteur;

    public Book1() {
    }

    public Book1 (String a, String b) {
        auteur = a;
        titre = b;
    }

    public String getAuteur(){
        return auteur;
    }

    public String getTitre(){
        return titre;
    }

    public void setAuteur(String sA){
        auteur = sA;
    }
    public void setTitre(String sT){
        titre = sT;
    }

    public void affiche(String[] args) {
        System.out.println("Le livre est ecrit par "+ auteur + " le titre est " + titre);
    }

}
