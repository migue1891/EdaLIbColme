package practica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class EmpleadoCentro extends Empleado {
    
    private String idCentro;
    private String puesto;

    public EmpleadoCentro(String idEmpleado) {
        super(idEmpleado);
    }

    
    
    public EmpleadoCentro(String idEmpleado, String idCentro, String puesto, String Direccion, int telefono, int nSS, String turno, float sueldo) {
        super(idEmpleado, Direccion, telefono, nSS, turno, sueldo);
        this.idCentro = idCentro;
        if("limpieza".equals(puesto)||"administración".equals(puesto)||"seguridad".equals(puesto)||"atención al cliente".equals(puesto)||"OTRO".equals(puesto)){
          this.puesto = puesto;
        }else{System.out.println("No es un puesto existente.");}
    }

    public EmpleadoCentro(String idEmpleado, String idCentro, String puesto) {
        super(idEmpleado);
        this.idCentro = idCentro;
        if("limpieza".equals(puesto)||"administración".equals(puesto)||"seguridad".equals(puesto)||"atención al cliente".equals(puesto)||"OTRO".equals(puesto)){
            this.puesto = puesto;
        }else{System.out.println("No es un puesto existente.");}
    }

   

    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
       if("limpieza".equals(puesto)||"administración".equals(puesto)||"seguridad".equals(puesto)||"atención al cliente".equals(puesto)||"OTRO".equals(puesto)){
            this.puesto = puesto;
        }else{System.out.println("No es un puesto existente.");}
    }
    
    
    
    public String getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(String idCentro) {
        this.idCentro = idCentro;
    }
    
    
}
