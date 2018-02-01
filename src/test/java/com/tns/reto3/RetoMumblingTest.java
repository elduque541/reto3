package com.tns.reto3;

import org.junit.Assert;
import org.junit.Test;

public class RetoMumblingTest {

	@Test
	public void crearMumblingNulo() {
		String respuesta = Mumbling.generarCadenaAcumulada(null, 0);
		Assert.assertEquals("", respuesta);
	}

	@Test
	public void crearMumblingVacio() {
		String respuesta = Mumbling.generarCadenaAcumulada("", 0);
		Assert.assertEquals("", respuesta);
	}

	@Test
	public void crearMumblingAcumuladoEjemploUnaPosicion() {
		String respuesta = Mumbling.generarCadenaAcumulada("a", 1);
		Assert.assertEquals("A", respuesta);
	}

	@Test
	public void crearMumblingAcumuladoEjemploCincoPosiciones() {
		String respuesta = Mumbling.generarCadenaAcumulada("b", 5);
		Assert.assertEquals("Bbbbb", respuesta);
	}

	@Test
	public void crearMumblingCompleto() {
		RetoMumbling retoMumbling = new RetoMumbling();
		String respuesta = retoMumbling.crearCadena("bac");
		Assert.assertEquals("B-Aa-Ccc", respuesta);
	}

	@Test
	public void crearMumblingCompletoHolaMundo() {
		RetoMumbling retoMumbling = new RetoMumbling();
		String respuesta = retoMumbling.crearCadenaFor("hola Mundo");
		Assert.assertEquals("H-Oo-Lll-Aaaa M-Uu-Nnn-Dddd-Ooooo", respuesta);
	}

}
