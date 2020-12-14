import java.io.*; 
import java.util.*;

class Leaf
{
	private File file;

	public Leaf(File f)
	{
		this.file = f;
	}

	public File getFile()
	{
		return this.file;
	}

	public String getName()
	{
		return this.file.getName();
	}
}