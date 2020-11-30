public class Maillon<E>
{
    private Maillon<E> precedant;
    private Maillon<E> suivant;
    private E el;

    public Maillon(Maillon<E> e,E elem)
    {
        this.precedant = e;
        this.el = elem;
    }

    public void setSuivant(Maillon<E> p)
    {
        this.suivant = p;
    }

    public void setPrecedant(Maillon<E> p)
    {
        this.precedant = p;
    }

    public boolean hasPrecedant()
    {
        return precedant != null;
    }

    public boolean hasSuivant()
    {
        return suivant != null;
    }

    public E getElement()
    {
        return this.el;
    }

    public Maillon<E> getPrecedant()
    {
        if(this.precedant != null)
        {
            return this.precedant;
        }
        else
        {
            return this;
        }
    }

    public Maillon<E> getSuivant()
    {
        if(this.suivant != null)
        {
            return this.suivant;
        }
        else
        {
            return this;
        }
    }
}

