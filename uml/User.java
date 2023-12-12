package uml;
public class User {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	public String name;
	private Account account = new Account();

	public User(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return this.account;
	}

	@Override 
	public String toString() {
		String res = "User [id: %d, name: %s]".formatted(id, name);
		res += "\n--> " + account;
		return res;
	}
}