/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.SystemException;
import model.controladorProductos;
import model.productos;

/**
 *
 * @author Estudiante
 */
@WebServlet(name = "Productos", urlPatterns = {"/Productos"})
public class Productos extends HttpServlet {

    public controladorProductos cProductos;
    public productos p= new productos();

    public Productos() throws NamingException, SystemException {
        this.cProductos = new controladorProductos();
    }
    
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

 String accion=request.getParameter("accion");
 int id = 0;
 if(request.getParameter("id")!=null){
 id=Integer.parseInt(request.getParameter("id"));
 }

 List<productos> consultaGeneral=this.cProductos.traerListaP(); 
 switch(accion){
 case "con":
 request.setAttribute("productos",consultaGeneral);
 request.getRequestDispatcher("vistas/view_productos.jsp").forward(
request, response);
 break;

 case "mod":
 productos producto=this.calumno.traerAlumno(id );
 request.setAttribute("alumno",producto);
 request.getRequestDispatcher("vistas/upd_alumno.jsp").forward(request, response);
 break;


 case "del":
 this.calumno.eliminarAlumno(id);
 consultaGeneral=this.calumno.traerListaAlumnos();
 request.setAttribute("alumnos",consultaGeneral);
 request.getRequestDispatcher("vistas/view_alumno.jsp").forward(
request, response);
 break;

 case "add":
 List<Alumno> 
consultaUltimos=this.calumno.consultaUltimosAlumnos(5, 1);
consultaUltimos=this.calumno.consultaUltimosAlumnos(5, 1);
 request.setAttribute("alumnos",consultaUltimos);
 request.getRequestDispatcher("vistas/add_alumno.jsp").forward(r
equest, response);
 break;
 }

 }

  
}
