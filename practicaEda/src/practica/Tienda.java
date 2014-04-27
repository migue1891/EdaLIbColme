/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import Libreria.SListMod;

/**
 *
 * @author Miguel
 */
public class Tienda {

    private String nombre;
    private int idTienda;
    private float area;
    private Empleado[] empleados = new Empleado[10];//CAMBIAR
    private SListMod<Catalogo> catalogos = new SListMod();
    private SListMod<ProductoRopa> stock = new SListMod();
    private SListMod<Mostrador> mostradores = new SListMod();
    private int  alquiler;
    private boolean estado;

    public Tienda(String nombre, int idTienda, float area, int alquiler, boolean estado) {
        this.nombre = nombre;
        this.idTienda = idTienda;
        this.area = area;
        this.alquiler = alquiler;
        this.estado = estado;
        
    }

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public SListMod<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(SListMod<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public SListMod<ProductoRopa> getStock() {
        return stock;
    }

    public void setStock(SListMod<ProductoRopa> stock) {
        this.stock = stock;
    }
    

    public float getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//REVISAR EL METODO DE ABAJO NO ME GUSTA!!
    public SListMod getProductos(){
        SListMod todProductos = new SListMod();
        for(int i=0; i<this.stock.getSize();i++){
            todProductos.addLast(this.stock.getAt(i));
        }
        return todProductos;
    }
    public ProductoRopa getProductoAt(int index){
    return (ProductoRopa) this.stock.getAt(index);
    }
    
    public void generarStock(SListMod todProductos){
        int contador=0;
        while(todProductos.getSize()<=contador){
            for(int i=0; i<this.catalogos.getSize(); i++){
            ProductoRopa prod1 =(ProductoRopa)todProductos.getAt(contador);
            if(this.catalogos.getAt(i).getIdTipo()==prod1.getIdTipo()){
               
                stock.addLast(prod1);
            }
            contador++;
        }
        }
    }

    
    // Este metodo agrupa todos los elementos segun idProducto y los Mete en una lista y los elimina del stock(caja grande desordenada)
    //Creamos un objeto mostrador por cada grupo 
    //llamamos al metodo en mostrador que se encarga de organozar el producto por estantes y percheros
    //insertamos el objeto mostrador en la lista de mostradores de la tienda
    public void generarMostradores(){
        int contador=0;
        while(this.stock.getSize()>0){
            Mostrador nMostrador = new Mostrador(contador);
            SListMod<ProductoRopa> prodMTipo=new SListMod();
            ProductoRopa prod = this.stock.getFirst();
            this.stock.removeFirst();
            prodMTipo.addLast(prod);
            //Aqui tenemos en cuenta si el producto era el ultimo de del stock para dejarlo como producto suelto en un estan---continia en metodo nuevoMostrador
            if(this.stock.getSize()>0){
            //Este bucle va a recorrer el stock comprobando que el id del producto actual es igual al al seleccionado en el paso anterior
                //Cada vez que encuentre 1 producto lo borra del stock(que es la caja donde estan guardasdos de cualquier forma)
                //y lo inserta en la lista que agrupa
                //Despues ponemos el contador a 0 para recorrer la lista desde el nuevo primer nodo.
                
            int contadorInt=0;    
            while(contadorInt<=this.stock.getSize()){
                
                if(this.stock.getAt(contadorInt).getIdProducto()==prod.getIdProducto()){
                    
                    prodMTipo.addLast(this.stock.getAt(contadorInt));
                    this.stock.removeAt(contadorInt);
                    contador=0;
                }else{contador++;}
            }
            }
            nMostrador = nMostrador.nuevoMostrador(prodMTipo);
            this.mostradores.addLast(nMostrador);
            contador++;
        
        }
    }
  
}///EL MIERCOLES  23 HAY QUE HACER "TESTING""