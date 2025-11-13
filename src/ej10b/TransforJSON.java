package ej10b;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;


public class TransforJSON {
	private List <Alumno> alumnos;
	private JSONObject[] listaAlumnosJSON=new JSONObject[5];
	
	TransforJSON(List<Alumno> a) {
		this.alumnos=a;
		introducirDatosAlJSON();
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void introducirDatosAlJSON() {
		int i=0;
		for(Alumno aux: alumnos) {
			JSONObject ob1=new JSONObject().put("nia", aux.getNia()).put("nombre", aux.getNombre()).put("apellidos", aux.getApellidos()).put("ciclo", aux.getCiclo()).put("curso", aux.getCurso())
					.put("grupo", aux.getGrupo()).put("género", aux.getGenero()).put("fecha nacimiento", aux.getFecha_nacimiento());
			listaAlumnosJSON[i]=ob1;
			i++;
		}
		introducirJSONAlArch();
	
	}
	public void introducirJSONAlArch() {
		JSONObject alumnosj= new JSONObject().put("alumnos", listaAlumnosJSON);
		try {
			Files.write(Paths.get("Alumnos.json"), alumnosj
					mensaje.toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
