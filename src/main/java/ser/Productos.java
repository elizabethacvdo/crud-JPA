/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.productos;

/**
 *
 * @author Estudiante
 */
@WebServlet(name = "Productos", urlPatterns = {"/Productos"})
public class Productos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action)
        {
            case "findOne":
                findOne(request, response);
                break;
            case "findAll":
                findAll(request, response);
            case "delete":
                delete(request, response);
                findAll(request, response);
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action)
        {
            case "save":
                save(request, response);
                findAll(request, response);
                break;
            case "update":
                update(request, response);
                findAll(request, response);
                break;
            default :
                findAll(request, response);
                break;

        }
    }
/*
    public void save(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        productos productosnew = new productos();
        String nombre = request.getParameter("nombre");
       
        productos.save();


    }

    public void findAll(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CityService cityService = new CityService();
        List<Ciudad> ciudades = cityService.findAll();

        request.setAttribute("cities", ciudades);
        request.getRequestDispatcher("views/city/home.jsp").forward(request, response);
    }

    public void findOne(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CityService cityService = new CityService();
        String id = request.getParameter("id");
        Ciudad ciudad = cityService.findById(Long.parseLong(id));

        request.setAttribute("city", ciudad);
        request.getRequestDispatcher("views/city/update.jsp").forward(request, response);
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CityService cityService = new CityService();
        String ciudadId = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        Ciudad ciudad = new Ciudad( nombre);
        ciudad.setId(Integer.parseInt(ciudadId));
        cityService.update(ciudad);

    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CityService cityService = new CityService();
        String id = request.getParameter("id");
        cityService.delete(Long.parseLong(id));

    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *//*
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
