/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CategoriaDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SENA
 */
public class CtrProductoLi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ProductoDAO pdao = new ProductoDAO();
    CategoriaDAO cdao = new CategoriaDAO();
    List<Producto> productos = new ArrayList();
    List<CategoriaDAO> categoria = new ArrayList();
    //List<Carrito>listacarrito = new ArrayList();
    Usuario us;
    int cantidad;
    int idp;
    int subtotal;
    int item;
    int totalpagar;
    String nom, des, foto, idusu, fec, estado, idcliente;
    int pre, sto, cat, mon, idcli;
    Date d = new Date();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion= " + accion);
        HttpSession sesion = request.getSession();
        productos = pdao.listar();
        categoria = cdao.listar();
        System.out.println("producto " + productos.get(0).getFoto());
        Producto p = new Producto();
        //request.setAttribute("contador", listacarrito.size());
        switch (accion) {

            case "home":
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("Administrador")) {
                        request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                    } else {
                        if (sesion.getAttribute("tipo").equals("Cliente")) {
                            request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                        }
                    }
                } else {
                    System.out.println("entro en inicio");
                    request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                }

                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
     */
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
