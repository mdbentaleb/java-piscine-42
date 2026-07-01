package java_module_01.ex00;


public class User {

	private Integer identifier;
	private String name;
	private Integer balance;


	public User(Integer id, String name, Integer balance) {
		this.identifier = id;
		this.name = name;
		this.balance = balance;
	}

	public Integer getId() { return this.identifier; }
	public String getName() { return this.name; }
	public Integer getBalance() { return this.balance; }

	public void setName(String name) { this.name = name; }
	public void setBalanace(Integer balance) { this.balance = balance; }
}
