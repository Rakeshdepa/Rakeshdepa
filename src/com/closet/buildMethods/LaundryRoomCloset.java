package com.closet.buildMethods;

public class LaundryRoomCloset extends Closet{
	
public LaundryRoomCloset(ClosetParts parts) {
		
		super(ClosetTypes.LAUNDRYROOMCLOSET,parts);
		construct(parts);
	}


	protected void construct(ClosetParts parts) {
		System.out.println("This is your Laundryroom Closet with " + parts);
		
	}

	

}
