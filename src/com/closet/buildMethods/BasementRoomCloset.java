package com.closet.buildMethods;

public class BasementRoomCloset extends Closet {

public BasementRoomCloset(ClosetParts parts) {
		
		super(ClosetTypes.BASEMENTCLOSET,parts);
		construct(parts);
	}


	protected void construct(ClosetParts parts) {
		System.out.println("This is your Basement Closet with " + parts);
		
	}

	
}
