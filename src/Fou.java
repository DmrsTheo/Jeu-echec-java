/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Fou extends Piece {

    /*
     * @param La couleur du fou
     * Constructeur de la class "Fou" lui définissant une couleur.
     */
    public Fou(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le fou est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Fou" : Le fou est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement du fou");
    }

    /*
     * @return le symbole du fou
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Fou" : Le fou est une pièce qui à le symbole "F".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ? "F" : "f";
    }
}
