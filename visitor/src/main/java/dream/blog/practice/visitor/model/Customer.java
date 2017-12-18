package dream.blog.practice.visitor.model;

import lombok.Data;

@Data
public abstract class Customer {
	
	private String id;
	
	private String name;
	
	public abstract void provideService();
	
}
