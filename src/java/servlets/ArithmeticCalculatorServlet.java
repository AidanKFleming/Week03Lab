
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

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("response", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
      
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String x = request.getParameter("x");
        String y = request.getParameter("y");
        String op = request.getParameter("operation");
        
        request.setAttribute("x", x);
        request.setAttribute("y", y);

        
        try {
            if (x == null || x.equals("") || y == null || y.equals("")) {
            request.setAttribute("response", "Invalid");
            } else {
                switch (op.charAt(0)) {
                    case '+':
                        request.setAttribute("response", Integer.parseInt(x)+Integer.parseInt(y));
                        break;
                    case '-':
                        request.setAttribute("response", Integer.parseInt(x)-Integer.parseInt(y));
                        break;
                    case '*':
                        request.setAttribute("response", Integer.parseInt(x)*Integer.parseInt(y));
                        break;
                    case '%':
                        request.setAttribute("response", Integer.parseInt(x)%Integer.parseInt(y));
                        break;
                    default:
                        request.setAttribute("response", "Invalid");
                        break;
                }
            }
        } catch (NumberFormatException ex) {
            request.setAttribute("response", "Invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    
    }

  
}
