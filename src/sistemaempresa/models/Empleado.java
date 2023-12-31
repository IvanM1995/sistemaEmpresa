/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaempresa.models;

/**
 *
 * @author Ivan
 */
public class Empleado {
    private double dni;
    private String nombreApellido;
    private Categoria categoria;
    private double sueldo;
    private Empresa empresa;

    public Empleado(int dni, String nombreApellido, Categoria categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public double getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash =  (int) (79 * hash + this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreApellido;
    }
    
}
