package cpt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 * A class to read data from freethrow.csv file 
 */
public class Reader{

    /**
     * reads the csv file 
     * @param fileName
     * @return
     */
    public ArrayList<PlayerData> read(String fileName) {

        // arraylist 
        ArrayList<PlayerData> data = new ArrayList<>();

        // empty string 
        String line;

        // buffered reader to read
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // breaks value in the csv file after every comma 
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                int intRanking = Integer.parseInt(values[0]);
                String strPlayerName = values[1];
                String strTeamName = values[2];
                Double dblPercentage = Double.parseDouble(values[4]);

                // Create new object and add to arraylist 
                data.add(new PlayerData(intRanking, strPlayerName, strTeamName, dblPercentage)); 
   
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}
