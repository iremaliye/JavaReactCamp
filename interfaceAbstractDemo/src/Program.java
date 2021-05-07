import Abstract.BaseCustomerManager;
import Abstract.Customer;
import Concrete.NeroCustomerManager;

public class Program {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.save(new Customer(1, "Ýrem Aliye", "Akman", 2001,123456789));
		
	


	}

}
