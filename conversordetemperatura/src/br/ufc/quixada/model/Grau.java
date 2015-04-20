package br.ufc.quixada.model;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Grau")
public class Grau {
	private float grau;

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}
	
}
