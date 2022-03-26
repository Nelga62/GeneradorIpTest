package generadorip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp generador = new GeneradorIp();

	@Test
	void testGenerarNumero() {
		int i = 0;
		while (i < 1000) {
			int numero = generador.generarNumero(0, 254);
			assertTrue(numero >= 0 && numero <= 254);
			i++;
		}
	}

	@Test
	void testGeneraIp() {
		int i = 0;
		while (i < 1000) {
			String ip = generador.generarIp();
			String numeroInicial = String.valueOf(ip.charAt(0));
			String numeroFinal = ip.substring(ip.lastIndexOf("."));
			assertTrue(numeroInicial != "0" && numeroFinal != "0");
			i++;
		}
	}

}
