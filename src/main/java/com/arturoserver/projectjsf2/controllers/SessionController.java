/**
 * 
 */
package com.arturoserver.projectjsf2.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.arturoserver.projectjsf2.dto.UsuarioDTO;

/**
 * @author Arthurserver
 * Clase que se encarga de mantener la información del usuario que ingresa al aplicativo en sesion.
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendra en sesión.
	 */
	private UsuarioDTO usuarioDTO;
	/**
	 * Inicializa la sesion del usuario.
	 */
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
