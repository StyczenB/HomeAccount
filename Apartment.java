import java.util.ArrayList;

class Apartment
{
    ArrayList<User> listOfUsers_; 
    String apartmentName;

    public Apartment()
    {
        apartmentName = "My sweet home";
        listOfUsers_ = new ArrayList<>();
    }

    public void addUser(String name) 
    {
        listOfUsers_.add(new User(name));
	}
	
    public int removeUser(int index)
    {
        if (listOfUsers_.size() == 0)
        {
            System.out.println("There are no users left!");
            return 1;
        }
        listOfUsers_.remove(index);
        
        return 0;
    }

    public void printUsers()
    {
		System.out.println("Users:");
		if (listOfUsers_.size() == 0)
		{
			System.out.println("\tThere are no users in this apartment!\n");
		}
		else
		{
			for (int i = 0; i < listOfUsers_.size(); ++i)
			{
				System.out.println("\t" + i + ". Name: " + listOfUsers_.get(i).getName() + ", money: " + listOfUsers_.get(i).getMoney() / 100.0 + " zl");
			}
			System.out.println();
		}
	}

	public int numberOfUsers()
	{
		return listOfUsers_.size();
	}

    void calculateDebths()
    {

    }
	int pay(float amount, int index)
	{
		if (index<listOfUsers_.size())
		{	
			listOfUsers_.get(index).addMoney(amount);
			return 0;
		}
		else return 1;
	}
}
