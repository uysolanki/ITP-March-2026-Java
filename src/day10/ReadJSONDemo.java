package day10;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day1.Employee;

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
	}

}
