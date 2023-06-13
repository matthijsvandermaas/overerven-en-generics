public class Customer {

	public Customer(String name, String lastName, CreditCard creditCard) {
		this(name, lastName, (int) (Math.random() * 100), creditCard);
	}

	public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
		this.name = name;
		this.customerNumber = customerNumber;
		this.lastName = lastName;
		this.creditCard = creditCard;
	}
//declarties
	private String name;
	private int customerNumber;
	private String lastName;
	private CreditCard creditCard;
	private String email;
	private String ContactInfo;

	public Customer(String name, String lastName, CreditCard creditCard, String email) {
		this(name, lastName, (int) (Math.random() * 100), creditCard);
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void printName() {
		System.out.println("Customer " + name);
	}

	public String getContactInfo() {
		return ContactInfo;
	}

	public void setContactInfo(String contactInfo) {
		ContactInfo = contactInfo;
	}

	// Interface voor het verzenden van berichten
	public interface ContactInfo {
		void sendMessage();
	}

	// Concrete implementatie van ContactInfo voor het verzenden van e-mails
	public class EmailContact implements ContactInfo {
		@Override
		public void sendMessage() {
			System.out.println("Email sent to " + email);
		}
	}

	// Concrete implementatie van ContactInfo voor het verzenden van sms-berichten
	public static class SmsContact implements ContactInfo {
		private final String phoneNumber;

		public SmsContact(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		@Override
		public void sendMessage() {
			System.out.println("SMS sent to " + phoneNumber);
		}
	}
}
