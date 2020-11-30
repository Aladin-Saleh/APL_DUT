import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Fusion<E> implements Queue<E> {

   private Maillon<E> debutFiles = null;
   private Maillon<E> finFiles = null;

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if(debutFiles == null && finFiles == null)
        {
            System.out.println("C'est vide");
            return true;
        }
        System.out.println("N'est pas vide");
        return false;
    }
 
    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        Maillon<E> monMaillon = this.debutFiles;
		E result = this.debutFiles != null ? this.debutFiles.getElement() : null;

		if(monMaillon.hasSuivant())
		{
            monMaillon = monMaillon.getSuivant();
            return true;
        }
        else
        {
            return false;
        }

        if( monMaillon == this.debutFiles)
        {
            this.debutFiles = null;
        }
        else
        {
            this.debutFiles = monMaillon;
        }
        

		if(this.debutFiles != null)
		{
			this.debutFiles.setSuivant(null);
		}


        return true;
    }
  


    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        Maillon<E> monMaillon = new Maillon(debutFiles,e);
        if(isEmpty())
        {
            System.out.println("La file est vide");
            debutFiles = monMaillon;
            finFiles = monMaillon;
        }
        else
        {
            System.out.println("Ajout de l'élément" + e);
            finFiles.setSuivant(monMaillon);
        }


        return true;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub


        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub

    }

    @Override
    public boolean offer(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }




   

}
