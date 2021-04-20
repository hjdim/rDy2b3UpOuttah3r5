package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {

	  private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	    
      
	  /* Add a song title to a genre */
	  public void addSong(String genre, String songTitle) {
          if(map.containsKey(genre)){
              map.get(genre).add(songTitle);
          }
          else{
              //add new genre to hashmap
              Set<String> newSet = new HashSet<String>();
              newSet.add(songTitle);
              map.put(genre,newSet);
          }
  
      }// addSong Method
	  
	  
	  /* Return the Set that contains all songs for a genre */
      public Set<String> getSongs(String genre) {
  
          return map.get(genre);
      }// getSongs Method
       
      
      /* Return genre, i.e., jazz, given a song title */
      public String getGenreOfSong(String songTitle) {
  
          for (Map.Entry<String, Set<String>> songEntry : map.entrySet()) {
              
              if(songEntry.getValue().contains(songTitle)){
                  return songEntry.getKey();
              }
          
          }

          return "That Genre is not present here.";
  
      }
  
}//SongsDatabase Class
