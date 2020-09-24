package com.cg.omms.service;

import java.util.List;

import com.cg.omms.entity.Theater;
import com.cg.omms.exception.TheaterException;

public interface TheaterService {
	
	public  List<Theater>   listAllTheaters() throws TheaterException;
	public  Theater   findTheaterById(int theaterId) throws TheaterException ;
	public List<Theater> listAllTheaters(int movieId )throws TheaterException ;
	
	/*
	 * public Theater addTheater(Theater theater); public Theater
	 * deleteTheaterById(int theaterId);
	 */
	 
	

}
