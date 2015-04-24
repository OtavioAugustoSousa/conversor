package br.ufc.quixada.model;

public class Conversor {
	private Calculadora c= new Calculadora();

	
	public float getKelvinToCelsius(float grauKelvin) {
	
		return c.sub(grauKelvin,273);
	}

	public float getKelvinToFahrenheit(float grauKelvin) {

		return c.som(c.mult(c.div(c.sub(grauKelvin, 273),5),9),32);
	}

	public float getFahrenheitToKelvin(float grauF) {

		return c.som(c.mult(c.div(c.sub(grauF,32),9),5),273);
	}

	public float getFahrenheitToCelsius(float grauF) {
		return c.mult(c.div(c.sub(grauF,32),9),5);
	}

	public float getCelsiusToKelvin(float grauC) {
		return c.som(grauC,273);
	}

	public float getCelsiusToFahrenheit(float grauC) {
		return c.som(c.mult(grauC,c.div(9,5)),32);
	}

}
