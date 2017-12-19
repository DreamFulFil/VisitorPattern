package dream.blog.practice.visitor.model;

public class ServiceProviderVisitor implements Visitor {
	@Override
	public void visitIndividual(IndividualCustomer individualCustomer) {
		System.err.println("Provide service to:"+individualCustomer.getName());
	}

	@Override
	public void visitCorporate(CorporateCustomer corporateCustomer) {
		System.err.println("Provide service to:"+corporateCustomer.getName());
	}
}
