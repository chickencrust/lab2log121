package framework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CollectionTableau<E> implements Collection<E> {

    E[] tab;
    int compteElement = 0;


    public CollectionTableau(){
        tab = (E[])new Object[10];
    }

    @Override
    public int size() {
        return compteElement;
    }

    @Override
    public boolean isEmpty() {
        
        return compteElement == 0;
    }

    @Override
    public boolean contains(Object o) {
        
        return indexOf(o) != -1;
    }

    public int indexOf(Object o ){
        int index = -1;
        for (int i = 0; i < tab.length; i ++) {
            if(tab[i].equals(o)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new Iterateur<E>();
    }

    @Override
    public Object[] toArray() {
        
        return tab;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(E e) {
        
        if(compteElement + 1 > tab.length)
           tab = Arrays.copyOf(tab, tab.length + 10);
        tab[++compteElement] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        //On d‚cale tout les ‚l‚ments apr?s celui qu'on veut enlever vers la gauche
        if (index != -1){
            compteElement--;
            for(int i = index; i < tab.length; i++)
                tab[i] = tab[i+1];
        }

        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        tab = (E[])new Object[10];

    }

    public class Iterateur implements Iterator<E> {
        private int position = 0;


 
        public boolean hasNext() {
            if (position < compteElement)
                return true;
            else
                return false;
        }
 
        public E next() {
            if (this.hasNext())
                return tab[position++];
            else
                return null;
        }
 
        @Override
        public void remove() {
 
        }
    }

}