package livres;

import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage{
    private int duree ;

    private final int DEFAULTDUREE= 3;

    public OuvrageAudio(String titre, Auteur auteur) {
        super(titre, auteur);
        this.duree = duree;
    }

    public OuvrageAudio(String titre, Auteur auteur, LocalDate date, int nombreExemplaires) {
        super(titre, auteur, date, nombreExemplaires);
        this.duree = duree;

    }

    public enum Format {
        NUMREIQUE, ANALOGIQUE
    }
}
