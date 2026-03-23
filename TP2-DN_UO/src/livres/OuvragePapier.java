package livres;

import java.time.LocalDate;

public class OuvragePapier extends Ouvrage{

    private int nombrePages;
    private final int PAGE_DEFAUT = 100;

    public OuvragePapier(String titre, Auteur auteur){
        super(titre,auteur);
        setNombrePages(PAGE_DEFAUT);
    }

    public OuvragePapier(String titre, Auteur auteur, LocalDate date, int nombreExemplaires){
        super(titre,auteur, date, nombreExemplaires);
        setNombrePages(PAGE_DEFAUT);
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }
}
