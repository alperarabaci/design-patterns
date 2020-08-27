package com.coffeepoweredcrew.visitor;

public interface Visitor {

	void visit(Programmer programmer);
	
	void visit(ProjectLead lead);
	
	void visit(VicePresident vice);
	
	void visit(Manager manager);
	
}
