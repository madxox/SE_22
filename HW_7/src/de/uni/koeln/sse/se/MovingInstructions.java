package de.uni.koeln.sse.se;

public class MovingInstructions implements HouseholdItemVisitor{

	@Override
	public void visit(Glass glass) {
		System.out.println(glass.getName()+": \n"+" >should be wrapped with "
				+ "Bubble wraps and packed in a box with dimension: "+glass.getHeight()+1+"x"
				+glass.getLenght()+1+"x"+glass.getWidth()+1);
	}

	@Override
	public void visit(Furniture furniture) {
		System.out.println(furniture.getName()+": \n"+" >should be covered with "
				+ "waterproof covers with area of: "+furniture.getHeight()+1+"x"
				+furniture.getLenght()+1+"x"+furniture.getWidth()+1);
	}

	@Override
	public void visit(Electronic electronic) {
		System.out.println(electronic.getName()+": \n"+" >should be covered with "
				+ "Polyethylene foam film and packed in a box with dimension: "+electronic.getHeight()+1+"x"
				+electronic.getLenght()+1+"x"+electronic.getWidth()+1);
	}

}
