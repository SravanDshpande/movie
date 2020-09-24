package com.cg.omms.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.omms.entity.Theater;
@Repository
public interface TheaterDao extends JpaRepository<Theater, Integer>{
	@Query("from Theater t where t.movie.movieId=:mid")
	public List<Theater> findTheater(@Param("mid")int movieId);
}
