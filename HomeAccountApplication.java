import java.util.Scanner;
public class HomeAccountApplication
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		int dummy = 0;
		int n = -1;
		Apartment apartment = new Apartment();
		while (true)
		{
			
			System.out.print("\n\nObecnie zarejestrowanych jest " + apartment.numberOfUsers()+" użytkowników\n0. Wyjdź z programu\n1. Pokaż listę użytkowników\n2. Dodaj użytkownika\n");
			n=cin.nextInt();
			cin.skip("\n");
			switch(n)
			{
				case 0:	
					return;
				case 1:
				{
					apartment.printUsers();
					break;
					
					
				}
				case 2:
				{
					System.out.println("Podaj imię");
					String name = cin.nextLine();
					apartment.addUser(name);
					break;
				}
				case 3:
					apartment.pay((float)10.5, 1);
					break;
			}
		}
	}
}
