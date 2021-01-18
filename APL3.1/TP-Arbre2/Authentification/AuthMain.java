import java.util.*;

public class AuthMain
{


	public static void main(String[] args) {
		

		Auth authentification = new Auth();

		Scanner clavier = new Scanner(System.in);
		while(true)
		{
			System.out.print(">");
			String log[] = clavier.nextLine().split(" ",3);

			if (log.length == 3 && !log[0].equals("del")) {
				authentification.action(log[0],log[1],log[2]);
			}
			else if(log.length == 2 && log[0].equals("del"))
			{
				authentification.action(log[0],log[1],null);
			}
			else if(log.length == 1 && log[0].equals("quit"))
			{
				authentification.action(log[0], null, null);
			}
			else
			{
				System.out.println("Error : Nous n'avons pas compris ce que vous avez voulu faire :/");
			}

			



		}
		

	}
}