package framework;

public abstract class Fabrique{
   
   public void initialiserJeu(){
       creerDes();
       creerJoueurs();
   };
   public abstract void creerDes();
   public abstract void creerJoueurs();
}