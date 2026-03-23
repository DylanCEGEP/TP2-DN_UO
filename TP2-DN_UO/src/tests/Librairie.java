package tests;

import livres.Auteur;
import livres.Ouvrage;
import livres.Pays;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();
    private Pays p1 = new Pays("Canada");
    private Pays p2 = new Pays("États-Unis");
    private Pays p3 = new Pays("Suisse");

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", p1);
        Auteur john = new Auteur("John", "Smith", p2);
        Auteur jean = new Auteur("Jean", "Némarre", p3);
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }
        return trouves;
    }
}
