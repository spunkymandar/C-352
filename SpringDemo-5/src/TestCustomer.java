import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println(c.getCustomerName()+" , "+c.getAddress().getCity());

	}

}
