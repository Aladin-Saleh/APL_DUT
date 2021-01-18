public class Noeud
{

	private String login,password;
	private Noeud gauche,droite;

	public Noeud(String log, String pswrd)
	{
		this.login = log;
		this.password = pswrd;
		this.droite = null;
		this.gauche = null;

	}


	public void add(String log, String pswrd)
    {
            if(this.login.equals(log))
            {
            //Si la valeur dans le noeud est plus petite que la nouvelle valeur on la place à droite 
                if(this.gauche != null)
                {
                 //Si le noeud de gauche n'est pas vide
                    this.gauche.add(log,pswrd);    
                }
                else
                {
                 
                    this.gauche = new Noeud(log,pswrd);
                }
            }
         
    }



}