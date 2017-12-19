package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public class IndividualCustomer extends Customer {
	private String cellPhone;	
	private int age;	
	private String address;	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitIndividual(this);
	}
	public void someFunction1() {
		//個人戶自己的功能
	}
}

