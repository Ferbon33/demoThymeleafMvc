package com.cursojava.clase13.entity;


public class Estudiantes {

    private int legajo;
    private String nombre;
    private String apellido;
    private String especialidad;

    public Estudiantes(int legajo, String nombre, String apellido, String especialidad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
