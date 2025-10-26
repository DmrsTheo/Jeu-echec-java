/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Cavalier extends Piece {

    /*
     * @param La couleur du cavalier
     * Constructeur de la class "Cavalier" lui définissant une couleur.
     */
    public Cavalier(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le cavalier est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Cavalier" : Le cavalier est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement du cavalier");
    }

    /*
     * @return le symbole du cavalier
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Cavalier" : Le cavalier est une pièce qui à le symbole "C".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ? "C" : "c";
    }
}
