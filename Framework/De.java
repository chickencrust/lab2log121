package framework;

import java.util.Random;



public class De implements Comparable<De>{
    private int nbCote = 6;
    private int valeurCourrante;
    private Random r;

    public int getValeurCourrante(){
        return this.valeurCourrante;
    }
    
    
    public De(){
        this.r = new Random();
    }
    
    public De(int nbCote){
        this.nbCote = nbCote;
        this.r = new Random();
    }
    
    /**
     * @return nouvelle valeur du top du d‚
     */
    public int rouler(){
        return r.nextInt(nbCote) + 1;
    }

    @Override
    public int compareTo(De d) {
        int res = 0;
        
        if(this.valeurCourrante < d.valeurCourrante){
            res = -1;
        }
        else if(this.valeurCourrante > d.valeurCourrante)
        {
            res = 1;
        }
        
        return res;
    }
}