package com.cg.omms.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="movie_tbl1")
public class Movie {

	@Id
	@GeneratedValue(generator="seq1",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="seq1",sequenceName="movie_seq1",allocationSize=1)
	@Column(name="movie_id")
	private int movieId;
	
	@Column(name="movie_name")
	private String movieName;

	@ManyToOne
	@JoinColumn(name="genre_id")	
	private Genre movieGenre;
	
	@Column(name="movie_director")
	private String movieDirector;
	
	@Column(name="movie_length")
	private String movieLength;
	
	@Column(name="language")
	private String languages;
	
	@Column(name="release_date")
	private LocalDate releaseDate;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Genre getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(Genre movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
}

