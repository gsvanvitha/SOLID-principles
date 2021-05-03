package designPrinciples;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer implements discount, addingCustomer{
	private static String customerType=null;
	public static ArrayList<String> exclusiveCustomers = new ArrayList<>();
	private Logs log;
	private static boolean file=true;
	public Customer(Logs i) {
		log=i;
		log.handleError("New email exception encountered");
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String type) {
		customerType = type;
	}
	public static void addNewCustomer(String customerType) throws Exception{
			exclusiveCustomers.add(customerType);
			System.out.println(exclusiveCustomers);
		}
	//violating Single Responsibilty Principle
	/*public void log() {
		//violating Single responsibility principle
//		if(file) {
//		log = new fileLogs();
//		log.handleError(exception);
//		}
//		else {
//			log = new emailLogs();
//			log.handleError(exception);
//			}
		
	}*/
	public int getDiscount(int totalPrice)
    {
			//violation Open Closed Principle
//            if (customerType == "Gold")
//            {
//                return totalPrice - 100;
//            }
//            else if(customerType == "Silver")
//            {
//                return totalPrice - 50;
//            }
		return totalPrice;
    }
	@Override
	public void addNewCustomer() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws Exception {
		addNewCustomer("notDefined");
		goldCustomer goldCustomer=new goldCustomer();
		goldCustomer.addNewCustomer();
		goldCustomer.displayCustomerDatabase();
		silverCustomer silverCustomer=new silverCustomer();
		silverCustomer.addNewCustomer();
		Logger logger = Logger.getAnonymousLogger();
		logger.log(Level.SEVERE, "an exception was thrown", "exception");
		//violation Liskov Substitution Principle
//		newCustomer c=new newCustomer();
//		c.addNewCustomer();
		Customer i = new Customer(new emailLogs());
	}
	
}
