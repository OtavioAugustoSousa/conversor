package br.ufc.quixada.model;

public class Conversor {

	
	public float getKelvinToCelsius(float grauKelvin) {
	
		return grauKelvin-273;
	}

	public float getKelvinToFahrenheit(float grauKelvin) {

		return (((grauKelvin-273)/5)*9)+32;
	}

	public float getFahrenheitToKelvin(float grauF) {

		return (((grauF-32)/9)*5)+273;
	}

	public float getFahrenheitToCelsius(float grauF) {
		return ((grauF-32)/9)*5;
	}

	public float getCelsiusToKelvin(float grauC) {
		return (grauC + 273);
	}

	public float getCelsiusToFahrenheit(float grauC) {
		return grauC*(9/5)+32;
	}

}
