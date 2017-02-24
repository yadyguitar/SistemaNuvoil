package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class controladorInterfazFXML implements Initializable{
	@FXML StackPane chartContainer1,chartContainer2,chartContainer3,chartContainer4,chartContainer5,chartContainer6;
	Grafica chart1,chart2,chart3,chart4,chart5,chart6;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		inicializaGraficas();
		
	}

	void inicializaGraficas(){
		this.chart1= new Grafica(this.chartContainer1,"Tiempo","Temperatura");
		this.chart2= new Grafica(this.chartContainer2,"Tiempo","Temperatura");
		this.chart3= new Grafica(this.chartContainer3,"Tiempo","Temperatura");
		this.chart4= new Grafica(this.chartContainer4,"Tiempo","Temperatura");
		this.chart5= new Grafica(this.chartContainer5,"Tiempo","Presión y Temperatura");
		this.chart6= new Grafica(this.chartContainer6,"Caudal (Q)","Presión");
		
		this.chart1.insertaGrafica();
		this.chart2.insertaGrafica();
		this.chart3.insertaGrafica();
		this.chart4.insertaGrafica();
		this.chart5.insertaGrafica();
		this.chart6.insertaGrafica();
		
	}
}
