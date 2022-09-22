package student;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/asistencia")
public class Asistencia {
	public Listado listado = new Listado();
		
	@GET
	@Produces(MediaType.TEXT_XML)
	public String mostrarXML() {
	String response = "<?xml version = '1.0' ?>"+
	"<lista>"+listado.listar()+"</lista>";
		return response;
	}

}
	