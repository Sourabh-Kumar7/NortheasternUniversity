package UserInterface.Supplier;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

public class TargetPriceChartFrame extends JFrame {

    public TargetPriceChartFrame(CategoryDataset dataset) {
        super("Target Price Chart");
        JFreeChart chart = ChartFactory.createBarChart(
                "Target Price by Product",
                "Product",
                "Target Price",
                dataset
        );

        // Create a ChartPanel and set preferred size
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600)); // Set your preferred size

        // Wrap the ChartPanel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(chartPanel);

        // Add the JScrollPane to the JFrame
        setContentPane(scrollPane);

        setSize(800, 600); // Set the initial size of the JFrame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
}
