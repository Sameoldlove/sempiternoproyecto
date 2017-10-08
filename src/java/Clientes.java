/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *  POJO Tarea
 * @author alex
 */
public class Clientes {
    
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int fechadenacimiento;
    private int telefono;
    private String email;

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the nombre
     */
    public String getnombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getapellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getdireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getfechadenacimiento() {
        return fechadenacimiento;
    }

    /**
     * @param fechadenacimiento
     
     */
    public void setfechadenacimiento(int fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    
  public int gettelefono() {
        return telefono;
    }

    /**
     * @param telefono   
     */
    public void settelefono(int telefono) {
        this.telefono = telefono;
    }  
    
     public String getemail() {
        return email;
    }

    /**
     * @param email the nombre to set
     */
    public void setemail(String email) {
        this.email = email;
    }
}
