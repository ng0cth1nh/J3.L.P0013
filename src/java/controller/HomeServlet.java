/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MediaDao;
import dao.SushiDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Media;
import model.Sushi;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class HomeServlet extends HttpServlet {

    private static int PAGE_SIZE = 3;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        try {
            int pageIndex = 0;
            MediaDao mdao = new MediaDao();
            SushiDao sdao = new SushiDao();
            ArrayList<Media> mediaList = mdao.getMedia();
            Sushi defaultSushi = sdao.getDefaultSushi();
            if (request.getParameter("page") == null) {
                pageIndex = 1;
            } else {
                pageIndex = Integer.parseInt(request.getParameter("page"));
            }
            ArrayList<Sushi> sushiList = sdao.getSushis(pageIndex, PAGE_SIZE);
            request.setAttribute("pageIndex", pageIndex);
            request.setAttribute("totalPage", getTotalPage());
            request.setAttribute("defaultSushi", defaultSushi);
            request.setAttribute("sushis", sushiList);
            request.setAttribute("media", mediaList);
            request.getRequestDispatcher("views/home.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("views/home.jsp").forward(request, response);

        }

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

    public int getTotalPage() {

        SushiDao sdao = new SushiDao();
        int totalSushi = sdao.getTotalSushi();
        if (totalSushi / PAGE_SIZE == 0) {
            return totalSushi / PAGE_SIZE;
        } else {
            return (totalSushi / PAGE_SIZE) + 1;
        }

    }

}
