package java_module_01.ex01;

public class UserIdsGenerator {
	private static UserIdsGenerator instance;
	private int lastGeneratedId;

	private UserIdsGenerator() { this.lastGeneratedId = 0; }

	public static UserIdsGenerator getInstance() {
		if (instance == null)
			instance = new UserIdsGenerator();

		return instance;
	}

	public int generateId() { return ++lastGeneratedId; }
}
