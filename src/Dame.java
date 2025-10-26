/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Dame extends Piece {

    /*
     * @param La couleur du reine
     * Constructeur de la class "Reine" lui définissant une couleur.
     */
    public Dame(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le reine est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Reine" : Le reine est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement de la dame");
    }

    /*
     * @return le symbole de la reine
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Reine" : La reine est une pièce qui à le symbole "Re".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ? "D" : "d";
    }
}

