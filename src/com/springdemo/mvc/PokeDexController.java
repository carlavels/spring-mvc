package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pokedex.PokeDexSearch;

@Controller
public class PokeDexController {
	
	@RequestMapping("/searchPokemon")
	public String showSearchForm() {
		return "pokedex-search-form";
	}
	
	@RequestMapping("/showPokemon")
	public String showPokemonView(HttpServletRequest request, Model model) {
		
		//Instantiate PokeDex search class
		PokeDexSearch pokeDexSearch = new PokeDexSearch();
		
		//Get the user input pokemon name from request
		final String pokemonName = request.getParameter("pokemonName").toUpperCase();
		
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
