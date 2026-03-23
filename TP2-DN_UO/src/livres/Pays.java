package livres;

public class Pays {
    private String nomPays;
    private String codePays;

    public Pays(String nomPays) {
        this.nomPays = nomPays;
        this.codePays = nomPays.toUpperCase() ;
        this.codePays = codePays.substring(0,2);
    }
}
