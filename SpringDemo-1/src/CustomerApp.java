import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
//		Address address=new Address("Arora towers","C352","NewYork");
//		Customer customer=new Customer(101,"John Doe",address);
//		System.out.println(customer);
		
		Customer c=(Customer)applicationContext.getBean("cust1");
		System.out.println(c);

	}

}
