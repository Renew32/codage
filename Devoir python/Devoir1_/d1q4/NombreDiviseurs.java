

public class NombreDiviseurs {
 /**
 fonction  qui prend un entier n comme paramètre d'entrée et 
 renvoie le nombre d'éléments qui sont divisibles par n. 
 Si n est négatif (n<0), elle renvoie 0 
 */
   public static int nombreDiviseurs (int n){
    int c = 0;
    if (n<0){
        System.out.println("Votre entier n'est pas positif. ");
        return 0;
    }
    for (int i = 1; i<= n; i++){
        if (n%i == 0){
                c++;
        }
    }
    return c;
    }

    public static void main(String[] args) {

       int V=100, C=17, X=-3;

        /* Affichage*/
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + V
                + " est " + nombreDiviseurs(V));
        System.out.println("Le nombre de diviseurs de " + C
                + " est " + nombreDiviseurs(C));
        System.out.println("Le nombre de diviseurs de " + X
                + " est " + nombreDiviseurs(X));

    } // end main()

} // end class NombreDiviseurss