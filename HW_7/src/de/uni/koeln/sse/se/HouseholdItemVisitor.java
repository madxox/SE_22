package de.uni.koeln.sse.se;

public interface HouseholdItemVisitor {

	public void visit(Glass glass);
	public void visit(Furniture furniture);
	public void visit(Electronic electronic);
	
}
