package cpt;

/**
 * A class made for player data with their percentage, team name, and rankings 
 */
public class PlayerData {

    // create instance variables 
    private int intRanking;
    private String strPlayerName; 
    private double dblPercentage;
    private String strTeamName;

    /**
     * 
     * @param intRanking the ranking of the player
     * @param strPlayerName the name of the player 
     * @param strTeamName the team name of the place 
     * @param dblPercentage the free throw percentage 
     */
    public PlayerData(int intRanking, String strPlayerName, String strTeamName, double dblPercentage){
        this.intRanking = intRanking;
        this.strPlayerName = strPlayerName;
        this.strTeamName = strTeamName;
        this.dblPercentage = dblPercentage;
    }

    /**
     * accessor method for ranking 
     * @return intRanking 
     */
    public int getRanking(){
        return intRanking;
    }

    /**
     * accessor method for player name
     * @return strPlayerName
     */
    public String getPlayerName() {
        return strPlayerName;
    }

    /**
     * accessor method for team name 
     * @return strTeamName
     */
    public String getTeamName() {
        return strTeamName;
    }

    /**
     * accessor method for freethrow percentage
     * @return dblPercentage
     */
    public double getPercentage() {
        return dblPercentage;
    }
}