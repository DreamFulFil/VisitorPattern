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
	@Override
	public void requirementAnalysis() {
		System.err.println("Analyzing requirements for corporate customer!");
	}
	@Override
	public void valueAnalysis() {
		System.err.println("Analyzing values for corporate customer!");
	}
}


