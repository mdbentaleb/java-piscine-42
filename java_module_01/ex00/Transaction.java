package java_module_01.ex00;

import java.util.UUID;


public class Transaction {

	public enum TransferCateg {
		debits,
		credits
	}

	private String identifier;
	private User recipient;
	private User sender;
	private TransferCateg transferCategory;
	private Integer amount;


	public Transaction(User sender, User recipient, Integer amount) {
		this.identifier = UUID.randomUUID().toString();
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = amount < 0 ? TransferCateg.debits : TransferCateg.credits;
		this.amount = amount;

		sender.setBalanace(sender.getBalance() - amount);
		recipient.setBalanace(recipient.getBalance() + amount);
	}

	public String getIdentifier() { return this.identifier; }
	public User getRecipient() { return this.recipient; }
	public User getSender() { return this.sender; }
	public TransferCateg getTransferCateg() { return this.transferCategory; }
	public Integer getAmount() { return this.amount; }

	public String showTransaction() {
		String format = "Transaction:\n   ID: %s\n   Sender: %s\n   Recepient: %s\n   Category: %s\n   Amount: %d\n";

		return String.format(format, 
							getIdentifier(),
							getSender().getName(),
							getRecipient().getName(),
							getTransferCateg(),
							getAmount());
	}
}
