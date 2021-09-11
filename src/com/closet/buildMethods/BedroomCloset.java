package com.closet.buildMethods;

public class BedroomCloset extends Closet {
	
	public BedroomCloset(ClosetParts parts) {
		
		super(ClosetTypes.BEDROOMCLOSET,parts);
		construct(parts);
	}

	protected void construct(ClosetParts parts) {
		System.out.println("This is your Bedroom Closet with " + parts);
		
	}
}
