/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AccountDTO;
import DAO.AttachmentDAO;
import DAO.AttachmentDTO;
import DAO.BlogDAO;
import DAO.BlogDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet(name = "BlogEditServlet", urlPatterns = {"/BlogEditServlet"})
public class BlogEditServlet extends HttpServlet {

    private final String HOME_PAGE = "default";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String txtBlogID = request.getParameter("txtBlogID");
        ServletContext sc = request.getServletContext();
        HashMap<String, String> roadmap = (HashMap<String, String>) sc.getAttribute("ROADMAP");
        int blogID = 0;
        String url = "";
         boolean foundErr = false;
        String button = request.getParameter("btAction");
        if (null != txtBlogID) {
            blogID = Integer.parseInt(txtBlogID);
            BlogDAO blogDao = new BlogDAO();
            BlogDTO blogEdit = blogDao.getBlogFromBlogID(blogID);
            if (null == blogEdit) {
                //dieu huong 404
            } else {
                if (null == button || button.equals("Edit")) {

                    request.setAttribute("BLOG_EDIT", blogEdit);
                    url = "edit.jsp";

                } else if (button.equals("Update")) {
                    HttpSession session = request.getSession(true);
                    AccountDTO curUser = (AccountDTO) session.getAttribute("USER");
                    if (null != curUser) {
                        if (curUser.getAccountID() != blogEdit.getBlogID()) {
                            request.setAttribute("INVALID_USER", "You can not edit this blog !!! ");

                        }
                    }

                    String title = request.getParameter("txtTitle");
                    String content = request.getParameter("txtContent");
                    String categoryID = request.getParameter("categoryBox");
//                    String tags = request.getParameter("txtTags");

                   

                    if (title.trim().length() < 6 || title.trim().length() > 60) {
                        foundErr = true;
                        request.setAttribute("ERROR_TITLE", "title is required from 6 to 60 characters");
                    }

                    if (content.trim().length() < 10) {
                        foundErr = true;
                        request.setAttribute("ERROR_CONTENT", "Content is required at least 10 characters");
                    }
                    if (!blogEdit.getStatus().equals("AVAILABLE ")) {
                        foundErr = true;
                        request.setAttribute("STATUS_ERROR", "you can not edit your blog due to blog status is not availible ");
                    }

                    if (foundErr) {
                        url = roadmap.get("editPage");
                        RequestDispatcher rd = request.getRequestDispatcher(url);
                        rd.forward(request, response);
                    } else {

                        //4. Call DAO to insert to DB
                        Date postDate = new Date(Calendar.getInstance().getTime().getTime());

                        blogEdit.setPostDate(postDate);
                        blogEdit.setContent(content);
                        blogEdit.setCategoryID(categoryID);
//                        blogEdit.setTags(tags);
                        blogEdit.setTitle(title);

                        blogDao.updateBlog(blogID, blogEdit);
                        url = roadmap.get("blogPage");
                        RequestDispatcher rd = request.getRequestDispatcher(url);
                        rd.forward(request, response);

                    }
                    //ktrta rang buoc : id ton tai , title ,...  
                    // dieu huong sang blogDetail 
                    // loi : dieu huong jsp de hien loi
                }
            }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(BlogEditServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(BlogEditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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