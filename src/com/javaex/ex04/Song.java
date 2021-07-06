package com.javaex.ex04;

public class Song {

	private String title,artist,album,composer,track;
	private int year;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setTrack(String track) {
		this.track = track;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void ShowInfo() {
		System.out.println(artist + ", "+title+ "( " +album+", "+year+", "+track+ ", " + composer +" )" );
	}

	
}
