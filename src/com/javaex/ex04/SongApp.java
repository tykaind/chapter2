package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		Song song_1 = new Song();
		Song song_2 = new Song();
		Song song_3 = new Song();
		
		song_1.setArtist("아이유");
		song_1.setTitle("좋은날");
		song_1.setAlbum("Real");
		song_1.setYear(2010);
		song_1.setTrack("3번 track");
		song_1.setComposer("이민수 작곡");
		
		song_2.setArtist("BIGBANG");
		song_2.setTitle("거짓말");
		song_2.setAlbum("Always");
		song_2.setYear(2007);
		song_2.setTrack("2번 track");
		song_2.setComposer("G-DRADON 작곡");
		
		song_3.setArtist("버스커버스커");
		song_3.setTitle("벚꽃엔딩");
		song_3.setAlbum("버스커버스커1집");
		song_3.setYear(2012);
		song_3.setTrack("4번 track");
		song_3.setComposer("장범준 작곡");
		
		song_1.ShowInfo();
		song_2.ShowInfo();
		song_3.ShowInfo();
	}
}
