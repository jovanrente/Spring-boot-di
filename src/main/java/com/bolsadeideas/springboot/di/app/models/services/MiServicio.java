package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MiServicio implements IServicio{
	
	public String operacion() {
		return "ejecutando un proceso";
	}
}
