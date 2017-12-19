package dream.blog.practice.visitor.model;

public interface Visitor {
	void visitIndividual(IndividualCustomer individualCustomer);
	void visitCorporate(CorporateCustomer corporateCustomer);
}
