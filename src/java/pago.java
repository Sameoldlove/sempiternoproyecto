/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class pago {
    private int fecha;
    private int cantidad ;
    private int cliente_pago ;
    private int modo_pago;
    private int cantidad_productos ;
    
      public int getfecha() {
        return fecha;
    }

    /**
     * @param fecha the id_cliente to set
     */
    public void setfecha(int fecha) {
        this.fecha = fecha;
    }
    
      public int getcantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the id_cliente to set
     */
    public void setcantidad(int cantidad) {
        this.cantidad= cantidad;
    }
    
      public int getcliente_pago() {
        return cliente_pago;
    }

    /**
     * @param cliente_pago the id_cliente to set
     */
    public void setcliente_pago(int cliente_pago) {
        this.cliente_pago = cliente_pago;
    }
    
      public int getmodo_pago() {
        return modo_pago;
    }

    /**
     * @param modo_pago the id_cliente to set
     */
    public void setmodo_pago(int modo_pago) {
        this.modo_pago = modo_pago;
    }
    
      public int getcantidad_productos() {
        return cantidad_productos;
    }

    /**
     * @param cantidad_productos the id_cliente to set
     */
    public void setcantidad_productos(int cantidad_productos) {
        this.cantidad_productos= cantidad_productos;
    }
}
