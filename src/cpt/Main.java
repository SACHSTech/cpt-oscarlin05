package cpt;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Create the x-axis for scatter chart
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Ranking");

        // Create the y-axis for scatter chart
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Percentage");

        // Create the scatter chart
        ScatterChart<Number, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
        scatterChart.setTitle("NBA Player Freethrow Percentage");

        // Create an object of CSVReader
        Reader reader = new Reader();

        // Use CSVreader to add data to a list
        List<PlayerData> playerDataList = reader.read("src/cpt/freethrow.csv");

        // Create an instance of the class that implements the selection sort algorithm
        SelectionSort selectionSort = new SelectionSort();

        // Create an array of integers to store the years
        Double[] percentage = new Double[playerDataList .size()];

        int k = 0;

        for (PlayerData d : playerDataList ) {

            percentage[k++] =  d.getPercentage();

        }

        // Pass the array of years to the sorting method
        selectionSort.sort(percentage);

        // Create a data series to hold the scatter chart data
        XYChart.Series<Number, Number> data = new XYChart.Series<>();

        // Add data points to the data series
        for (PlayerData d : playerDataList) {
            data.getData().add(new XYChart.Data<>(d.getRanking(), d.getPercentage()));
        }

        // Add the data series to the scatter chart
        scatterChart.getData().add(data);

        // Create x-axis for bar chart
        CategoryAxis xAxisBar = new CategoryAxis();
        xAxisBar.setLabel("Teams");

        // Create y-axis for bar chart
        NumberAxis yAxisBar = new NumberAxis();
        yAxisBar.setLabel("Average Percentage");

        // Create the bar chart
        BarChart<String, Number> barChart = new BarChart<>(xAxisBar, yAxisBar);
        barChart.setTitle("NBA Team Average Freethrow Percentage");

        Map<String, Double> teamPercentageMap = new HashMap<>();
        Map<String, Integer> teamCountMap = new HashMap<>();

  
    }
    public static void main(String[] args) {
        launch(args);
    }
}