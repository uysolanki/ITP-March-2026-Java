package day9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerApp {

	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<>();
						//   jno  pname                 mp   rs     ct      tw  country
		players.add(new Player(1, "Virat Kohli", 		254, 12898, 152, 	2, "India"));
		players.add(new Player(2, "Rohit Sharma", 		265, 10866, 98, 	2, "India"));
		players.add(new Player(3, "MS Dhoni", 			350, 10773, 256, 	3, "India"));
		players.add(new Player(4, "Sachin Tendulkar", 	463, 18426, 140, 	3, "India"));
		players.add(new Player(5, "Rahul Dravid", 		344, 13288, 210, 	1, "India"));
		players.add(new Player(6, "Yuvraj Singh", 		304, 8701, 	94, 	2, "India"));
		players.add(new Player(7, "Sourav Ganguly", 	311, 11363, 100, 	1, "India"));
		players.add(new Player(8, "AB de Villiers", 	420, 20014, 120, 	3, "South Africa"));
		players.add(new Player(9, "Quinton DeKock", 	120, 2534,  38, 	1, "South Africa"));
		players.add(new Player(10, "Jacques Kallis", 	519, 25534, 338, 	4, "South Africa"));
		players.add(new Player(11, "David Miller", 	    230, 5534,  108, 	2, "South Africa"));
		players.add(new Player(12, "Ricky Ponting", 	560, 27483, 160, 	4, "Australia"));
		players.add(new Player(13, "Adam Gilchrist", 	460, 20483, 260, 	3, "Australia"));
		players.add(new Player(14, "Brian Lara", 		500, 23483, 150, 	7, "West Indies"));
		
		//display name of player with higest runs
		
		Player highestScorer=players.stream()
		.max(Comparator.comparing(Player::getRunsScored))
		.orElse(null);
		
		System.out.println(highestScorer.getName());
		
		//display name of player with least matches runs
		
		Player leastMatches=players.stream()
		.min(Comparator.comparing(Player::getMatchesPlayed))
		.orElse(null);
				
		System.out.println(leastMatches.getName());
		
		String pname=players.stream()
		.min(Comparator.comparing(Player::getMatchesPlayed))
		.map(Player::getName)
		.orElse(null);
	
						
		System.out.println(pname);
		
		
		//display total number of runs scored by Indians
		int totalRunsScoredByIndianPlayers=players.stream()
		.filter(player->player.getCountryName().equalsIgnoreCase("India"))//[{},{},{},{}]
		.mapToInt(Player::getRunsScored)  //[100,200,300,400]
		.sum();
		
		System.out.println("The total Runs Scored By Indian Players " + totalRunsScoredByIndianPlayers);
		
		
		
		int totalRunsScoredByIndianPlayers1=players.stream()
		.filter(player->player.getCountryName().equalsIgnoreCase("India"))//[{},{},{},{}]
		.map(Player::getRunsScored) //[100,200,300,400]
		.reduce(0,(acc,run)->acc + run);
		
				
		System.out.println("The total Runs Scored By Indian Players " + totalRunsScoredByIndianPlayers1);
		
		
		//display count of Indian Players
		
		int countOfIndianPlayers=(int)players.stream()
				.filter(player->player.getCountryName().equalsIgnoreCase("India"))//[{},{},{},{}]
				.count();
				
						
				System.out.println("The total Runs Scored By Indian Players " + countOfIndianPlayers);
				
		
		Map<String,Long> hashmap=players.stream()
				.collect(Collectors.groupingBy(Player::getCountryName,Collectors.counting()));
		
	
		System.out.println(hashmap);
	}

}
