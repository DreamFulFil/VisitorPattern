package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public class CorporateCustomer extends Customer{
	
	private String corporateId;
	
	private String contact;
	
	private String phone;
	
	private String companyAddress;
	
	@Override
	public void provideService() {
		System.err.println("Provide service for corporate customers");
	}
	
}
