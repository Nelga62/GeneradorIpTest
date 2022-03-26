package generadorip;

public class GeneradorIp {
	

	public int generarNumero(int min, int max) {
		return (int)(Math.random()*(max - min + 1) + min);
	}
	
	public String generarIp() {
		String cadena = "";
		int i = 0;
		while(i < 4){
			int numero = generarNumero(0, 254);
			if(i == 0 || i == 3) {
				if(numero == 0) {
					while(numero == 0) {
						numero = generarNumero(0, 254);
					}
				}
			}
			cadena += numero;
			if(i != 3) {
				cadena += ".";
			}
			i++;
		}
		return cadena;
	}
}
