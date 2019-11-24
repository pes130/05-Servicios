package es.cursojavafx.demoservicios.controller;

import es.cursojavafx.demoservicios.servicios.DemoServicio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DemoServiciosController {
	private int contador = 0;
	
	@FXML
	private Button btnServicio;

	@FXML
	private Label lblResultado;

	@FXML
	private Button btnContador;

	@FXML
	private Label lblContador;

	@FXML
	void contar(ActionEvent event) {
		this.contador++;
		this.lblContador.setText(String.valueOf(contador));
	}

	@FXML
	void invocarServicio(ActionEvent event) {
//		System.out.println("Comienzo a ejecutar mi servicio");
//		try {
//			Thread.sleep(3000);
//			Random r = new Random();
//			int resultado = r.nextInt();
//			this.lblResultado.setText(String.valueOf(resultado));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Termino de ejecutar mi servicio");
		
		DemoServicio miServicio = new DemoServicio();
		miServicio.start();
		
		miServicio.setOnSucceeded(e -> {
			Integer resultado = miServicio.getValue();
			this.lblResultado.setText(String.valueOf(resultado));
		});
	}
}
