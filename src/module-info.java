module DemoServicios {
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.web;
	requires javafx.base;

	exports es.cursojavafx.demoservicios;
	opens es.cursojavafx.demoservicios.controller;

}