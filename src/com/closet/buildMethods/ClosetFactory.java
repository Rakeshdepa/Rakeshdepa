package com.closet.buildMethods;

public class ClosetFactory {
	
	public static Closet buildCloset(ClosetTypes closets)
	{
		Closet closet = null;
		
		if(closets.equals(ClosetTypes.BEDROOMCLOSET)) {
			closet = new BedroomCloset(ClosetParts.DOUBLEDOORS);
		}
		
		if(closets.equals(ClosetTypes.BASEMENTCLOSET)) {
			closet = new BasementRoomCloset(ClosetParts.DRYWALL_SCREWS);
		}
		
		if(closets.equals(ClosetTypes.RESTROOMCLOSET)) {
			closet = new RestRoomCloset(ClosetParts.SHIMS);
		}
		
		if(closets.equals(ClosetTypes.LAUNDRYROOMCLOSET)) {
			closet = new LaundryRoomCloset(ClosetParts.SINGLEDOOR);
		}
		
		
		return closet;
	}

}
