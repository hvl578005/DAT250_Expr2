package no.hvl.dat250.jpa.basicexample;

public final class EntityCreator {
	public Person createPerson(String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}
	
	public Address createAddress(String street, int number) {
		Address address = new Address();
		address.setStreet(street);
		address.setNumber(number);
		return address;
	}
	
	public CreditCard creatCreditCard(int number, int limit, int balance) {
		CreditCard creditCard = new CreditCard();
		creditCard.setNumber(number);
		creditCard.setLimit(limit);
		creditCard.setBalance(balance);
		return creditCard;
	}
	
	public Pincode createPincode(String code, int count) {
		Pincode pincode = new Pincode();
		pincode.setPincode(code);
		pincode.setCount(count);
		return pincode;
	}
	
	public Bank createBank(String name) {
		Bank bank = new Bank();
		bank.setName(name);
		return bank;
	}
}