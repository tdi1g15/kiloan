/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiloan.dispatcher;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.kiloan.item.*;
import com.kiloan.factory.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.jdo.PersistenceManager;

/**
 *
 * @author Tata
 */
public class Dispatcher extends HttpServlet {

    private static final Logger log = Logger.getLogger(Dispatcher.class.getName());

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String selectedScreen = request.getServletPath();

        String screen = selectedScreen + ".jsp";
        /*

        String firstName = request.getParameter("firstName");

        if (firstName == null) {
            log.info("get:No first name received");
        } else {
            log.info("get:First name is " + firstName);
        } */

        try {
            request.getRequestDispatcher(screen).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String screenSelected = request.getServletPath();

        if (screenSelected.equals("/ProductRegistered")) {
            if (request.getParameter("productName") == null) {
                screenSelected = "ErrorPage";
            } else {
                this.registerProduct(request.getParameter("productId"), request.getParameter("productName"),
                        request.getParameter("productDescription"), request.getParameter("productPrice"),
                        request.getParameter("productPicture"));
            }
        } else if (screenSelected.equals("/UserRegistered")) {
            String firstName = request.getParameter("firstName");
            if (firstName == null) {
                log.info("No first name received");
            } else {
                log.info("First name is " + firstName);
            }
        }

        String screen = screenSelected + ".jsp";

        try {
            request.getRequestDispatcher(screen).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void registerProduct(String productId, String productName,
            String productDescription, String price, String productPicture) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date date = new java.util.Date();

        Product product = new Product(productId, productName, productDescription, Float.parseFloat(price), productPicture, dateFormat.format(date));

        PersistenceManager pm = PMF.get().getPersistenceManager();
        try {
            pm.makePersistent(product);
        } finally {
            pm.close();
        }
    }
}
