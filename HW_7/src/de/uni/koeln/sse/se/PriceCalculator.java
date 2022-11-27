package de.uni.koeln.sse.se;

public class PriceCalculator implements HouseholdItemVisitor {

	@Override
	public void visit(Glass glass) {
		double price = 0;
		switch(glass.getTickness()) {
		case 1:
			price = 2.0*(glass.getLenght()/100.0);
			break;
		case 2:
			price = 1.20*(glass.getLenght()/100.0);
			break;
		case 3:
			price = 0.70*(glass.getLenght()/100.0);
			break;
		}
		System.out.println("Total Cost for "+glass.getName()+" is "+price+" Euros");
	}

	@Override
	public void visit(Furniture furniture) {
		double price = (furniture.getWeight()/20.0)*5.0;
		System.out.println("Total Cost for "+furniture.getName()+" is "+price+" Euros");
	}

	@Override
	public void visit(Electronic electronic) {
		double price = 0;
		if(electronic.getFragile()) {
			price = (electronic.getWeight()/10)*5.0;
		}
		else {
			price = (electronic.getWeight()/15)*5.0;
		}
		System.out.println("Total Cost for "+electronic.getName()+" is "+price+" Euros");
	}

}
