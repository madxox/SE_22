package de.uni.koeln.sse.se;

public class HouseholdItemConcreteVisitors implements HouseholdItemVisitor{

	@Override
	public void visit(Glass glass) {
		double price = 0;
		switch(glass.getTickness()) {
		case 1:
			price = 2*glass.getLenght();
			break;
		case 2:
			price = 1.2*glass.getLenght();
			break;
		case 3:
			price = 0.7*glass.getLenght();
			break;
		}
		System.out.println("Total Cost for "+glass.getName()+" is "+price+" Euros \n");
		System.out.println(glass.getName()+": \n"+" >should be wrapped with "
				+ "Bubble wraps and packed in a box with dimension: "+glass.getHeight()+1+"x"
				+glass.getLenght()+1+"x"+glass.getWidth()+1);
	}

	@Override
	public void visit(Furniture furniture) {
		double price = furniture.getWeight()/20*5;
		System.out.println("Total Cost for "+furniture.getName()+" is "+price+" Euros \n");
		System.out.println(furniture.getName()+": \n"+" >should be covered with "
				+ "waterproof covers with area of: "+furniture.getHeight()+1+"x"
				+furniture.getLenght()+1+"x"+furniture.getWidth()+1);
	}

	@Override
	public void visit(Electronic electronic) {
		double price = 0;
		if(electronic.getFragile()) {
			price = electronic.getWeight()/10*5;
		}
		else {
			price = electronic.getWeight()/15*5;
		}
		System.out.println("Total Cost for "+electronic.getName()+" is "+price+" Euros \n");
		System.out.println(electronic.getName()+": \n"+" >should be covered with "
				+ "Polyethylene foam film and packed in a box with dimension: "+electronic.getHeight()+1+"x"
				+electronic.getLenght()+1+"x"+electronic.getWidth()+1);
	}

}
