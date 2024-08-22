public class Book1b {
    // Variables
    private String title, author;
   
    // Constructeurs
    public Book1b() {
    }
  
    public Book1b(String a, String t) {
      author = a;
      title = t;
    }
  
    // Accesseurs
    public String getAuthor() {
      return author;
    }
    
    public String getTitle() {
      return title;
    }
  
    // Modificateurs
    public void setAuthor(String sA) {
      author = sA;
    }
  
    public void setTitle(String sT) {
      title = sT;
    }
  
    // Méthode pour afficher la description du livre
    public void affiche() {
      System.out.println(toString());
    }
  
    // Méthode pour obtenir une représentation sous forme de chaîne du livre
    public String toString() {
      return "Livre : " + title + " par " + author;
    }
}
  