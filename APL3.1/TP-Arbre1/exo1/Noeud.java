import java.io.*; 
import java.util.*;

class Noeud
{
	private File folder;
	private Noeud[] docier;
	private Leaf[] fichier;
	private int countDocier = 0;
	private int countFichier = 0;

	public Noeud(String path)
	{
		try 
		{  
            this.folder = new File(path);  
			File[] sousFichier = this.folder.listFiles();
			for (final File fileEntry : sousFichier) 
			{
				if (fileEntry.isDirectory()) 
				{
					countDocier++;
				} 
				else
				{
					countFichier++;
				}
			}	
			this.docier = new Noeud[countDocier];
			this.fichier = new Leaf[countFichier];
			countDocier = 0;
			countFichier = 0;
			for (final File fileEntry : sousFichier) 
			{			
				if (fileEntry.isDirectory()) 
				{
					docier[countDocier++] = new Noeud(fileEntry.getPath()); 
				} 
				else
				{
					fichier[countFichier++] = new Leaf(fileEntry);
				}
			}				
        } 
		catch (Exception e) 
		{  
            e.printStackTrace();  
        }  
	}

	public Leaf[] getALLsousFichier()
	{
		return this.fichier;
	}

	public Noeud[] getALLsousDocier()
	{
		return this.docier;
	}

	public File getFolder()
	{
		return this.folder;
	}

	public String getName()
	{
		return this.folder.getName();
	}
}