package com.closet.buildMethods;

public class ClosetFactoryBuildPattern {

	public static void main(String[] args) {
		ClosetFactory.buildCloset(ClosetTypes.BASEMENTCLOSET);
		ClosetFactory.buildCloset(ClosetTypes.RESTROOMCLOSET);
		ClosetFactory.buildCloset(ClosetTypes.BEDROOMCLOSET);
		ClosetFactory.buildCloset(ClosetTypes.LAUNDRYROOMCLOSET);
	}
}
