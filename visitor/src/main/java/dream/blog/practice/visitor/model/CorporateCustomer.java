package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public class CorporateCustomer extends Customer{
	private String corporateId;
	private String contact;
	private String phone;
	private String companyAddress;
	@Override
	public void accept(Visitor visitor) {
		visitor.visitCorporate(this);
	}
	public void someFunction1() {
		//企業戶自己的功能
	}
}


