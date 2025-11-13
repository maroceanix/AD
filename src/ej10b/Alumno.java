package ej10b;

import java.time.LocalDate;

public class Alumno  {
	int nia;
	String nombre, apellidos, ciclo, curso, grupo;
	char genero;
	LocalDate fecha_nacimiento;
	
	Alumno(){
		
	}
	
	Alumno(int nia, String nom, String ape, String ciclo, String curso, String grupo, char gen, int dia, int mes, int anio){
		this.nia=nia;
		this.nombre=nom;
		this.apellidos=ape;
		this.ciclo=ciclo;
		this.curso=curso;
		this.grupo=grupo;
		this.genero=gen;
		this.fecha_nacimiento=LocalDate.of(anio, mes, dia);
	}
	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "{Nia: " + nia + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Ciclo: " + ciclo
				+ ", Curso: " + curso + ", Grupo: " + grupo + ", Genero: " + genero + ", Fecha_nacimiento: "
				+ fecha_nacimiento+"\n}";
	}
}