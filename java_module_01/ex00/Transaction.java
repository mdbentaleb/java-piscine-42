package java_module_01.ex00;

import java.util.UUID;

enum TransferCateg {
	debits,
	credits
}


public class Transaction {
	private String identifier;
	private User recipient;
	private User sender;
	private TransferCateg transferCategory;
	private Integer transferAmount;


	public Transaction(User recipient, User sender, TransferCateg transferCategory, Integer transferAmount) {
		this.identifier = UUID.randomUUID().toString();
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = transferCategory;
		this.transferAmount = transferAmount;
	}


	private void validateTransaction(TransferCateg transCateg, Integer transAmount) {
		if (sender.getBalance() <= 0)
			throw new IllegalArgumentException("Insufficient balance: { " + sender.getBalance() + "}");

		if (transCateg == TransferCateg.debits && transAmount >= 0)
			throw new IllegalArgumentException("Debits must be negative");

		if (transCateg == TransferCateg.credits && transAmount <= 0)
			throw new IllegalArgumentException("Credits must be positive");

		if (sender.getBalance() + transAmount < 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }
	}
}
