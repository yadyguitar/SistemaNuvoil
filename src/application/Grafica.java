package application;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.plot.PlotOrientation;

import javafx.embed.swing.SwingNode;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class Grafica {

	Grafica(Node layout){
		
		
		if(layout.getClass().equals(new StackPane().getClass()))
			((StackPane) layout).getChildren().add(this.creaChart());
		
	}
	
	private SwingNode creaChart(){ 
		 JFreeChart chart = ChartFactory.createXYLineChart( null, // chart title 
		                                                   "X", // x axis label 
		                                                   "Y", // y axis label 
		                                                   null, // data 
		                                                   PlotOrientation.VERTICAL, true, // include legend 
		                                                   true, // tooltips 
		                                                   false // urls 
		 );
		 
		 ChartPanel chartPane = new ChartPanel(chart); 
		 SwingNode sNode = new SwingNode(); 
		 sNode.setContent(chartPane); 
		 return sNode; 
	 } 
	
	
	
}
