package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public class InvididualCustomer extends Customer {

	private String cellPhone;
	
	private int age;
	
	private String address;
	
	@Override
	public void provideService() {
		System.err.println("Provide service for individual customer!");
	}

}
