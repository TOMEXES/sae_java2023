package bin;

import java.util.ArrayList;
import ardoise.*;

// MAISON : TOIT + PORTE + CORPS

public class Maison extends Forme {
    private Forme toit;
    private Forme corps;
    private Forme porte;

    public Maison(String nomForme, Forme toit, Forme corps, Forme porte) {
        super(nomForme);
        this.toit = toit;
        this.corps = corps;
        this.porte = porte;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.addAll(toit.dessiner());
        segments.addAll(corps.dessiner());
        segments.addAll(porte.dessiner());
        return segments;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        toit.deplacer(deplacementX, deplacementY);
        corps.deplacer(deplacementX, deplacementY);
        porte.deplacer(deplacementX, deplacementY); 
    }

    @Override
    public String typeForme() {
        return "GF";
    }
}