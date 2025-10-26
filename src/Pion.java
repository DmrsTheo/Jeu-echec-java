/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Pion extends Piece {

    /*
     * @param La couleur du pion
     * Constructeur de la class "Pion" lui définissant une couleur.
     */
    public Pion(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le pion est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Pion" : Le pion est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement du pion");
    }

    /*
     * @return le symbole du pion
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Pion" : Le pion est une pièce qui à le symbole "P".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ? "P" : "p";
    }
}

