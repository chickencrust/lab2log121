package framework;

public class Joueur implements Comparable<Joueur>{
    private int nbPoints;

    public int getPoints(){
        return nbPoints;
    }

    

    public void setPoints(int nbPoints){
        this.nbPoints = nbPoints;
    }

    public Joueur(){
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