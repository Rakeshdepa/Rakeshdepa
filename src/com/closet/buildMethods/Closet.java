package com.closet.buildMethods;

public abstract class Closet {
	
	private ClosetTypes closets = null;
	private ClosetParts parts = null;
	
	public ClosetParts getParts() {
		return parts;
	}

	public void setParts(ClosetParts parts) {
		this.parts = parts;
	}

	public ClosetTypes getClosets() {
		return closets;
	}

	public void setClosets(ClosetTypes closets) {
		this.closets = closets;
	}

	public Closet(ClosetTypes closets, ClosetParts parts) {
		
		this.closets = closets;
		this.parts = parts;
	}
	
	//protected abstract void construct();
	
	public String toString() {
		return "This Closet is of your :" + closets + "with " + parts;
	}

}
