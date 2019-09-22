package com.pokedex;

public class PokeDexSearch {
	
	public PokeDexSearch() {
	}
		
	public String lookUpPokemon(String pokemonName) {
		ImagePath imagePath = null;
		try {
			imagePath = ImagePath.valueOf(pokemonName);
		}catch(Exception e) {
			System.out.println("No such pokemon");
			return null;
		}
		return imagePath.getImagePath();	
	}
}
