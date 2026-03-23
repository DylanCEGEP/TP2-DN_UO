package livres;

public class Pays {
    private String nom;
    private String codePays;

    public Pays(String nom) {
        this.nom = nom;
        this.codePays =nom.toUpperCase() ;
        this.codePays = codePays.substring(0,2);
    }
}
