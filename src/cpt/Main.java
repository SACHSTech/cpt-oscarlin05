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
       
    }
    public static void main(String[] args) {
        launch(args);
    }
}