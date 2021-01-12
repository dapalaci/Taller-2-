package com.clientes;

import javax.swing.JOptionPane;
import com.clases.BeneficiosCovid19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code her

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */
    	ArrayList<String> lista1 = new ArrayList<String>();
    	ArrayList<String> lista2 = new ArrayList<String>();
    
    	BeneficiosCovid19 bc = new BeneficiosCovid19();
    	
    	int id = Integer.parseInt(getIdBeneficio());
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del primer beneficio");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer beneficio"));
		
		bc.setId(String.valueOf(id));
		bc.setNombre(nombre);
		bc.setValorSubsidio(Float.valueOf(valor));
		
		lista1.add(String.valueOf(bc.getId()));
		lista1.add(bc.getNombre());
		lista1.add(String.valueOf(bc.getValorSubsidio()));
		 
		id = Integer.parseInt(getIdBeneficio());
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del segundo beneficio");
		valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo beneficio"));
		
		bc.setId(String.valueOf(id));
		bc.setNombre(nombre);
		bc.setValorSubsidio(Float.valueOf(valor));
		
		lista2.add(String.valueOf(bc.getId()));
		lista2.add(bc.getNombre());
		lista2.add(String.valueOf(bc.getValorSubsidio()));
		
		String valor1 = lista1.get(2);
		String valor2 = lista2.get(2);
		double mejor = bc.getMejorbeneficios(valor1, valor2);
				
		compararListas(lista1, lista2);
		
		System.out.println(lista1);
		for (int i = 0; i <= lista1.size() - 1; i++) {
            System.out.println(lista1.get(i));
        }
		System.out.println(lista2);
		for (int i = 0; i <= lista2.size() - 1; i++) {
	            System.out.println(lista2.get(i));
	    }
		
		String nombreBene = null;
		switch (bc.getMejorSubsidio()) {
		case 1:
			nombreBene = " del primer beneficio es el mejor.";
			break;
		case 2:
			nombreBene = " del segundo beneficio es el mejor.";
			break;
		case 0:
			nombreBene = " es igual en ambos beneficios.";
		default:
			break;
		}
		System.out.println("El valor " + mejor + nombreBene);
    } 

    /**
    * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
    * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
    * Abarcar los operadores terniarios para condiciones logicas
    * Operadores logicos
    * Operacionres aritmeticos
    **/

    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        //La Clase Math tiene varios metodos que te ayudaran
    	return String.valueOf((int)(Math.random()*101));
    }
    
    public static void compararListas(List<String> lista1, List<String> lista2) {
    	String comparar;
    		Collections.sort(lista1);
    		Collections.sort(lista2);
    		
    		if (lista1.equals(lista2)) {
    			comparar ="Iguales";
    		}else {
    			comparar ="Diferentes";
    		}
    	 		System.out.println("Las listas son: " + comparar);    	
    }
}

