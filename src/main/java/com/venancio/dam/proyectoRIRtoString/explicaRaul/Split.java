package com.venancio.dam.proyectoRIRtoString.explicaRaul;

public class Split {

	public static void main(String[] args) {

		String texto = "Los métodos de la clase String son muy útiles";

		System.out.println("Texto sin modificar: " + texto + "\n");
		System.out.println("Texto dividido: ");

		for (String division : texto.split(" ")) {
			System.out.println(division);
		}

		System.out.println("\n" + "Texto dividido con limitaciones: ");
		for (String division : texto.split(" ", 5))
			System.out.println(division);

	}
	public static void mostrarArray(int[][] listado, String msg) {
		System.out.println(msg);
		
		for (int i = 0; i < listado.length; i++) {
			for (int j = 0; j < listado[i].length; j++) {				
				System.out.print(listado[i][j] + " ");
			}
			System.out.println();
		}
	}
}
