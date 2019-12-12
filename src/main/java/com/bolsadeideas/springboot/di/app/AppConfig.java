package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicio;

@Configuration
public class AppConfig {
	
	@Bean("miServiciosimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 =  new Producto("camara sony",100.0);
		Producto producto2 =  new Producto("camara epson",150.0);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		return Arrays.asList(linea1,linea2);
		
	}
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 =  new Producto("Monitor sony",250.0);
		Producto producto2 =  new Producto("Notebook Asus",500.0);
		Producto producto3 =  new Producto("Macbook  pro",800.0);
		Producto producto4 =  new Producto("Printer Epson a35",400.0);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		return Arrays.asList(linea1,linea2,linea3,linea4);
		
	}

}
