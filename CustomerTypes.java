package designPrinciples;
interface addingCustomer{
	void addNewCustomer() throws Exception;
	//violating interface segregation
	//void read();
}
interface discount{
	int getDiscount(int totalSales);
}
interface readCustomerDatabase{
	void displayCustomerDatabase();
}
class goldCustomer implements addingCustomer, discount, readCustomerDatabase{
//class goldCustomer extends Customer{
	public int getDiscount(int totalSales) {
		return totalSales-100;
	}
	public void addNewCustomer() throws Exception{
		Customer.addNewCustomer("Gold");
	}
	public void displayCustomerDatabase() {
		System.out.println(Customer.exclusiveCustomers);
	}
}

class silverCustomer implements addingCustomer, discount{
//class silverCustomer extends Customer{
	public int getDiscount(int totalSales) {
		return totalSales-50;
	}
	public void addNewCustomer() throws Exception{
		Customer.addNewCustomer("Silver");
	}
}

class newCustomer implements discount{
//class prospectiveCustomer extends Customer{
	public int getDiscount(int totalSales) {
		return totalSales-10;
	}
	
	public void addNewCustomer() throws Exception {
		throw new Exception("Not Allowed");
	}
}
