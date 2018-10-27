class User
{
private:
	String name_;
	int moneyPaidGr_;

public:
	User(String name)
	{
		name_ = name;
		moneyPaidGr_ = 0;
	}
	public void addMoney(float amount)
	{
		moneyPaidGr_ += 100*amount;
	}
	public void getMoney()
	{
		return moneyPaidGr_;
	}
}
