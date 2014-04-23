package com.gmc.engine;

public class SuperGreenEngine {
	
	private int size;
	
	public SuperGreenEngine(final int size) {
		this.size = size;
	}
	
	public int getEngineSize(){
		return this.size;
	}
	
	@Override
	public String toString() {
		return  new StringBuilder("SUPER ENGINE ").append(this.size).toString();
	}

}
