public class Echiquier {

    private int largeur = 8;
    private int longueur = 8;
    private Figurine[][] echiquier = new Figurine[longueur][largeur];

    public Echiquier() {

        TypePiece tmp_type;
        String couleur;

        for (int i=0; i<8; i++) {

             // Couleur
            if (i == 0 || i == 1)
                couleur = "noir";
            else if (i == 6 || i == 7)
                couleur = "blanc";
            else
                couleur = null; // lignes vides

            for (int k=0; k<8; k++) {
                if (i==0 || i==7) {
                    tmp_type = switch (k) {
                        case 0, 7 -> TypePiece.TOUR;
                        case 1, 6 -> TypePiece.CAVALIER;
                        case 2, 5 -> TypePiece.FOU;
                        case 3 -> TypePiece.DAME;
                        case 4 -> TypePiece.ROI;
                        default -> TypePiece.NULL;
                    };
                }
                else if (i==1 || i==6)
                    tmp_type = TypePiece.PION;
                else 
                    tmp_type = TypePiece.NULL;
                
                this.echiquier[i][k] = new Figurine(tmp_type, couleur);
            }
        }
    }

    public int getLargeur() {
        return this.largeur;
    }

    public int getLongueur() {
        return this.longueur;
    }

    public Figurine getFigurine(int x, int y) {
        return this.echiquier[x][y];
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<8; i++) {
            for (int k=0; k<8; k++) {
                Figurine f = this.getFigurine(i, k);
                
                if (f == null) {
                    sb.append(" . ");
                }
                else {
                    sb.append(" ").append(f.toString()).append(" ");    
                }
            }
            sb.append("\n");
            
        }

        return sb.toString();
    }

}