package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	SongsDatabase theGroove = new SongsDatabase();
	
	@Test
	@DisplayName("addSong")
	public void addSongTest() {
		theGroove.addSong("Soul","SoulSong");
		theGroove.addSong("Rap","RapSong");
		theGroove.addSong("Rock","RockSong");
		theGroove.addSong("Accoustic","AccousticSong");
		theGroove.addSong("Jazz","JazzSong");
		theGroove.addSong("Swing","SwingSong");
	}//addSongTest
	
	@Test
	@DisplayName("getSongs")
	public void getSongsTest() {
		
		theGroove.addSong("Soul","SoulSong");
		theGroove.addSong("Rap","RapSong");
		theGroove.addSong("Rock","RockSong");
		theGroove.addSong("Accoustic","AccousticSong");
		theGroove.addSong("Jazz","JazzSong");
		theGroove.addSong("Swing","SwingSong");
	      
		Set<String> set = theGroove.getSongs("Rap");
		Iterator value = set.iterator();
		while(value.hasNext()){
            System.out.println(value.next());
        }	
	}//getSongsTest
	
	
	@Test
	@DisplayName("getGenreOfSong")
	public void getGenreOfSong() {
		theGroove.addSong("Soul","SoulSong");
		theGroove.addSong("Rap","RapSong");
		theGroove.addSong("Rock","RockSong");
		theGroove.addSong("Accoustic","AccousticSong");
		theGroove.addSong("Jazz","JazzSong");
		theGroove.addSong("Swing","SwingSong");
		
	    System.out.println(theGroove.getGenreOfSong("SoulSong"));
	}//getGenreOfSong Test
	
}//SongsDatabase Class
