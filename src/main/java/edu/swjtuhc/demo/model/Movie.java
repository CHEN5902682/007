package edu.swjtuhc.demo.model;

import java.util.Date;

public class Movie {
	
	private int mId;
	private String movieName;
	private Date releaseDate;
	private String Publisher;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", Publisher="
				+ Publisher + "]";
	}

	
}
