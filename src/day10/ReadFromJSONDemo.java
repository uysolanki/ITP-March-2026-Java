package day10;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadFromJSONDemo {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Player> players=null;
        try {
            players = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("data/players.json"),									  //relative path
                new TypeReference< List<Player>>() {}
            );
            
        

       
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        System.out.println(players);
        
       //fetch all player names and store in a list
       List<String> playerNames= players.stream()
        .map(player->player.getName())
        .toList();   //jdk 16 onwards   order versions 1.8   .collect(Collectors.toList());

       Set<String> uniquePlayerNames=new HashSet(playerNames);
       System.out.println(uniquePlayerNames);
       
       //display all player names 
       players.stream()
       .map(Player::getName)
       .forEach(System.out::println);
       
       
     //fetch all Indian player names and store in a list
       List<String> indianPlayerNames= players.stream()
        .filter(player-> player.getCountryName().equalsIgnoreCase("India"))   //input 14 -> output 7
        .map(player->player.getName())  //input 7 objects -> output 7 string
        .toList();
       
       System.out.println(indianPlayerNames);
       
       //partition the players objects based on who have player more than 300 matches & less than 300 matches
       Map<Boolean, List<Player>> playerObjectsByMatchesPlayed300=
       players.stream()
       .collect(Collectors.partitioningBy(player->player.getMatchesPlayed()>=300));
       
       System.out.println(playerObjectsByMatchesPlayed300);
       
       
     //partition the players names based on who have player more than 300 matches & less than 300 matches
       Map<Boolean, List<String>> playerNamesByMatchesPlayed300=
    	       players.stream()
    	       .collect(Collectors.partitioningBy(player->player.getMatchesPlayed()>=300,Collectors.mapping(Player::getName, Collectors.toList())));
	System.out.println(playerNamesByMatchesPlayed300);
	
	System.out.println("Players who have played less than 300 matches" + playerNamesByMatchesPlayed300.get(false));
	System.out.println("Players who have played more than 300 matches" + playerNamesByMatchesPlayed300.get(true));
	
	
	//group the player objects countrywise
	
	Map<String,List<Player>> countrywisePlayerObjects = players.stream()
	.collect(Collectors.groupingBy(Player::getCountryName));
	
	System.out.println(countrywisePlayerObjects);
	
	
	//group the player names countrywise
	
	Map<String, List<String>> countrywisePlayerNames = players.stream()
			.collect(Collectors.groupingBy(Player::getCountryName,Collectors.mapping(Player::getName, Collectors.toList())));
	
	System.out.println(countrywisePlayerNames);
	
	//display count of players from each country
	
		Map<String, Long> countrywisePlayerCount = players.stream()
				.collect(Collectors.groupingBy(Player::getCountryName,Collectors.counting()));
		
		System.out.println(countrywisePlayerCount);
		
	//display country having max number of player
		
		String countryNameWithMaxPlayers=countrywisePlayerCount.entrySet().stream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(null);
		
		System.out.println(countryNameWithMaxPlayers);
	}

}
