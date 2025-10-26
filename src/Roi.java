/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Roi extends Piece {

    /*
     * @param La couleur du roi
     * Constructeur de la class "Roi" lui définissant une couleur.
     */
    public Roi(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le roi est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Roi" : Le roi est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement du roi");
    }

    /*
     * @return le symbole du roi
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Roi" : Le roi est une pièce qui à le symbole "R".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ?  "R" : "r";
    }
}
