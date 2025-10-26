public class CreationPiece {

    public static Piece creerPiece(TypePiece type, String couleur) {
        return switch (type) {
            case ROI -> new Roi(couleur);
            case DAME -> new Dame(couleur);
            case FOU -> new Fou(couleur);
            case CAVALIER -> new Cavalier(couleur);
            case TOUR -> new Tour(couleur);
            case PION -> new Pion(couleur);
            default -> null;
        };
    }
}
