package day9;

public class Player {

	  	private int no;
	    private String name;
	    private int matchesPlayed;
	    private int runsScored;
	    private int catchesTaken;
	    private int trophies;
	    private String countryName;
	    
	    public Player() {}

		public Player(int no, String name, int matchesPlayed, int runsScored, int catchesTaken, int trophies,
				String countryName) {
			super();
			this.no = no;
			this.name = name;
			this.matchesPlayed = matchesPlayed;
			this.runsScored = runsScored;
			this.catchesTaken = catchesTaken;
			this.trophies = trophies;
			this.countryName = countryName;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMatchesPlayed() {
			return matchesPlayed;
		}

		public void setMatchesPlayed(int matchesPlayed) {
			this.matchesPlayed = matchesPlayed;
		}

		public int getRunsScored() {
			return runsScored;
		}

		public void setRunsScored(int runsScored) {
			this.runsScored = runsScored;
		}

		public int getCatchesTaken() {
			return catchesTaken;
		}

		public void setCatchesTaken(int catchesTaken) {
			this.catchesTaken = catchesTaken;
		}

		public int getTrophies() {
			return trophies;
		}

		public void setTrophies(int trophies) {
			this.trophies = trophies;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		@Override
		public String toString() {
			return "Player [no=" + no + ", name=" + name + ", matchesPlayed=" + matchesPlayed + ", runsScored="
					+ runsScored + ", catchesTaken=" + catchesTaken + ", trophies=" + trophies + ", countryName="
					+ countryName + "]";
		}
		
	    
}
