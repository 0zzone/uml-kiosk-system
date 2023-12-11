public class User {

	Account account;
	String name;

	public User(String name){
		this.account = new Account();
		this.name = name;
	}

}