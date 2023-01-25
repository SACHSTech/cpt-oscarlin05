package cpt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class Reader{

    public ArrayList<PlayerData> read(String fileName) {

        ArrayList<PlayerData> data = new ArrayList<>();

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                String strPlayerName = values[1];
                String strTeamName = values[2];
                Double dblPercentage = Double.parseDouble(values[4]);
                //String strPosition = values[3];

                data.add(new PlayerData(strPlayerName, strTeamName, dblPercentage)); 
   
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}
