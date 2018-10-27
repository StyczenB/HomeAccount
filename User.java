class User
{
	String name_;
	int moneyPaidGr_;
	User(){}
	User(String name)
	{
		name_ = name;
		moneyPaidGr_ = 0;
	}
	public void addMoney(float amount)
	{
		moneyPaidGr_ += 100*amount;
	}
	public int getMoney()
	{
		return moneyPaidGr_;
	}
	public String getName()
	{
		return name;
	}
}
