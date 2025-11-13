package ej10b;

import java.util.ArrayList;


public class Gestion {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnos=new ArrayList<>();
		alumnos.add(new Alumno(44, "Mar", "Morales Palop", "DAM", "Segundo", "A", 'h', 30, 01, 1999));
		alumnos.add(new Alumno(9, "OAGFH", "Morales Palop", "DAM", "Segundo", "A", 'm', 17, 02, 2002));
		alumnos.add(new Alumno(80, "Haskg", "Morales Palop", "DAM", "Segundo", "B", 'm', 20, 9, 1995));
		alumnos.add(new Alumno(11, "Si", "Morales Palop", "DAW", "Segundo", "A", 'h', 06, 07, 2000));
		alumnos.add(new Alumno(12, "Mar", "Morales Palop", "DAM", "Primero", "C", 'm', 21, 01, 2004));
		
		TransforJSON T=new TransforJSON(alumnos);
		
	}

}
