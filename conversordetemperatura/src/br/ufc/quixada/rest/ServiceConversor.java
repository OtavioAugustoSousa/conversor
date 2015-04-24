package br.ufc.quixada.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufc.quixada.model.Calculadora;
import br.ufc.quixada.model.Conversor;
import br.ufc.quixada.model.Grau;

@Path("/")
public class ServiceConversor {
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String hellow(){
		return "SEVICO IS RUNNING";
	}

	@GET
	@Path("/kelvintocelsius/{grau}")
	@Produces(MediaType.APPLICATION_JSON)
	public Grau getKelvinToCelsius(@PathParam("grau") float grauKelvin){
		   Grau grau= new Grau();
		   
		grau.setGrau(new Conversor().getKelvinToCelsius(grauKelvin));
		
		return grau;
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/kelvintofahrenheit/{grau}")
	public Grau getKelvinToFahrenheit(@PathParam("grau") float grauKelvin){
		Grau grau= new Grau();
		grau.setGrau(new Conversor().getKelvinToFahrenheit(grauKelvin));
		return grau;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fahrenheittokelvin/{grau}")
	public Grau getFahrenheitToKelvin(@PathParam("grau") float grauF){
		
		Grau grau= new Grau();
		grau.setGrau(new Conversor().getFahrenheitToKelvin(grauF));
		return grau;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fahrenheittocelsius/{grau}")
	public Grau getFahrenheitToCelsius(@PathParam("grau") float grauF){
		Grau grau= new Grau();
		grau.setGrau(new Conversor().getFahrenheitToCelsius(grauF));
		return grau;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/celsiustokelvin/{grau}")
	public Grau getCelsiusToKelvin(@PathParam("grau") float grauC){
		Grau grau= new Grau();
		Conversor c =new Conversor();
		grau.setGrau(c.getCelsiusToKelvin(grauC));
		return grau;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/celsiustofahrenheit/{grau}")
	public Grau getCelsiusToFahrenheit(@PathParam("grau") float grauC){
		Grau grau= new Grau();
		grau.setGrau(new Conversor().getCelsiusToFahrenheit(grauC));
		return grau;
	}
}
