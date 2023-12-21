/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.BusinessOwner;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author sourabhkumar
 */
public class TopCustomersChartFrame extends JFrame {
    public TopCustomersChartFrame(CategoryDataset dataset) {
        super("Top Customers Chart");
        JFreeChart chart = ChartFactory.createBarChart(
                "Top 5 Customers by Number of Orders",
                "Customer",
                "Number of Orders",
                dataset
        );
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Ensure that the frame is visible only after adding components
        setVisible(true);
    }
}

