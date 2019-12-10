package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
	
	public String operacion() {
		return "ejecutando un proceso complejo";
	}
}
