/**
 * Classe représentant une calculatrice simple.
 * Fournit des méthodes pour effectuer des opérations mathématiques de base.
 *
 * @author VotreNom
 * @version 1.0
 */
public class Calculator {

    /**
     * Additionne deux nombres entiers.
     *
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La somme de a et b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Soustrait un nombre d'un autre.
     *
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La différence entre a et b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres.
     *
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return Le produit de a et b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divise un nombre par un autre.
     *
     * @param a Le dividende.
     * @param b Le diviseur (doit être différent de 0).
     * @return Le résultat de la division de a par b.
     * @throws ArithmeticException si b est égal à 0.
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro non autorisée.");
        }
        return (double) a / b;
    }
}
