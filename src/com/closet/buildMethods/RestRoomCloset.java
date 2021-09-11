package com.closet.buildMethods;

public class RestRoomCloset extends Closet {

public RestRoomCloset(ClosetParts parts) {
				
		super(ClosetTypes.RESTROOMCLOSET,parts);
		construct(parts);
	}


	protected void construct(ClosetParts parts) {
		System.out.println("This is your Restroom Closet with " + parts);
		
	}


	
}
