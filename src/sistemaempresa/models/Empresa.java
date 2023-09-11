/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaempresa.models;


import java.util.ArrayList;
import java.util.Objects;

public class Empresa {
      
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    
    public String mostrarEmpleados() {
        String lista = "";
        for (Empleado empleado : empleados) {
            lista += empleado + "\n";
        }
        return lista;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return razonSocial + " CUIT: " + cuit;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.razonSocial);
        hash = 83 * hash + this.cuit;
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
        final Empresa other = (Empresa) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        return true;
    }
        
    
}
