package br.ufc.quixada.model;

import java.util.HashMap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import com.google.gson.Gson;
public class Calculadora {
	Client client = ClientBuilder.newClient(new ClientConfig());
	public float som(float num1, float num2) {

		String entity = client
				.target("http://cnuvem.cloudapp.net/subtracao_resource.php/?n1="+num1+"&n2="+num2)
				.request(MediaType.APPLICATION_JSON).get(String.class);
		
		Gson g= new Gson();
		HashMap<String, String> h = g.fromJson(entity, HashMap.class);
		
		
		return num1+num2;
	}

	public float sub(float num1, float num2) {
		String entity = client
				.target("http://cnuvem.cloudapp.net/subtracao_resource.php/?n1="+num1+"&n2="+num2)
				.request(MediaType.APPLICATION_JSON).get(String.class);
		Gson g= new Gson();
		HashMap<String, String> h = g.fromJson(entity, HashMap.class);
		return (Float.parseFloat(h.values().toArray()[0]+""));
		
	}

	public float mult(float num1, float num2) {
		String entity = client
				.target("http://cnuvem.cloudapp.net/multiplicacao_resource.php/?n1="+num1+"&n2="+num2)
				.request(MediaType.APPLICATION_JSON).get(String.class);
		Gson g= new Gson();
		HashMap<String, String> h = g.fromJson(entity, HashMap.class);
		return (Float.parseFloat(h.values().toArray()[0]+""));
	}

	public float div(float num1, float num2) {
		String entity = client
				.target("http://cnuvem.cloudapp.net/divisao_resource.php/?n1="+num1+"&n2="+num2)
				.request(MediaType.APPLICATION_JSON).get(String.class);
		Gson g= new Gson();
		HashMap<String, String> h = g.fromJson(entity, HashMap.class);
		return (Float.parseFloat(h.values().toArray()[0]+""));
	}
}
