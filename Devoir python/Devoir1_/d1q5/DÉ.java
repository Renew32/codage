import java.util.Random;

public class DÉ {
     
   private int value;   // Numéro figurant sur le dé. 

   /**
    * Le constructeur crée un dé et le lance de sorte qu'il 
    * montre initialement une valeur aléatoire entre 1 et 6. 
   */
   public DÉ() {
      this.lancer();
   }  
   /**
    * Lancez le dé pour qu'il indique un nombre aléatoire entre 1 et 6. 
   */
   public void lancer() {
      Random rand = new Random();
      this.value = rand.nextInt(6) + 1;
   }       
   /**
    * Renvoie le nombre indiqué sur le dé. 
   */ 
   public int getValue() {
         return value;
   }
   /**
    * Définit la valeur du dé. Imprime Valeur illégale du dé
    * si la valeur n'est pas comprise entre 1 et 6. 
   */
   public void setValue( int val ) {
      if (val < 1 || val > 6){
         System.out.println("Valleur illégale du dé " + val);
      }
      else{
         this.value = val;
      }
   }
        
   
     
   //Programme principal main
   public static void main(String[] args) {
           
      DÉ dé1;  // 1er dé
      DÉ dé2;  // second dé
      int NB = 0;       
      do{
         dé1 = new DÉ();
         dé2 = new DÉ();
         NB++;
      }
      while (dé1.getValue() != dé2.getValue());
      
      /*Affiche le nombre de lancés. */
      System.out.println("Ça a pris " + NB + " lancés pour que les deux dés indiquent la même valeur: ");
      System.out.println(dé1.getValue());
      System.out.println(dé2.getValue());
      System.out.println();
         
      /* générer une exception. */
      System.out.println("Ce programme va maintenant se terminer avec un message d'erreur ");
      System.out.println("lorsqu'il essaie de fixer la valeur d'un dé à 100. ");
      DÉ dé;  // variable referant au dé.
      dé = new DÉ();  // creer l'objet
      dé.setValue(100);
   }
      
}

