package cpt;

public class PlayerData {

    private String strPlayerName; 
    private double dblPercentage;
    private String strTeamName;
    private String strPosition;

    public PlayerData(String strPlayerName, String strTeamName, double dblPercentage, String strPosition){
        this.strPlayerName = strPlayerName;
        this.strTeamName = strTeamName;
        this.dblPercentage = dblPercentage;
        this.strPosition = strPosition;
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

    public String getPosition() {
        return strPosition;
    }


}