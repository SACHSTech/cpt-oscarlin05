package cpt;

public class PlayerData {

    private int intRanking;
    private String strPlayerName; 
    private double dblPercentage;
    private String strTeamName;
    private String strPosition;

    public PlayerData(int intRanking, String strPlayerName, String strTeamName, double dblPercentage){
        this.intRanking = intRanking;
        this.strPlayerName = strPlayerName;
        this.strTeamName = strTeamName;
        this.dblPercentage = dblPercentage;
    }

    public int getRanking(){
        return intRanking;
    }

    public String getPlayerName() {
        return strPlayerName;
    }

    public String getTeamName() {
        return strTeamName;
    }

    public double getPercentage() {
        return dblPercentage;
    }
}