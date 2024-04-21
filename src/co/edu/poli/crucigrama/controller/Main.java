package co.edu.poli.crucigrama.controller;

import java.util.Scanner;

import co.edu.poli.crucigrama.model.*;
import conexionBD.Conexion;

public class Main {

	public static void main(String[] args) {
		

		Conexion conexion= new Conexion();
		conexion.conectar();

		Logica crucigrama = new Logica();
		int cerrar = 0;

		while (cerrar == 0) {
			System.out.println("\nCRUCIGRAMA\n");
			crucigrama.mostrarCrucigrama();
			crucigrama.imprimirRespuestas();

			System.out.println("\nIngrese el id de la palabra a validar:");
			Scanner teclado = new Scanner(System.in);
			int numero = teclado.nextInt();
			crucigrama.validarLetra(numero);
		}

	}

}
