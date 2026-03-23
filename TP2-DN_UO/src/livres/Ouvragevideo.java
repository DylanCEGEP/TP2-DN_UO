package livres;

import java.time.LocalDate;

public class Ouvragevideo extends Ouvrage{
    private double taille;
    private int duree;

    public Ouvragevideo(String titre, Auteur auteur, LocalDate date, int nombreExemplaires) {
        super(titre,auteur, date, nombreExemplaires);
        this.taille = taille;
        this.duree = duree;
    }

    public Ouvragevideo(String titre, Auteur auteur) {
        super(titre, auteur);
        this.taille = taille;
        this.duree = duree;
    }
}
