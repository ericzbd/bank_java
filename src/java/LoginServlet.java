 /*******************************************************************************************************************************
* Class: CIST 2372 Java III
* Semester: Spring 2015
* Instructor: Ron Enz
* Description: Lab 5
* Due: 3/4/15
* @author Eric Horne
* @version 1.0
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
********************************************************************************************************************************
*/


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Business.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Eric
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {

                String id = request.getParameter("idtb");
                int iid = Integer.parseInt(id);
                String pw = request.getParameter("passwordtb");
 
                Customer c1 = new Customer();
                c1.selectDB(iid);
          //ABOVE CODE CREATES EMPTY CUSTOMER METHOD

                    if(c1.login(pw)){   
                        
                        HttpSession ses1;
                        
                        ses1 = request.getSession();

                      //  ses1.getAttribute(s1);
                        
                        out.println(
                                
                                "<!doctype html public \"-//W3C//DTD html 4.0 Transitional//EN\">\n" 
                        +       "<html>\n"
                        +       "<head>\n"
                        +       "<title>Valid Login</title>\n"
                        +       "</head>\n"
                        +       "<body>\n"
                        +       "<h2>VALID LOGIN</h2>"
                        +       "</body>\n"
                        +       "</html>\n"
                        
                        
                        );
                        
                        
            
              
                 
                }//end if
                    
                    else {
                        
                        out.println(
                                
                                "<!doctype html public \"-//W3C//DTD html 4.0 Transitional//EN\">\n" 
                        +       "<html>\n"
                        +       "<head>\n"
                        +       "<title>Invalid Login</title>\n"
                        +       "</head>\n"
                        +       "<body>\n"
                        +       "<h2>INVALID LOGIN</h2>"
                        +       "</body>\n"
                        +       "</html>\n"
                        
                        );                        
                        
                    }  
            
           
                
    }//end try
        catch (Exception e){System.out.println("Foiled");}
                
                
    
    }//end processRequest

       
   /*         if ("admin".equals(id) && "123".equals(pw)){

                response.sendRedirect("valid.jsp");


            }//end if
            
            else{
                response.sendRedirect("invalid.jsp");

            }
 
  */
        
     
    

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