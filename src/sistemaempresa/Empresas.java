/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaempresa;


import java.util.ArrayList;

public class Empresas {
      
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresas(String razonSocial, int cuit) {
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
        int hash = 5;
        hash = 53 * hash + this.cuit;
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
        final Empresas other = (Empresas) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        return true;
    }
        
    
}
