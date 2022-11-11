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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
