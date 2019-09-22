package com.pokedex;

public enum ImagePath {
	
	BULBASAUR("bulbasaur.webp"),
	CHARMANDER("charmander.png"),
	SQUIRTLE("squirtle.jpeg");
	
	private final String path;
	
	ImagePath(String enumKey) {
		this.path = enumKey;
	}
	
	public String getImagePath() {
		return path;
	}
	
}
