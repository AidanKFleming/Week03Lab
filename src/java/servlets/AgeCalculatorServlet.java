
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

/**
 *
 * @author 819466
 */

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
      
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        
        
        try {
            if (age == null || age.equals("")) {
            request.setAttribute("response", "You must give your current age");
            } else if (Integer.parseInt(age) >= 0) {
                request.setAttribute("response", "Your age next birthday will be " + (Integer.parseInt(age)+1));
            }
        } catch (NumberFormatException ex) {
            if (age == null || age.equals("")) {
            request.setAttribute("response", "You must give your current age");
            } else {
                request.setAttribute("response", "You must enter a number");
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    
    }

  
}
