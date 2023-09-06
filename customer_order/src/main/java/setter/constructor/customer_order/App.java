package setter.constructor.customer_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("setter/constructor/customer_order/configEX.xml");
        
       //Setter Injection
       /* Customer customer=(Customer) context.getBean("cus");
        System.out.println("Name : "+customer.getName());
        System.out.println("Phone number : "+customer.getPhno());
        System.out.println("Address : "+customer.getAddress());
        
        Order order=(Order) context.getBean("ord");
        System.out.println("product id : "+order.getProductid());
        System.out.println("product name : "+order.getProductname());
        System.out.println("customer name : "+order.getCustomer().getName());
        System.out.println("customer phno : "+order.getCustomer().getPhno());
        System.out.println("customer Address : "+order.getCustomer().getAddress());*/
        
        //Constructor Injection
        Customer customer=(Customer) context.getBean("Cu");
        System.out.println("Customer details : "+customer.toString());
        
      
        Order order=(Order) context.getBean("or");
        System.out.println("Order details : "+order.toString());
        
        
        
    }

	
	}

