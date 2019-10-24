package framework;

import java.util.Iterator;



public class Joueur implements Comparable<Joueur>{
    private int nbPoints;
    private Iterator<De> iterateur;



    public int getPoints(){
        return nbPoints;
    }

    

    public void setPoints(int nbPoints){
        this.nbPoints = nbPoints;
    }

    public void roulerDes(){
        while(iterateur.hasNext()){
            iterateur.next().rouler();
        }
    }

    public Joueur(Iterator<De> iterateurDe){
        iterateur = iterateurDe;
        nbPoints = 0;
    }

    @Override
    public int compareTo(Joueur j) {
        // TODO Auto-generated method stub
        int res = 0;
        
        if(this.nbPoints < j.nbPoints){
            res = -1;
        }
        else if(this.nbPoints > j.nbPoints)
        {
            res = 1;
        }
        
        return res;
    }

}