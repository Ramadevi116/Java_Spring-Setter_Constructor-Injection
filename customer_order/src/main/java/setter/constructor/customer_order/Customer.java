package setter.constructor.customer_order;
import java.util.*;
public class Customer {
	private String name;
	private String phno;
	private Properties address;
	
	/*
	 Set-get Method : 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public Properties getAddress() {
		return address;
	}
	public void setAddress(Properties address) {
		this.address = address;
	}
	*/
	
	//Constructor :
	
	public Customer(String name,String phno,Properties address) {
		this.name=name;
		this.phno=phno;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phno=" + phno + ", address=" + address + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
