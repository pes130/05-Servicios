package es.cursojavafx.demoservicios.servicios;

import java.util.Random;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class DemoServicio extends Service<Integer>{

	@Override
	protected Task<Integer> createTask() {
		
		return new Task<Integer>() {

			@Override
			protected Integer call() throws Exception {
				System.out.println("Llamamos a nuestro servicio Service de JavaFX");
				Thread.sleep(3000);
				Random r = new Random();
				int aleatorio = r.nextInt();
				System.out.println("Terminamos nuestro servicio Service de JavaFX");
				return aleatorio;
			}
			
		};
	}

	

}
 