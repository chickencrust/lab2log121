package framework;

public abstract class Fabrique{
   public void initialiserJeu(){
        initialiserRegles();
        creerDes();
        creerJoueurs(); 
   }
   public abstract void initialiserRegles();
   public abstract void creerDes();
   public abstract void creerJoueurs();
}