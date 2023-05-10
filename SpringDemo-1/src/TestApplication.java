import org.springframework.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beans.Employee;
public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Employee e1=(Employee)beanFactory.getBean("emp1");
		System.out.println(e1);
		
		
	}

}
