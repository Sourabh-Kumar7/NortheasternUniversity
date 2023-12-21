// TopBundlesChartFrame.java

package UserInterface.BusinessOwner;

import TheBusiness.MarketModel.Bundle;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class TopBundlesChartFrame extends JFrame {

    public TopBundlesChartFrame(List<Bundle> topBundles) {
        initComponents(topBundles);
    }

    private void initComponents(List<Bundle> topBundles) {
        this.setTitle("Top Bundles Metrics");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        CategoryDataset dataset = createDataset(topBundles);
        JFreeChart chart = ChartFactory.createBarChart(
                "Top Bundles Above Target Percentage",
                "Bundle ID",
                "Percentage Above Target",
                dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset(List<Bundle> topBundles) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Bundle bundle : topBundles) {
            double percentageAboveTarget = (bundle.getHighestSellingPrice() - bundle.getTargetPrice()) / bundle.getTargetPrice() * 100;
            dataset.addValue(percentageAboveTarget, "Bundles", String.valueOf(bundle.getId()));
        }

        return dataset;
    }
}
