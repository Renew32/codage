/**********************Q1-Devoir2 ITI1521....*/
/**
 * TestOperation
 */
public class TestOperation {

    private static Operation[] questions; // questions pour le test

    private static int[] reponses; // r�ponses de l'utilisateur aux questions

    /**
     * Cr�e le tableau questions de 10 elements
     */
    private static void creezTest() {
        questions = new Operation[10];

        for (int i = 0; i < questions.length; i++) {

            questions[i] = new Operation();
        }

    }// end of creezTest()

    /**
     * Affiche toutes les questions du test
     * et obtient les r�ponses de l'utilisateur.
     * Compare la r�ponse de l��l�ve � la bonne r�ponse
     * (si elles sont diff�rentes, affiche la bonne r�ponse);
     * les bonnes r�ponses sont compt�es et affich�es � la fin.
     * Les r�ponses sont stock�es dans un tableau,
     * qui est cr�� dans ce sous-programme.
     *
     * et calcule et affiche une note pour le test.
     */
    private static void effectuezTest() {
        int compteur = 0;
        double pourcent;
        reponses = new int[questions.length];

        for (int i = 0; i < questions.length; i++) {

            questions[i].getRand();

            if (questions[i].getRand() == 0) {
                System.out.println(questions[i].getQuestion0());
                reponses[i] = ReadInt.getInt("Entrez votre réponse ici : ");

                if (reponses[i] != questions[i].getAddition()) {
                    System.out.println("Incorrect. La bonne reponse est : " + questions[i].getAddition());
                }
                compteur++;

            }

            if (questions[i].getRand() == 1) {
                System.out.println(questions[i].getQuestion1());
                reponses[i] = ReadInt.getInt("Entrez votre réponse ici : ");

                if (reponses[i] != questions[i].getProduct()) {
                    System.out.println("Incorrect. La bonne reponse est : " + questions[i].getProduct());
                }
                compteur++;
            }

        }

        pourcent = (compteur / 10) * 100;
        System.out.println(pourcent + " %");

    }// end of effectuezTest()

    /*
     * Programme principal main
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("SVP r�pondre aux 10 questions d'operations arithmetiques suivantes :");
        System.out.println();
        creezTest();
        effectuezTest();
    }// end of main()

} // end class OperationTest
