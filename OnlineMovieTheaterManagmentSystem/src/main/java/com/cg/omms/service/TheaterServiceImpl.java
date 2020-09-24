package com.cg.omms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.omms.dao.TheaterDao;
import com.cg.omms.entity.Theater;
import com.cg.omms.exception.TheaterException;
import com.cg.omms.util.TheaterConstants;

@Service
public class TheaterServiceImpl implements TheaterService {

	@Autowired
	TheaterDao theaterDao;

	/*
	 * In post man we use the url as http://localhost:9191/viewtheater , This method
	 * will retrieve all the details of the theater in which values come from
	 * service layer
	 */
	
	@Override
	public List<Theater> listAllTheaters() throws TheaterException {
		List<Theater> list = theaterDao.findAll();
		if(list.isEmpty())
		{
			throw new TheaterException(TheaterConstants.THEATER_NOT_FOUND);
		}
		list.sort((t1,t2)->t1.getTheaterName().compareTo(t2.getTheaterName()));
		return list;

	}

	/*
	 * In post man we use the url as http://localhost:9191/viewtheaterbyid , This method
	 * we can search the details of the theater using theater Id in which values come from
	 * service layer
	 */
	@Override
	public Theater findTheaterById(int theaterId) throws TheaterException {
	

		Optional<Theater> opptheater = theaterDao.findById(theaterId);
		if (!opptheater.isPresent()) {
			throw new TheaterException(TheaterConstants.THEATER_NOT_FOUND);
		}

		return opptheater.get();
	}

	/* we can also search theater using movie id */
	
	@Override
	public List<Theater> listAllTheaters(int movieId) throws TheaterException {
		
		List<Theater> list = theaterDao.findTheater(movieId);
		if(list.isEmpty())
		{
			throw new TheaterException(TheaterConstants.THEATER_NOT_FOUND);
		}
		list.sort((t1,t2)->t1.getTheaterName().compareTo(t2.getTheaterName()));
		return list;
		
	
	}

	
	/*
	 * @Override public Theater addTheater(Theater theater) {
	 * theaterDao.saveAndFlush(theater);
	 * 
	 * return theater; }
	 * 
	 * @Override public Theater deleteTheaterById(int theaterId) { Theater the =
	 * null; if (theaterDao.existsById(theaterId)) { the =
	 * theaterDao.findById(theaterId).get(); theaterDao.deleteById(theaterId); }
	 * return the; }
	 */
	 
}
