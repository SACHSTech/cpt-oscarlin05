package cpt;

public class PlayerData {

    private String strPlayerName; 
    private double dblPercentage;
    private String strPosition;

    public PlayerData(String strPlayerName, double dblPercentage, String strPosition){
        this.strPlayerName = strPlayerName;
        this.dblPercentage = dblPercentage;
        this.strPosition = strPosition;
    }
    public String getPlayerName() {
        return strPlayerName;
    }

    public double getPercentage() {
        return dblPercentage;
    }

    public String getPosition() {
        return strPosition;
    }

}