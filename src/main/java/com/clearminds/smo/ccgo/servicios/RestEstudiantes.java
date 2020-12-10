package com.clearminds.smo.ccgo.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.ccgo.dtos.Estudiante;
import com.clearminds.ccgo.excepciones.BDDException;
import com.clearminds.ccgo.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	/*@Path("/recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public Estudiante recuperar() {
		return new Estudiante("Cristian", "Gómez");
	}*/
	
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
}



