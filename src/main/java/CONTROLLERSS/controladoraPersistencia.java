/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLERSS;

import CONTROLLERSS.exceptions.RollbackFailureException;
import java.util.List;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.transaction.SystemException;
import model.inventario;
import model.productos;

/**
 *
 * @author Estudiante
 */
public class controladoraPersistencia {
    productosJpaController productoJpa;
    inventarioJpaController inventarioJpa;
    


 public controladoraPersistencia() throws NamingException, SystemException {
 this.productoJpa = new productosJpaController();
 this.inventarioJpa = new inventarioJpaController();
 };

 //Sirve para agregar nuevos p
public void crearProducto(productos producto) {
 try {
 this.productoJpa.create(producto);
 } catch (Exception ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);

 }
};

    public void crearInventario(inventario inventarios) {
 try {
 this.inventarioJpa.create(inventarios);
 } catch (Exception ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);

 }
};
    
    public List<productos> traerlistaProductos() {
return this.productoJpa.findproductosEntities();
    } 
    
    
    public List<inventario> traerlistaInventarios() {
return this.inventarioJpa.findinventarioEntities();
    }  
    
    public productos traerProducto(int id) {
return this.productoJpa.findproductos(id);
 }
    
    public inventario traerInventario(int id) {
return this.inventarioJpa.findinventario(id);
 }   

 //actualiza la información de un alumno
 public void EditarProducto(productos producto) {
 try {
 this.productoJpa.edit(producto);
 } catch (RollbackFailureException ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
 } catch (Exception ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
 }
 }

 //elimina un alumno en especifico
 public void eliminarProducto(int id) {
 try {
 this.productoJpa.destroy(id);
 } catch (RollbackFailureException ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
 } catch (Exception ex) {
 Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
    
    
    
    
}
