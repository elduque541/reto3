package com.tns.reto3;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class OrdenarVectorPesoTest {

	@Test
	public void sumarPesoCadenaCien() {
		NumeroPeso numeroPeso = new NumeroPeso("100");
		assertTrue(1 == numeroPeso.getPeso());
	}

	@Test
	public void sumarPesoCadena99() {
		NumeroPeso numeroPeso = new NumeroPeso("99");
		assertTrue(18 == numeroPeso.getPeso());
	}

	@Test
	public void sumarPesoCadenaNula() {
		NumeroPeso numeroPeso = new NumeroPeso(null);
		assertTrue(0 == numeroPeso.getPeso());
	}

	@Test
	public void sumarPesoCadenaVacia() {
		NumeroPeso numeroPeso = new NumeroPeso("");
		assertTrue(0 == numeroPeso.getPeso());
	}

	@Test
	public void crearListaNumerosConLetras() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		peso.crearVectorNumeroPeso("5a6 5e");
	}

	@Test(expected = NullPointerException.class)
	public void crearListaNumerosNulo() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		peso.crearVectorNumeroPeso(null);
	}

	@Test
	public void crearListaNumerosVacio() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		int respuesta = peso.crearVectorNumeroPeso("").length();
		Assert.assertEquals(respuesta, 0);
	}

	@Test
	public void ordenarVectorPesos3Numeros() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		int respuesta = peso.crearVectorNumeroPeso("2 123 1").length();
		Assert.assertEquals(respuesta, 7);
	}

	@Test
	public void ordenarVectorPesosVectorCreadoVacio() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		String respuesta = peso.crearVectorNumeroPeso("");
		Assert.assertEquals(respuesta, "");
	}

	@Test
	public void ordenarVectorPesosVectorCreadoCadenaNumeros() {
		OrdenarVectorPeso peso = new OrdenarVectorPeso();
		String respuesta = peso.crearVectorNumeroPeso("65 6 57");
		Assert.assertEquals("6 65 57", respuesta);
	}

	@Test
	 public void ordenarVectorPesosVectorEjemploCadenaNumeros() {
	 OrdenarVectorPeso peso = new OrdenarVectorPeso();
	 String respuesta = peso.crearVectorNumeroPeso("56 65 74 100 99 68 86 90 180");
	 Assert.assertEquals("100 180 90 56 65 74 68 86 99", respuesta);
	 }

	@Test
	public void compararNumeroPeso() {
		NumeroPeso numeroPeso1 = new NumeroPeso("56");
		NumeroPeso numeroPeso2 = new NumeroPeso("65");
		int respuesta = numeroPeso1.compareTo(numeroPeso2);
		Assert.assertEquals(-1, respuesta);
	}

	@Test
	public void compararNumeroPesoNull() {
		NumeroPeso numeroPeso1 = new NumeroPeso("56");
		NumeroPeso numeroPeso2 = new NumeroPeso(null);
		int respuesta = numeroPeso1.compareTo(numeroPeso2);
		Assert.assertEquals(1, respuesta);
	}

	@Test
	public void compararNumeroPesoVacio() {
		NumeroPeso numeroPeso1 = new NumeroPeso("");
		NumeroPeso numeroPeso2 = new NumeroPeso("");
		int respuesta = numeroPeso1.compareTo(numeroPeso2);
		Assert.assertEquals(0, respuesta);
	}
}
