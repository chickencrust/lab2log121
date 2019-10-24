package framework;

public interface IStrategie {
    public CollectionTableau<Joueur> calculerLeVainqueur(Jeu jeu);
    public boolean calculerScoreTour(Jeu jeu);
}