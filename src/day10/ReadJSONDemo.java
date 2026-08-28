package day10;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONDemo {

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
        
        
        //display name of all players
        List<String> playerNames=players.stream()
        .map(Player::getName)
        .toList();
        
        System.out.println(playerNames);
        
        //display name of all players of Indian team
        List<String> indianPlayerNames=players.stream()
        		.filter(player->player.getCountryName().equalsIgnoreCase("India"))
                .map(Player::getName)
                .toList();
        
        System.out.println(indianPlayerNames);
        
       //display count of players in Indian team
        long countOfIndianPlayer=players.stream()
        		.filter(player->player.getCountryName().equalsIgnoreCase("India"))
                .count();
        
        System.out.println(countOfIndianPlayer);
        
        //display country wise name of players
        //step 1
       Map<String,List<Player>> countryWiseallPlayerObjects=players.stream()
        .collect(Collectors.groupingBy(Player::getCountryName));
       
       System.out.println(countryWiseallPlayerObjects);
       
     //step 2
       Map<String,List<String>> countryWiseallPlayerNames=players.stream()
        .collect(Collectors.groupingBy(Player::getCountryName,Collectors.mapping(Player::getName, Collectors.toList())));
       System.out.println(countryWiseallPlayerNames);
       
       
       
     //display country wise name of players
	}

}


