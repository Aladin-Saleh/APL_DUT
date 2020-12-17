import java.util.*;

public class Auth
{

	private Map<String,String> authentificationMap = new HashMap<String,String>();

	public void addUser(String login,String password)
	{
		//Cette méthode permet d'ajouter un utilisateur

		//On ajoute la clé et la valeur dans la map (le login, le password)
		authentificationMap.put(login,password);
		System.out.println("Utilisateur \"" + login + "\" ajouté");


	}

	public void deleteUser(String login)
	{
		//Cette méthode permet de supprimer un untilisateur de la map
		//On supprime la clé qui est le login 

		if (authentificationMap.remove(login,authentificationMap.get(login))) 
		{
			//Si l'element à bien été supprimé (et dans ce cas il existe alors cela aura retourné true) alors on affiche le message de suppression
			System.out.println("Utilisateur \"" + login + "\" retiré");

		}
		else
		{
			//Si notre if est false dans ce cas cela veut dire l'utilisateur n'existe pas ou n'existe plus
			System.out.println("Utilisateur \"" + login + "\" non reconnu");
		}
		


	}


	public void authUser(String login,String password)
	{
		if (authentificationMap.get(login) == null) {
			System.out.println("Utilisateur \"" + login + "\" reconnu");
		}
		else
		{
			System.out.println("Utilisateur \"" + login + "\" non reconnu");
		}
	}


	public void action(String t,String login,String password)
	{
		switch (t) {
				case "add":
				this.addUser(login,password);
				break;
				case "auth":
				this.authUser(login,password);
				break;
				case "del":
				this.deleteUser(login);
				break;
				case "quit":
				System.out.println("Au revoir");
				System.exit(1);
			}	
	}



}