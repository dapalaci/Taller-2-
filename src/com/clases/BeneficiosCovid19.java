package com.clases;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;
    private String mejorsubsidio;
    private String mejorbeneficio;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getValorSubsidio() {
		return Float.valueOf(valorSubsidio);
	}

	public void setValorSubsidio(Float valorSubsidio) {
		this.valorSubsidio = valorSubsidio;
	}

	public Integer getMejorSubsidio() {
		return Integer.valueOf(mejorsubsidio);
	}

	public void setMejorSubsidio(String mejorsubsidio) {
		this.mejorsubsidio = mejorsubsidio;
	}
	

    //Completar clase

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(String valorsubsidio1, String valorsubsidio2 ){  	
    	if (Float.parseFloat(valorsubsidio1) > Float.parseFloat(valorsubsidio2)){
			mejorbeneficio = valorsubsidio1;
			mejorsubsidio = "1";
    	} else if (Float.parseFloat(valorsubsidio2) > Float.parseFloat(valorsubsidio1)){
    	    mejorbeneficio = valorsubsidio2;
    	    mejorsubsidio = "2";
    	} else {  
        	mejorbeneficio = valorsubsidio1;
        	mejorsubsidio = "0";
    	}
    	setMejorSubsidio(mejorsubsidio);
        return Float.valueOf(mejorbeneficio);
    }
}

