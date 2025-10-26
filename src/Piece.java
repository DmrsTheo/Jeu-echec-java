/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce de l'échiquier (couleur + déplacement)
 */
abstract class Piece {

    private final String couleur;

    /*
     * @param La couleur de la pièce de l'échiquier
     * Constructeur de la classe Piece
     */
    public Piece(String couleur) {
        this.couleur = couleur;
    }

    /*
     * Méthode abstraite de déplacement qui permettra une redéfinition des deplacements de chaque pièce.
     */
    public abstract void deplacement();

    /*
     * Méthode abstraite permettant une redéfinition de la méthode de conversion existante "toString()" afin d'afficher le symbole de la pièce en question.
     */
    @Override
    public abstract String toString();

    /*
     * @return La couleur de la pièce en question.
     * Méthode permettant l'obtention de la couleur de la pièce.
     */
    public String getCouleur() {
        return this.couleur;
    }
}
