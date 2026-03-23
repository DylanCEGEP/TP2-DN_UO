package livres;

import java.util.ArrayList;

public class Serie {


    private String nom;
    private ArrayList<Ouvrage> listeOuvrage;



    public Serie(String nom)
    {
        this.nom = nom;
        this.listeOuvrage = new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ouvrage> getListeOuvrage() {
        return listeOuvrage;
    }

    public void setListeOuvrage(ArrayList<Ouvrage> listeOuvrage) {
        this.listeOuvrage = listeOuvrage;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nom='" + nom + '\'' +
                ", listeOuvrage=" + listeOuvrage +
                '}';
    }
}
