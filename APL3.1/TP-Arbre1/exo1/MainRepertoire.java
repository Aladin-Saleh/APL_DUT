import java.io.*;  

class MainRepertoire
{
	public static void main(String args[])
	{
		Noeud n;
		if(args.length < 0)
		{
			System.out.println("Pas De path !!");
		}
		else
		{
			n = new Noeud(args[0]);
			RecurseFile(n,0);
		}
	}

	public static void RecurseFile(Noeud n,int depth)
	{
		Noeud[] folder = n.getALLsousDocier();
		Leaf[] fichier = n.getALLsousFichier();

		for(final Leaf fichierEntry : fichier)
		{
			for(int j = 0; j < depth;j++)
			{
				System.out.print("\t");
			}
			System.out.println(fichierEntry.getName());
		}
		for(int i = 0 ; i < folder.length;i++)
		{
			for(int j = 0; j < depth;j++)
			{
				System.out.print("\t");
			}
			System.out.println(folder[i].getName());
			RecurseFile(folder[i],depth+1);
		}
	}
}