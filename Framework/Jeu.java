package framework;

public class Jeu {

    private CollectionTableau<Joueur> cj;
    private CollectionTableau<De> cd;
    
    private IStrategie strat;

    private int nbTours;
    private int desParTour;
    private int compteTour;

    public Jeu(){
        cj = new CollectionTableau<Joueur>();
        cd = new CollectionTableau<De>();
    }

    public CollectionTableau<Joueur> calculerLeVainqueur(){
        return strat.calculerLeVainqueur(this);
    };
    public boolean calculerScoreTour(){
        return strat.calculerScoreTour(this);
    };



}