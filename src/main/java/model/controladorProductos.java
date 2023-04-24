/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import CONTROLLERSS.controladoraPersistencia;
import java.util.List;
import javax.naming.NamingException;
import javax.transaction.SystemException;

/**
 *
 * @author Mery Acevedo
 */
public class controladorProductos {
    controladoraPersistencia cont_persis;

 public controladorProductos() 
 throws NamingException, SystemException {
 this.cont_persis = new controladoraPersistencia();
 }
 public void crearAlumno(productos producto){
 this.cont_persis.crearProducto(producto);
 }

 public List<productos> traerListaP(){
 return this.cont_persis.traerlistaProductos();
 }

 public productos traerp(int id){
 return this.cont_persis.traerProducto(id);
 }



 public void editarProducto(productos producto){
 this.cont_persis.EditarProducto(producto);
 }

 public void eliminarP(int id){
 this.cont_persis.eliminarProducto(id);
 }
}
