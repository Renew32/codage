public class Somme {
    public static void main(String[] args) {
        int somme = 0;
        for (String arg : args) {
            int nombre = Integer.parseInt(arg);
            somme = nombre + somme;
        }
        System.out.println("La somme est " + somme);
    }
}
