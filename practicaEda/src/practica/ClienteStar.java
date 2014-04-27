/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import Libreria.SListMod;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ClienteStar extends Cliente {
    
    
    private String nombre;
    private int idClienteStar;
    private SListMod comprados =new SListMod ();
   //Falta la fecha preguntar productosComprados en tutoria
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdClienteStar() {
        return idClienteStar;
    }

    public void setIdClienteStar(int idClienteStar) {
        this.idClienteStar = idClienteStar;
    }

    public SListMod<Producto> getComprados() {
        return comprados;
    }

    public void setComprados(SListMod<Producto> Comprados) {
        this.comprados = Comprados;
    }

  

    public ClienteStar(String nombre, int idClienteStar) {
        this.nombre = nombre;
        this.idClienteStar = idClienteStar;
    }
    public ClienteStar(){
    
    }
    public int calcPuntos(float precio){
        int puntos =0;
        if(precio<50){
            puntos= 1;
        }
        else if(50<=precio&&precio<=200){
            puntos=2;
        }
        else if(precio>200){
            puntos=3;
        }
        return puntos;
        
    }
    //TODA LA GESTION DE DESCUENTO CLIENTESTAR ESTA DIFERENTE A COMO SE ESPECIFICA EN EL DOCUMENTO 
    //PRIMERO PORQUE NO GUARDOLOS PUNTOS SINO QUE LOS CALCULO CON LOS METODOS GESTIODESCUENTO() Y CALCPUNTOS
    //EL PRODUCTO QUE USO ES UNA CLASE HIJO DE PRODUCTOS PARA ALMACENAR LA FECHA DE COMPRA.
    //TERMINAR Y PREGUNTAR TUTORIA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public int gestionDescuento(){
        int max=40; 
        int puntosAct=0;
        ProductoComprado prod;
        
        while(this.comprados.getSize()>0){
            prod= (ProductoComprado) this.comprados.getFirst();
            Producto prod1 = prod.getIdProducto();
            int puntos = this.calcPuntos(prod1.getPrecio());
           
            if((puntosAct+puntos)<=40){
                puntosAct=puntosAct+puntos;
                this.comprados.removeFirst();
            }
            //Aqui vamos a contemplar que cada 10 puntos son un 5% de descuento pero lo que y se va a proratear el resto
            //PEDIR TUTORIA
        }
                
        return puntosAct;
    }
    
    public void pagar(double precio){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres usar el descuento? S/N");
        boolean bandera=false;
        while(bandera==false){
            String resp = sc.next();
            if("S".equalsIgnoreCase(resp)){
                pagarDesc(precio);
                bandera=true;
            }else if("N".equalsIgnoreCase(resp)){
                pagarNoDesc(precio);
                bandera=true;
            }
        }
    }
    private void pagarNoDesc(double precio){
       
    
       System.out.println("Ha pagado: " + precio);
       
    }
    //Contemplamos si queremos pagarcon descuento calculando los puntos que se pueden utilizar y calcualando el descuento sobre el precio total    
    private void pagarDesc(double precio){
       
       int puntos = this.gestionDescuento();
       double desc = (double)puntos/200;
       double aDescontar=precio*desc;
       double precioDesc= (precio -aDescontar);
       System.out.println("Ha pagado: con el descuento de "+precio+" original y "+"Puntos "+puntos+" con descuentio : " + precioDesc);
       
    }
    
    public void insertarComprado(Producto producto){
        Date hoy = new Date();
        ProductoComprado prod =  new ProductoComprado(producto);
       prod.setFecha(hoy);
       this.comprados.addLast(prod);
    }
    
    @Override
    public void mostrarDatos(){
    
        System.out.println(this.idClienteStar);
        System.out.println(this.getNombre());
        System.out.println(this.gestionDescuento());   //SE VERIA COMO MAXIMO 40     
        
    }
    
   
}
