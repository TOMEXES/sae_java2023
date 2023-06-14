# sae_java2023
sae_java
tom jedorowicz 1213800 
ronistan victor manoharan 12202748
certaines classes ont ete faites par Ronistan d'autres par   Tom nous avons travailé en nous aidant lorsque nous avions des erreurs nous avons chacun fait de notre cote a sae pour arriver au meme point : la fin de la phase 1 . pour mettre en commun .
la plus part des tests unitaires ont eux ete fait par ronistan 
tout les fichiers ont ete ajouté , nous n avons pas a transferer tout le dossier en entier .
nous n avons pas reussi les tests unitaires mais nous les avons quand meme mis dans le github 

nous avons essaye de tests unitaires mais ils ne fonctionnaient pas les voicis : package bin;

import static org.junit.jupiter.api.Assertions.;
import org.junit.jupiter.api.Test;
import ardoise.;
class TestUnitaire {

    @Test
    void testDeplacerAvecNull() {
        PointPlan point = null;
        assertThrows(NullPointerException.class, () -> {
            point.deplacer(10, 20);
        });
    }

    @Test
    void testDivisionParZero() {
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> {
            int result = a / b;
        });
    }

    @Test
    void testAccesIndiceInvalide() {
        int[] tableau = { 1, 2, 3 };
        int indice = 5;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int valeur = tableau[indice];
        });
    }


}
