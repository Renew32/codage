/*************************Exercice 2*********************/
class Tab {
    
    public static void trier(int[] tab) {
        // Utilisation d'un simple algorithme de tri par sélection
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[minIndex]) {
                    minIndex = j;
                }
            }
            // Échange des éléments
            int temp = tab[minIndex];
            tab[minIndex] = tab[i];
            tab[i] = temp;
        }
    }
  
    public static int moyenne(int[] tab) {
        // Calcul de la moyenne
        int sum = 0;
        for (int value : tab) {
            sum += value;
        }
        return sum / tab.length;
    }
  
    public static void main(String args[]) {
  
        int tab1[] = {3, 55, 7, 1, 88, 9, 4, -10};
        int[] tab2;
        tab2 = new int[]{10, 34, 62, 56, 82, 7, 95};
        trier(tab1);
        trier(tab2);
  
        System.out.println("Les éléments de tab1 triés sont : ");
        for (int i = 0; i < tab1.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab1[i]);
        }
        System.out.println();
  
        System.out.println("Les éléments de tab2 triés sont : ");
        for (int i = 0; i < tab2.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab2[i]);
        }
        System.out.println();
  
        System.out.print("La valeur moyenne de tab1 est " + moyenne(tab1));
        System.out.println();
        int moyenneTab2 = moyenne(tab2);
        System.out.print("La valeur moyenne de tab2 est " + moyenneTab2);
        System.out.println();
    }
  }