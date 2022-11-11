/**
 * 
 */
package com.arturoserver.projectjsf2.services;

import java.util.ArrayList;
import java.util.List;

import com.arturoserver.projectjsf2.entity.Empleado;

/**
 * @author Arthurserver
 * Clase que permite realizar la lógica de negocio para empleados.
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados() {
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoSpotify = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesus");
		empleadoMicrosoft.setPrimerApellido("Reyes");
		empleadoMicrosoft.setSegundoApellido("Gomez");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		//:::::::::::::::::::::
		
		empleadoNetflix.setNombre("Miguel");
		empleadoNetflix.setPrimerApellido("Lopez");
		empleadoNetflix.setSegundoApellido("Romero");
		empleadoNetflix.setPuesto("Architect");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Christian");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombre("Henry");
		empleadoHP.setPrimerApellido("Lopez");
		empleadoHP.setSegundoApellido("Romero");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Manuelito");
		empleadoOracle.setPrimerApellido("Lopez");
		empleadoOracle.setSegundoApellido("Romero");
		empleadoOracle.setPuesto("Architect");
		empleadoOracle.setEstatus(true);
		
		empleadoSpotify.setNombre("Luis Roberto");
		empleadoSpotify.setPrimerApellido("Lopez");
		empleadoSpotify.setSegundoApellido("Romero");
		empleadoSpotify.setPuesto("Architect");
		empleadoSpotify.setEstatus(true);
		
		empleadoDisney.setNombre("Vianey");
		empleadoDisney.setPrimerApellido("Lopez");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoSpotify);
		empleados.add(empleadoDisney);
		
		return empleados;
	}

}
