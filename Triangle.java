package bin;

import java.util.ArrayList;
import ardoise.Forme;
import ardoise.*;


public class Triangle extends Forme {
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;

    public Triangle(String nomForme, PointPlan p1, PointPlan p2, PointPlan p3) {
        super(nomForme);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(p1, p2));
        segments.add(new Segment(p2, p3));
        segments.add(new Segment(p3, p1));
        return segments;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        p1.deplacer(deplacementX, deplacementY);
        p2.deplacer(deplacementX, deplacementY);
        p3.deplacer(deplacementX, deplacementY);
    }

    @Override
    public String typeForme() {
        return "T";
    }
}