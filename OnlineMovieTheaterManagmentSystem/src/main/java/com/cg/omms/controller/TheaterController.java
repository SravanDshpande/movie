package com.cg.omms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.cg.omms.entity.Theater;
import com.cg.omms.exception.TheaterException;
import com.cg.omms.service.TheaterService;
import com.cg.omms.util.TheaterConstants;

@RestController
@CrossOrigin("*")
public class TheaterController {

	@Autowired
	TheaterService theaterService;
	
	@GetMapping(TheaterConstants.VIEW_ALL_THEATER_URL)
	public List<Theater>  listAllTheaters() throws TheaterException
	{
	  List<Theater> list = theaterService.listAllTheaters();
		return list;
	}
	
	@GetMapping(TheaterConstants.VIEW_BY_THEATER_ID)
	public  Theater  findTheaterById(@PathVariable("id") int theaterId) throws TheaterException 
	{
		Theater  theater = theaterService.findTheaterById(theaterId);
		return theater;
	}
	
	@GetMapping(TheaterConstants.VIEW_THEATER_BY_MOVIE_ID)
	public  List  findTheaterByMovieId(@PathVariable("mid") int movieId) throws TheaterException 
	{
		List<Theater> list = theaterService.listAllTheaters(movieId);
		return list;
	}
	
	/*
	 * @DeleteMapping(TheaterConstants.DElETE_THEATER) public Theater
	 * deleteTheaterById(@PathVariable("id") int theaterId) throws Exception {
	 * 
	 * Theater theater = theaterService.findTheaterById(theaterId);
	 * 
	 * 
	 * if(theater!=null) { theater = theaterService.deleteTheaterById(theaterId); }
	 * else { throw new TheaterException(TheaterConstants.THEATER_ID_NOT_FOUND); }
	 * return theater; }
	 * 
	 * @PostMapping("theater") public Theater addTheater(@RequestBody Theater
	 * theater) { Theater theater2 = theaterService.addTheater(theater);
	 * 
	 * return theater; }
	 */
}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

