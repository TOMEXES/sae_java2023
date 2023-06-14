package bin;
import ardoise.*;
import java.lang.Thread;

public class TestArdoise {
    public static void main(String[] args) throws InterruptedException {
        Ardoise ardoise = new Ardoise();
        
                
//	FORME OISEAUX DEPUIS CHAPEAU
        
        PointPlan p1 = new PointPlan(118, 13);
        PointPlan p2 = new PointPlan(123, 20);
        PointPlan p3 = new PointPlan(128, 13);
        Forme oiseau1 = new Chapeau("oiseau 1", p1, p2, p3);
        ardoise.ajouterForme(oiseau1);

        
        PointPlan p4 = new PointPlan(133, 30);
        PointPlan p5 = new PointPlan(136, 32);
        PointPlan p6 = new PointPlan(138, 30);
        Forme oiseau2 = new Chapeau("Oiseau 2", p4, p5, p6);
        ardoise.ajouterForme(oiseau2);

        
        PointPlan p7 = new PointPlan(142, 14);
        PointPlan p8 = new PointPlan(144, 17);
        PointPlan p9 = new PointPlan(146, 14);
        Forme oiseau3 = new Chapeau("Oiseau 3", p7, p8, p9); 
        ardoise.ajouterForme(oiseau3);
        
        
        
        
// FORME ETOILE DEPUIS LA CLASSE ETOILE
        
        PointPlan br1 = new PointPlan(170, 52);
        PointPlan br2 = new PointPlan(173, 45);
        PointPlan br3 = new PointPlan(177, 52);
        Forme etoile1 = new Etoile("Etoile", br1, br2, br3);
        ardoise.ajouterForme(etoile1);
        
        PointPlan br4 = new PointPlan(177, 52);
        PointPlan br5 = new PointPlan(184, 57);
        PointPlan br6 = new PointPlan(177, 60);
        Forme etoile2 = new Etoile("Etoile", br4, br5, br6);
        ardoise.ajouterForme(etoile2);
        
        PointPlan br7 = new PointPlan(177, 60);
        PointPlan br8 = new PointPlan(174, 66);
        PointPlan br9 = new PointPlan(170, 60);
        Forme etoile3 = new Etoile("Etoile", br7, br8, br9);
        ardoise.ajouterForme(etoile3);
        
        PointPlan br10 = new PointPlan(170, 60);
        PointPlan br11 = new PointPlan(163, 57);
        PointPlan br12 = new PointPlan(170, 52);
        Forme etoile4 = new Etoile("Etoile", br10, br11, br12);
        ardoise.ajouterForme(etoile4);
        
        
                
//FORME MONTAGNE DEPUIS CLASSE TRIANGLE
        PointPlan p14 = new PointPlan(3, 14);
        PointPlan p23 = new PointPlan(43, 3);
        PointPlan p31 = new PointPlan(112, 14);
        Forme montagne1 = new Triangle("Montagne 1", p14, p23, p31);
        ardoise.ajouterForme(montagne1);

        PointPlan p47 = new PointPlan(152, 7);
        PointPlan p56 = new PointPlan(166, 3);
        PointPlan p64 = new PointPlan(172, 7);
        Forme montagne2 = new Triangle("Montagne 2", p47, p56, p64);
        ardoise.ajouterForme(montagne2);

        
                
        
// FORME TOUR RECTANGLE DEPUIS LA CLASSE QUADRILATERE
        PointPlan pTour1 = new PointPlan(9, 100);
        PointPlan pTour2 = new PointPlan(20, 100);
        PointPlan pTour3 = new PointPlan(20, 198);
        PointPlan pTour4 = new PointPlan(9, 198);
        Forme tour = new Quadrilatere("Tour", pTour1, pTour2, pTour3, pTour4);
        ardoise.ajouterForme(tour);
        
        
        
     // Création des formes composantes de la maison
        PointPlan toit1 = new PointPlan(80, 140);
        PointPlan toit2 = new PointPlan(130, 100);
        PointPlan toit3 = new PointPlan(180, 140);
        Forme toitMaison = new Chapeau("Toit maison", toit1, toit2, toit3);

        PointPlan corps1 = new PointPlan(80, 140);
        PointPlan corps2 = new PointPlan(180, 140);
        PointPlan corps3 = new PointPlan(180, 198);
        PointPlan corps4 = new PointPlan(80, 198);
        Forme corpsMaison = new Quadrilatere("Corps maison", corps1, corps2, corps3, corps4);

        PointPlan porte1 = new PointPlan(120, 170);
        PointPlan porte2 = new PointPlan(140, 170);
        PointPlan porte3 = new PointPlan(140, 198);
        PointPlan porte4 = new PointPlan(120, 198);
        Forme porteMaison = new Quadrilatere("Porte maison", porte1, porte2, porte3, porte4);

        // Création de la maison
        Forme maison = new Maison("Maison", toitMaison, corpsMaison, porteMaison);

        // Ajout de la maison à l'ardoise
        ardoise.ajouterForme(maison);

        ardoise.dessinerGraphique();
        
        Thread.sleep(1000);
        ardoise.deplacer("C", 10, 20);
        
    }
}
