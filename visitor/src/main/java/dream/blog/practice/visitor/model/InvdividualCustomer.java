package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public class InvdividualCustomer extends Customer {
	private String cellPhone;	
	private int age;	
	private String address;	
	@Override
	public void provideService() {
		System.err.println("Provide service for individual customer!");
	}
	@Override
	public void requirementAnalysis() {
		System.err.println("Analyzing requirements for individual customer!");
	}
	@Override
	public void valueAnalysis() {
		System.err.println("Analyzing values for individual customer!");
	}
}

