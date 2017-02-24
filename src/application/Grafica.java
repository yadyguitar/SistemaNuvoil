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
	
	Node layout=null;
	String x;
	String y;
	
	Grafica(Node layout, String x, String y){
		this.layout=layout;
		this.x=x;
		this.y=y;
	}
	
	void insertaGrafica(){
		//Para la opción del que nodo sea un StackPane
		if(this.layout.getClass().equals(new StackPane().getClass()))
			((StackPane) layout).getChildren().add(this.creaChart());
	}
	
	private SwingNode creaChart(){ 
		 JFreeChart chart = ChartFactory.createXYLineChart( null, // chart title 
		                                                   this.x, // x axis label 
		                                                   this.y, // y axis label 
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
