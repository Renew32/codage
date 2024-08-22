/*************************Exercice1 Question a*********************/

public class TestBook {
   public static void main(String[] args) {
    Book book1 = new Book("E.B.Koffman ", "Abstraction and Design Using Java");
    book1.affiche();
    System.out.println();
    System.out.println(book1);
  }  


private String titre, auteur;

public static affiche(String[] args) {
System.out.println("Le livre est ecrit par "+ auteur + " le titre est " + titre);
}

public book (String a, String b) {
    auteur = a;
    titre = b;
}

public String getAuteur(){
    return auteur;
}

public String getTitre(){
    return titre;
}

public void setAuteur(string sA){
    auteur = sA;
}
public void setTitre(string sT){
    titre = sT;
}
}