package java_module_01.ex01;

public class User {

	private Integer identifier;
	private String name;
	private Integer balance;


	public User(String name, Integer balance) {
		this.identifier = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = balance;
	}

	public void setBalanace(Integer balance) { this.balance = balance; }

	public Integer getId() { return this.identifier; }
	public String getName() { return this.name; }
	public Integer getBalance() { return this.balance; }

	public String showInfo() {

		String format = "User: \n   ID: %s\n   Name: %s\n   Balance: %d\n";

		return String.format(format,
							getId(),
							getName(),
							getBalance());
	}
}
