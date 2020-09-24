package com.cg.omms.entity;



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
@Table(name="theater_tbl")
public class Theater {
	@Id
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq",sequenceName="theater_seq",allocationSize=1)
	@Column(name="theater_id")
	private int theaterId;
	 @Column(name="theater_name", length=15)
	private String theaterName;
	 @Column(name="theater_city", length=15)
	private String theaterCity;
	 @Column(name="manager_name", length=15)
	private String managerName;
	 @Column(name="manager_contact" ,length=10)
	private String managerContact;
	 
	 
	 @ManyToOne
	 @JoinColumn(name="movie_Id")	
		private Movie movie;


	public int getTheaterId() {
		return theaterId;
	}


	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}


	public String getTheaterName() {
		return theaterName;
	}


	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}


	public String getTheaterCity() {
		return theaterCity;
	}


	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getManagerContact() {
		return managerContact;
	}


	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	 
	 
	
	
	
	
}