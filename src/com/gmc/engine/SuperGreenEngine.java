package com.gmc.engine;

/**
 * 
 * Green Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Apr 23, 2014
 *
 * @author carolus
 *
 */
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
		return new StringBuilder("SUPER ENGINE ").append(this.size).toString();
	}

}
