package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class controladorInterfazFXML implements Initializable{
	@FXML StackPane chartContainer1,chartContainer2,chartContainer3,chartContainer4,chartContainer5,chartContainer6,chartContainer7;
	Grafica chart1,chart2,chart3,chart4,chart5,chart6,chart7;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		inicializaGraficas();
		
	}

	void inicializaGraficas(){
		this.chart1= new Grafica(this.chartContainer1,"Tiempo","");
		this.chart2= new Grafica(this.chartContainer2,"Tiempo","");
		this.chart3= new Grafica(this.chartContainer3,"Tiempo","");
		this.chart4= new Grafica(this.chartContainer4,"Tiempo","");
		this.chart5= new Grafica(this.chartContainer5,"Tiempo","Presión y Temperatura");
		this.chart6= new Grafica(this.chartContainer6,"Tiempo (días)","Presión");
		this.chart7=new Grafica(this.chartContainer7,"Tiempo (días)","Caudal (Q)");
		
		this.chart1.insertaGrafica();
		this.chart2.insertaGrafica();
		this.chart3.insertaGrafica();
		this.chart4.insertaGrafica();
		this.chart5.insertaGrafica();
		this.chart6.insertaGrafica();
		this.chart7.insertaGrafica();
		
	}
}
