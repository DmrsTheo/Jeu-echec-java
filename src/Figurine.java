public class Figurine {
    
    private final Piece piece;

    public Figurine(TypePiece type, String couleur) {
        this.piece = CreationPiece.creerPiece(type, couleur);
    }

    public Piece getPiece() {
        return this.piece;
    }

    @Override
    public String toString() {
        return piece==null ? "." : piece.toString();
    }
}
