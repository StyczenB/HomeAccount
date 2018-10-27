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

    public void addUser(User u) 
    {
        // TODO calling 
        listOfUsers_.add(u);
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
        System.out.println("Users:\n");
        if (listOfUsers_.size() == 0)
        {
            System.out.println("There are no users in this apartment!\n");
        }
        else
        {
            for (User u : listOfUsers_)
            {
                System.out.println("Name: " + u.getName() + " money: " + u.getMoney() + "\n");
            }
        }
    }

    void calculateDebths()
    {

    }
}