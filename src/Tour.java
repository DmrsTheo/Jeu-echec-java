/*
 * @author Théo De Morais
 * @date 16/02/2025
 * Classe permettant la définition d'une pièce précise de l'échiquier (couleur + déplacement) à partir de la classe parent "Piece".
 */
public class Tour extends Piece {

    /*
     * @param La couleur du tour
     * Constructeur de la class "Tour" lui définissant une couleur.
     */
    public Tour(String couleur) {
        super(couleur); //Couleur passée en paramètre du constructeur de son parent (Piece) : Le tour est une pièce de couleur.
    }
    
    /*
     * On redéfinit la méthode abstraite "deplacement()" de la classe parent "Piece" de "Tour" : Le tour est une pièce qui se déplace.
     */
    @Override 
    public void deplacement() {
        System.out.println("Deplacement du tour");
    }

    /*
     * @return le symbole de la tour
     * On redéfinit la méthode abstraite "toString()" de la classe parent "Piece" de "Tour" : La tour est une pièce qui à le symbole "T".
     */
    @Override 
    public String toString() {
        return getCouleur().equals("blanc") ?  "T" : "t";
    }
}

