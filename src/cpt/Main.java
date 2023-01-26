package cpt;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.control.Button;

public class Main extends Application {
@Override

public void start(Stage stage) {

    XYChart.Series<Number, Number> originalData = new XYChart.Series<>();

    // Create the x-axis for scatter chart
    NumberAxis xAxis = new NumberAxis();
    xAxis.setLabel("Ranking");

    // Create the y-axis for scatter chart
    NumberAxis yAxis = new NumberAxis();
    yAxis.setLabel("Percentage");

    // Create the scatter chart
    ScatterChart<Number, Number> scatterChart = new ScatterChart<>(xAxis, yAxis);
    scatterChart.setTitle("Top 100 NBA Player Freethrow Percentage by Teams");

    // Create an object of CSVReader
    Reader reader = new Reader();

    // Use CSVreader to add data to a list
    List<PlayerData> playerDataList = reader.read("src/cpt/freethrow.csv");

    // Create a set to hold the unique teams
    Set<String> teamsSet = new HashSet<>();
    for (PlayerData player : playerDataList) {
        teamsSet.add(player.getTeamName());
    }

    
    // Create a data series to hold the scatter chart data
    XYChart.Series<Number, Number> data = new XYChart.Series<>();
    // Add data points to the data series
    for (PlayerData d : playerDataList) {
    data.getData().add(new XYChart.Data<>(d.getRanking(), d.getPercentage()));
    }


    // Add the data series to the scatter chart
    scatterChart.getData().add(data);

    // Create the x-axis for bar chart
    CategoryAxis xAxisBar = new CategoryAxis();
    xAxisBar.setLabel("Teams");

    // Create the y-axis for bar chart
    NumberAxis yAxisBar = new NumberAxis();
    yAxisBar.setLabel("Percentage");

    // Create the bar chart
    BarChart<String, Number> barChart = new BarChart<>(xAxisBar, yAxisBar);
    barChart.setTitle("Team Freethrow Percentage");
    barChart.setPrefHeight(500);

    // Create a map to hold the team percentages
    Map<String, Double> teamPercentages = new HashMap<>();
        
        // Create a tab pane to hold the scatter chart and bar chart
        TabPane tabPane = new TabPane();
        Tab scatterTab = new Tab("Scatter Chart", scatterChart);
        Tab barTab = new Tab("Bar Chart", barChart);
        tabPane.getTabs().addAll(scatterTab, barTab);

        // Create a VBox to hold the tab pane and checkboxes
        VBox chartContainer = new VBox();
        chartContainer.getChildren().add(tabPane);

        // Create the scene
        Scene scene = new Scene(chartContainer, 1200, 1000);

        // Set the stage
        stage.setTitle("NBA Player Free Throw Percentage");
        stage.setScene(scene);
        stage.show();
    }

    // Launch the application
    public static void main(String[] args) {
    launch(args);
    }
}