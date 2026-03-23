package livres;

public class Pays {
    private String nom;
    private String codePays;

    public Pays(String nom) {
        this.nom = nom;
        this.codePays =nom.toUpperCase() ;
        this.codePays = codePays.substring(0,3);
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
