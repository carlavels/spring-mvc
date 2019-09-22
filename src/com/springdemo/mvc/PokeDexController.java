package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pokedex.PokeDexSearch;

@Controller
public class PokeDexController {
	
	@RequestMapping("/searchPokemon")
	public String showSearchForm() {
		return "pokedex-search-form";
	}
	
	@RequestMapping("/showPokemon")
	public String showPokemonView(@RequestParam("pokemonName") String pokemonName, Model model) {
		// Using @RequestParam instead of HTTPServletRequest to get input from form
		
		//Instantiate PokeDex search class
		PokeDexSearch pokeDexSearch = new PokeDexSearch();
		
		//Get the user input pokemon name from request
		pokemonName = pokemonName.toUpperCase();
		
		//Pass input pokemon name to PokeDex, return the image path
		final String pokemonImagePath = pokeDexSearch.lookUpPokemon(pokemonName);
		
		if(pokemonImagePath != null) {
			//Add data to model
			model.addAttribute("pokemonImage", pokemonImagePath);
		}
		else {
			model.addAttribute("pokemonImage", "pokemon-not-found.jpg");		
		}
		
		model.addAttribute("pokemonName", pokemonName);				
		
		//Return the jsp view file
		return "pokedex-search-view";
	}
}
