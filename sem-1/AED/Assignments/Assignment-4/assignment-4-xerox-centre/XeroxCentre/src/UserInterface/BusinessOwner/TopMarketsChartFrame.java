/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.BusinessOwner;

/**
 *
 * @author sourabhkumar
 */
import TheBusiness.MarketModel.Market;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TopMarketsChartFrame extends JFrame {

    public TopMarketsChartFrame(List<Market> topMarkets) {
        initComponents(topMarkets);
    }

    private void initComponents(List<Market> topMarkets) {
        setTitle("Top Markets by Profit");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Market market : topMarkets) {
            dataset.addValue(Math.round(market.getTotalProfit() * 100.0) / 100.0, "Profit", market.getName());
        }

        // Create a bar chart
        JFreeChart barChart = ChartFactory.createBarChart(
                "Top Markets by Profit", // Chart title
                "Market",                // X-axis label
                "Profit",                // Y-axis label
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        // Display the chart in a ChartPanel
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(560, 370));
        setContentPane(chartPanel);
        setVisible(true);
    }
}

