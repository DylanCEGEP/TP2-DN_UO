package tests;

import java.time.LocalDate;
import java.util.List;

import livres.Ouvrage;
import livres.Auteur;
import livres.Serie;
import livres.Pays;

/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
        test.testPays();
        test.Testseries();
    }

    public void Testseries(){
        Serie s1 = new Serie("Family guys");
        Pays p1 = new Pays("Canada");
        Pays p2 = new Pays("Etats-unis");
        Auteur a1 = new Auteur("Jean", "Jean",p1);
        Auteur a2 = new Auteur("Jack", "leduc", p2);
        Ouvrage o1 = new Ouvrage("Jean", a1, Ouvrage.Format.VIDEO );
        Ouvrage o2 = new Ouvrage("Labelle", a2, Ouvrage.Format.AUDIO );
        System.out.println("---------Test series-----------------");


        s1.getListeOuvrage().add(o1);
        System.out.println(s1);

        s1.getListeOuvrage().remove(o1);
        System.out.println(s1);

    }

    public void testPays() {
        Pays p1 = new Pays("Canada");
        Auteur a1 = new Auteur("Tremblay","Michel", p1);
        System.out.println(a1);
        System.out.println(p1.getCodePays());
    }

    public void testOuvrages() {
        //Deux auteurs deja prets pour les tests...
        Pays p1 = new Pays("Etats-Unis");
        Pays p2 = new Pays("Canada");
        Auteur albertine = new Auteur("Albertine", "Tremblay", p2);
        Auteur john = new Auteur("John", "Smith", p1);

        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        Ouvrage livreA = new Ouvrage("Titre assez long", john);
        System.out.println(livreA);
        Ouvrage livreB = new Ouvrage("Ti", john);
        System.out.println(livreB);
        Ouvrage livreC = new Ouvrage(null, john);
        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        Ouvrage livreA1 = new Ouvrage("Titre assez long", null);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        Ouvrage livre1 = new Ouvrage("Tout va bien", albertine);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        Ouvrage livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.AUDIO, LocalDate.now(), -10);
        System.out.println(livre2);

        livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), 20);
        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        Ouvrage livre3 = new Ouvrage("Musique du hasard", new Auteur("Paul", "Auster", p1), Ouvrage.Format.PAPIER, LocalDate.now(), 5);
        System.out.println(livre3);

        livre3.acheter(5);
        System.out.println(livre3);

        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
        System.out.println(livre3);

        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
        System.out.println(livre3);

        Ouvrage livre4 = new Ouvrage("Test", new Auteur("A", "B", p1), Ouvrage.Format.PAPIER, LocalDate.now(), 5);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        Ouvrage livre5 = new Ouvrage("Test", new Auteur("A", "B", p1), Ouvrage.Format.PAPIER, null, 5);
        Ouvrage livre6 = new Ouvrage("Test", new Auteur("A", "B", p1), Ouvrage.Format.PAPIER, LocalDate.now(), 10);
        //Un qui ne l'est pas
        Ouvrage livre7 = new Ouvrage("Test", new Auteur("Z", "B", p1), Ouvrage.Format.PAPIER, LocalDate.now(), 5);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));
    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);
        Pays p1 = new Pays("Canada");
        Pays p2 = new Pays("France");

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", p1));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", p2));
        System.out.println("Livres de Jacques: " + resultat);
    }


}

