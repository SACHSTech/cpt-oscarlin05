package cpt;

import java.util.ArrayList;
import java.util.List;
import java.io.*;



public class CSVReader {

    public static String[][] readCSVFile (String strfilePath) {
       
        List<String[]> listColumns = new ArrayList<>();

        String strCurrentLine;
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(strfilePath))) {
            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                listColumns.add(strCurrentLine.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listColumns.toArray(new String[listColumns.size()][listColumns.get(0).length]);
    }
}
